package org.example;

public class FunctionsBD {
    public static void ClientsOut(Clients clients){
        System.out.println(clients.getId_client() + " " + clients.getName() + " " + clients.getSurname() + " " + clients.isExist());
    }
    public static void ClientsOutTrue(Clients clients){
        if (clients.isExist() == true) {
            System.out.println(clients.getId_client() + " " + clients.getName() + " " + clients.getSurname() + " " + clients.isExist());
        }
    }
    public static void ClientsOutFalse(Clients clients){
        if (clients.isExist() == false) {
            System.out.println(clients.getId_client() + " " + clients.getName() + " " + clients.getSurname() + " " + clients.isExist());
        }
    }
    public static void MastersOut(Masters masters){
        System.out.println(masters.getId_master() + " " + masters.getName() + " " + masters.getSurname());
    }

}
