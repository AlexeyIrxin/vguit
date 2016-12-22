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
    @Table(name="Needadd")
    public class Needadd implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="name")
        private String name;
        
        @Column(name="author")
        private String author;
        
        @Column(name="publishing")
        private String publishing;
        
        @Column(name="year")
        private int year;

        @Column(name="codeadmin")
        private int codeadmin;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYear() {
        return year;
    }

    public int getCodeadmin() {
        return codeadmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCodeadmin(int codeadmin) {
        this.codeadmin = codeadmin;
    }

    public Needadd(String name, String author, String publishing, int year, int codeadmin) {
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.codeadmin = codeadmin;
    }

    public Needadd() {
    }

        
        
        @Override
        public String toString() {
            return String.format("(%s, %d, %s, %s, %s %d)", this.author, this.codeadmin, this.id, this.name, this.publishing, this.year);
        }
    }

