/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbengkel;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Win 7
 */
public class Koneksi
{
    public Connection bukaKoneksi()
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null; 
        try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bengkel", "root", "");
        System.out.println("Berhasil Koneksi");
        return con;
    }
        catch(Exception e)
    {
        System.out.println("Gagal Koneksi"+e.getMessage());
        return con = null;
    }
    }
    public static void main(String[] args)
    {
        Koneksi objKoneksi = new Koneksi();
        objKoneksi.bukaKoneksi();
    }
}

