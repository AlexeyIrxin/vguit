/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.persistens;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, которая будет маппитьсяв БД
 * 
 * @author a.pleshkanev
 */
    @Entity
    @Table(name="Users")
    public class Users implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="lastname")
        private String lastname;
        
        @Column(name="firstname")
        private String firstname;
        
        @Column(name="birthdate")
        private String birthdate;
        
        @Column(name="login")
        private String login;
        
        @Column(name="password")
        private String password;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(String lastname, String firstname, String birthdate, String login, String password) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.login = login;
        this.password = password;
    }

    public Users() {
    }

    
        
        @Override
        public String toString() {
            return String.format("(%s, %s, %s,  %s,  %s,  %s)", this.birthdate, this.firstname, this.id, this.lastname, this.login, this.password);
        }
    }

