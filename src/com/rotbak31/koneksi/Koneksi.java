package com.rotbak31.koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
public class Koneksi {
private static Connection con;
public Koneksi(){}
public static Connection getConnection(){
try{con=DriverManager.getConnection("jdbc:mysql://localhost/rotbak31_premium","root","");}
catch(SQLException e){JOptionPane.showMessageDialog(null,"Gagal Koneksi!");}
return con;
}}