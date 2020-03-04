package com.helloworld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "contact")
public class Contact
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private  int id;

    @Column(name = "firstName")
    private  String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phone")
    private  String phone;

    public Contact(){
        this.firstName = null;
        this.lastName = null;
        this.phone = null;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Contact(int id,String firstName,String lastName,String phone){

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }




    public int getId()
    {
        return id;
    }


    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhone()
    {
        return phone;
    }
}
