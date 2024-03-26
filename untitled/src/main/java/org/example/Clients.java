package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Clients")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_client")
    private long id_client;
    @Column(name= "name")
    private String name;


    @Column(name= "surname")
    private String surname;
    @Column(name ="exist")
    private boolean exist;
    public Clients(){
    }
    public Clients(String name, String surname, boolean exist) {
        this.name = name;
        this.surname = surname;
        this.exist = exist;
    }

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id_client=" + id_client +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", exist=" + exist +
                '}';
    }
}
