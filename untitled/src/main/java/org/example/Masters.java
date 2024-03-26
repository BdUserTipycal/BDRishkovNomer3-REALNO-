package org.example;

import javax.persistence.*;

@Entity
@Table(name ="Masters")
public class Masters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_master")
    private long id_master;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name ="exist")
    private boolean exist;
    public Masters(){
    }

    public Masters(String name, String surname, boolean exist) {
        this.name = name;
        this.surname = surname;
        this.exist = exist;
    }

    public long getId_master() {
        return id_master;
    }

    public void setId_master(long id_master) {
        this.id_master = id_master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Masters{" +
                "id_master=" + id_master +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", exist=" + exist +
                '}';
    }
}
