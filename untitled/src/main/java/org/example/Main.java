package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        IRepository<Clients> clientsList = new ClientsRep();
        var newClient =new Clients ("Kasha", "Malasha", true);
        clientsList.addObj(newClient);
        List<Clients> clients = clientsList.getAll();
    }
}