package cs.calc.server;

import javax.swing.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String ip;
        System.out.println("Starting connection...");
        // initalize the instance of the remote object
        Peer connection = new Peer();

        //get own ip
        ip = Methods.ownIP();
            if (ip.contentEquals("")){
                System.out.println("ERROR: Your IP could not be found!");
                return;
            }

        // publish the object
        Endpoint.publish("http://" + ip + ":8090/calcservice", connection);
        System.out.println("Server is running");

        while (true){
            //wait for input
            System.out.println("\nInsert command: (-h for all commands)");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String command = reader.readLine();

            // handle input
            if(command.contentEquals("-h")){
                //list all possible commands
                System.out.println("exit - end the program");
                System.out.println("connect [ipV4 address] - connect to peer and all of it's connections");
                System.out.println("-ls - lists all users connected");
                System.out.println("Still working on this, sorry...");


            } else if(command.substring(0, 7).contentEquals("connect")) {
                String targetIP = command.substring(8);

                //Send client request to targetIP
                ((BindingProvider) connection).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        "http://" + targetIP + ":8090/calcservice");

                //Send ip to server so server can connect as client
                connection.toPeer(ip, System.getProperty("user.name"));

            }else if(command.contentEquals("-ls")){
                System.out.println(Peer.allUsers());

            } else if(command.contentEquals("exit")){
                break;
            } else {
                System.out.println("Command not recognised");
            }

        }

    }
}


