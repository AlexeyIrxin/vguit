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
    @Table(name="Downloaded")
    public class Downloaded implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="CodeUser")
        private int CodeUser;
        
        @Column(name="LoginUser")
        private String LiginUser;
        
        @Column(name="NameBook")
        private String NameBook;
        
        @Column(name="Added")
        private int Added;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCodeUser() {
        return CodeUser;
    }

    public String getLiginUser() {
        return LiginUser;
    }

    public String getNameBook() {
        return NameBook;
    }

    public int getAdded() {
        return Added;
    }

    public void setCodeUser(int CodeUser) {
        this.CodeUser = CodeUser;
    }

    public void setLiginUser(String LiginUser) {
        this.LiginUser = LiginUser;
    }

    public void setNameBook(String NameBook) {
        this.NameBook = NameBook;
    }

    public void setAdded(int Added) {
        this.Added = Added;
    }

    public Downloaded(int CodeUser, String LiginUser, String NameBook, int Added) {
        this.CodeUser = CodeUser;
        this.LiginUser = LiginUser;
        this.NameBook = NameBook;
        this.Added = Added;
    }

    public Downloaded() {
    }
        
        

        
        @Override
        public String toString() {
            return String.format("(%d, %d, %s,  %s,  %s)", this.Added, this.CodeUser, this.LiginUser, this.NameBook, this.id);
        }
    }

