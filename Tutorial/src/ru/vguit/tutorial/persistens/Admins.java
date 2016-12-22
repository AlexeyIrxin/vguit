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
    @Table(name="Admins")
    public class Admins implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="lastname")
        private String lastname;
        
        @Column(name="firstname")
        private String firstname;
        
        @Column(name="surname")
        private String surname;
        
        @Column(name="birthdate")
        private String birthdate;
        
        @Column(name="login")
        private String login;
        
        @Column(name="password")
        private String password;
        
        @Column(name="job")
        private String job;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
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

    public String getJob() {
        return job;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public void setJob(String job) {
        this.job = job;
    }

    public Admins(String lastname, String firstname, String surname, String birthdate, String login, String password, String job) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.birthdate = birthdate;
        this.login = login;
        this.password = password;
        this.job = job;
    }

    public Admins() {
    }

    
        
        @Override
        public String toString() {
            return String.format("(%s, %s, %s,  %s,  %s,  %s)", this.birthdate, this.firstname, this.surname, this.id, this.lastname, this.login, this.password, this.job);
        }
    }

