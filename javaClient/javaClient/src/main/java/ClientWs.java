import proxy.BanqueServiceService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {

        BanqueWS stub=new BanqueServiceService().getBanqueWSPort();
        System.out.println(stub.convert(100));

        Compte compte=stub.getCompte(5L);
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());
    }
}