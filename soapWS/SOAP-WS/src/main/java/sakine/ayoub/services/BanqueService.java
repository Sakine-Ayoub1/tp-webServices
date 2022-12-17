package sakine.ayoub.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import sakine.ayoub.entities.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWS")
public class BanqueService {

    @WebMethod
    public double convert(@WebParam double montant){
        return montant*10;
    }

    @WebMethod
    public Compte getCompte(@WebParam Long id){
        return new Compte(id,Math.random()*9800,new Date());
    }

    @WebMethod
    public List<Compte> comptes(){
        List<Compte> list=new ArrayList<>();
        list.add(new Compte(1L,Math.random()*9800,new Date()));
        list.add(new Compte(2L,Math.random()*9800,new Date()));
        list.add(new Compte(3L,Math.random()*9800,new Date()));
        return list;
    }
}
