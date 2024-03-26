package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();
        long clientId = 11;
        IRepository<Clients> clientsList = new ClientsRep();
      /*Clients newCl = clientsList.find(clientId);
        newCl.setName("Ruslan");
        newCl.setExist(true);
        newCl.setSurname("Lavrentev");
        clientsList.addObj(new Clients ("Kasha", "Malasha", true));*/
      //  clientsList.update(newCl);
       // clientsList.delete(11);
        List<Clients> clients = clientsList.getAll();
        for(Clients cli: clients){
            FunctionsBD.ClientsOut(cli);
        }
    }
}