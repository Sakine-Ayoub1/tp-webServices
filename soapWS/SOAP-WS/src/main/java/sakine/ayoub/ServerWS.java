package sakine.ayoub;

import jakarta.xml.ws.Endpoint;
import sakine.ayoub.services.BanqueService;

public class ServerWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9000/",new BanqueService());
    }
}