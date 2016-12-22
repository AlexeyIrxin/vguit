/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial;

import ru.vguit.tutorial.db.DBDerby;
import ru.vguit.tutorial.persistens.Books;
import ru.vguit.tutorial.persistens.Users;
import ru.vguit.tutorial.persistens.Downloaded;
import ru.vguit.tutorial.persistens.Needadd;
import ru.vguit.tutorial.persistens.Admins;
/**
 * Главный класс программы, представляет собой точку входа в программу
 *
 * @author a.pleshkanev
 */
public class Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DBDerby db = new DBDerby();

        Books book = new Books("PovelitelMuh", "WilliamGolding", "ACT", 2014);

        db.addBooks(book);

        
        DBDerby dbd = new DBDerby();

        Users user = new Users("Proskurin", "Artem", "16.09.1994", "Vinokur", "efc13sal");

        dbd.addUsers(user);
        
        
        DBDerby dbdo = new DBDerby();

        Downloaded download = new Downloaded(102, "Dzen", "Povelitel muh", 908);

        dbdo.addDownloaded(download);
        
        DBDerby dbnd = new DBDerby();

        Needadd add = new Needadd("Doctor who", "Messingem S", "ACT", 2016, 900);

        dbnd.addNeedadd(add);
        
        DBDerby dba = new DBDerby();

        Admins admin = new Admins("Lomakin", "Roman", "Alexeevich", "18.03.1997", "Koshach", "euc3ncu3", "Moderator");

        dba.addAdmins(admin);
        //Point pDataBase = db.find(1L);

       // System.err.println("X = " + pDataBase.getX() + "Y = " + pDataBase.getY());
    }

}
