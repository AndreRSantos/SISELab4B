package cs.calc.server;

import javax.jws.WebService;
import javax.xml.ws.BindingProvider;
import java.net.SocketException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@WebService
public class Peer {
    static ConcurrentHashMap<String, String> listIP = new ConcurrentHashMap<String, String>();

    public Peer(){
        //Constructor
    }

    //Connect to machine that connected to us
    public ConcurrentHashMap<String, String> toPeer(String ip, String user){
        if (!listIP.containsKey(ip)){
            listIP.put(ip, user);

            ((BindingProvider) this).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                    "http://" + ip +":8090/calcservice");
        }

        return listIP;
    }

    //check all connections of a machine and add them if not yet added
    public void expand(ConcurrentHashMap<String, String> list) throws SocketException {
        //get own IP
        String own = "";
        try{own = Methods.ownIP();} catch (SocketException e){};

        for (String ip : list.keySet()){
            if (!listIP.contains(ip) && !ip.contentEquals(own)){
                listIP.put(ip, list.get(ip));

                ((BindingProvider) this).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        "http://" + ip +":8090/calcservice");
            }
        }
    }

    public static Collection<String> allUsers(){
        return listIP.values();
    }


}
