package cs.calc.server;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.HashMap;

public class test {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> tes = new HashMap<String, String>();

        tes.put("123", "456");
        tes.put("124", "556");

        for (String a: tes.keySet()){
            System.out.println(a);
        }
        System.out.println(tes.values());

        System.out.println(InetAddress.getLocalHost());


        /*System.out.println(">");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name.substring(0, 7));
        System.out.println(name.substring(8));*/
    }
}
