/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author User
 */
public class database {
    private String dataBaseName = "pertanian";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    public database(){
    try {
        String location = "jdbc:mysql://localhost/"+dataBaseName;
        Class.forName("com.mysql.jdbc.Driver");
            
        connectionDB = DriverManager.getConnection(location, username, password);
        System.out.println("Sistem Terkoneksi");
        } 
        catch (Exception e) {
        System.out.println(e.getMessage());
        } 
    }
    
    public void simpanUji (String nik, String nama, String telp, String alamat){
        try{
    String sql = "insert into uji (nik, nama, telp, alamat) value(?, ?, ?, ?)";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, nik);
    perintah.setString(2, nama);
    perintah.setString(3, telp);
    perintah.setString(4, alamat);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Disimpan");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void ubahUji (String nik, String nama, String telp, String alamat){
        try{
    String sql = "update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, nama);
    perintah.setString(2, telp);
    perintah.setString(3, alamat);
    perintah.setString(4, nik);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Diubah");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void hapusUji (String nik, String nama, String telp, String alamat){
        try{
    String sql = "delete from uji where nik = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, nik);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Dihapus");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }

//Detail_Konsultasi
    public void simpanDetailKonsultasi (int id_detail, int id_konsul, String kode_gejala, String jawaban){
        try{
    String sql = "insert into detail_konsultasi (id_detail, id_konsul, kode_gejala, jawaban) value(?, ?, ?, ?)";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setInt(1, id_detail);
    perintah.setInt(2, id_konsul);
    perintah.setString(3, kode_gejala);
    perintah.setString(4, jawaban);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Disimpan");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void ubahDetailKonsultasi (int id_detail, int id_konsul, String kode_gejala, String jawaban){
        try{
    String sql = "update detail_konsultasi set id_konsul = ?, kode_gejala = ?, jawaban = ? where id_detail = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setInt(1, id_konsul);
    perintah.setString(2, kode_gejala);
    perintah.setString(3, jawaban);
    perintah.setInt(4, id_detail);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Diubah");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    } 
     public void hapusDetailKonsultasi (int id_detail, int id_konsul, String kode_gejala, String jawaban){
        try {
    String sql = "delete from detail_konsultasi where id = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setInt(1, id_detail);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Dihapus");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    } 
     public void dataDetailKonsultasi(){
        try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("Select * from detail_konsultasi ORDER BY id_detail  ASC");
             while (baris.next()) {
                 System.out.println(baris.getInt("id_detail")+" | "+
                         baris.getInt("id_konsul")+" | "+
                         baris.getString("kode_gejala")+" | "+
                         baris.getString("jawaban"));
            }     
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
     }
     
     public  void cariDetailKonsultasi(Integer ParamiDetailKonsultasi) {
         try {
             String sql = "Select * from detail_konsultasi where id_detail = ?";
             PreparedStatement perintah = connectionDB.prepareStatement(sql);
             perintah.setInt(1, ParamiDetailKonsultasi);
             ResultSet data = perintah.executeQuery();
             while (data.next()) {
                 System.out.println("id : "+data.getInt("id_detail"));
                 System.out.println("konsul : "+data.getInt("id_konsul"));
                 System.out.println("gejala : "+data.getInt("kode_gejala"));
                 System.out.println("jawaban : "+data.getInt("jawaban"));
             }
         } 
         catch (Exception e) {
         }
    }
//KONSULTASI
     public void simpanKonsultasi (int id_konsul, Date tanggal, String id_pengguna, String kode_diagnosa, Double nilai){
        try{
    String sql = "insert into konsultasi (id_konsul, tanggal, id_pengguna, kode_diagnosa, nilai) value(?, ?, ?, ?, ?)";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setInt(1, id_konsul);
    perintah.setDate(2, tanggal);
    perintah.setString(3, id_pengguna);
    perintah.setString(4, kode_diagnosa);
    perintah.setDouble(5, nilai);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Disimpan");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void ubahKonsultasi (int id_konsul, int tanggal, String id_pengguna, String kode_diagnosa, Double nilai){
        try{
    String sql = "update konsultasi set id_konsul = ?, kode_gejala = ?, jawaban = ? where id_detail = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setInt(1, tanggal);
    perintah.setString(2, id_pengguna);
    perintah.setString(3, kode_diagnosa);
    perintah.setDouble(4, nilai);
    perintah.setInt(5, id_konsul);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Diubah");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    } 
     public void hapuskonsultasi (int id_konsul, Date tanggal, String id_pengguna, String kode_diagnosa, Double nilai){
        try{
    String sql = "delete from konsultasi where id_konsul = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setInt(1, id_konsul);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Dihapus");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
    }
  }
     public void dataKonsultasi(){
        try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("Select * from konsultasi ORDER BY id_konsul ASC ");
             while (baris.next()) {
                 System.err.println(baris.getInt("id_konsul")+" | "+
                         baris.getDate("tanggal")+" | "+
                         baris.getString("kode_gejala")+" | "+
                         baris.getString("kode_diagnosa")+" | "+
                         baris.getDouble("nilai"));
            }     
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
     public  void cariKonsultasi(Integer ParamiKonsultasi) {
         try {
             String sql = "Select * from konsultasi where id_konsul = ?";
             PreparedStatement perintah = connectionDB.prepareStatement(sql);
             perintah.setInt(1, ParamiKonsultasi);
             ResultSet data = perintah.executeQuery();
             while (data.next()) {
                 System.out.println("id : "+data.getInt("id_konsul"));
                 System.out.println("tanggal : "+data.getInt("tanggal"));
                 System.out.println("pengguna : "+data.getInt("id_pengguna"));
                 System.out.println("diagnosa : "+data.getInt("kode_diagnosa"));
                 System.out.println("nilai : "+data.getInt("nilai"));
             }
         } 
         catch (Exception e) {
         }
    }

//DIGNOSA
     public void simpanDiagnosa (String kode_penyakit, String nama_penyakit, String penyebab, String solusi){
        try{
    String sql = "insert into diagnosa (kode_penyakit, nama_penyakit, penyebab, solusi) value(?, ?, ?, ?)";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, kode_penyakit);
    perintah.setString(2, nama_penyakit);
    perintah.setString(3, penyebab);
    perintah.setString(4, solusi);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Disimpan");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void ubahDiagnosa (String kode_penyakit, String nama_penyakit, String penyebab, String solusi){
        try{
    String sql = "update diagnosa set nama_penyakit = ?, penyebab = ?, solusi = ? where kode_penyakit = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, nama_penyakit);
    perintah.setString(2, penyebab);
    perintah.setString(3, solusi);
    perintah.setString(4, kode_penyakit);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Diubah");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void hapusDiagnosa (String kode_penyakit, String nama_penyakit, String penyebab, String solusi){
        try{
    String sql = "delete from diagnosa where kode_penyakit = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, kode_penyakit);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Dihapus");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void dataDiagnosa(){
        try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("Select * from diagnosa ORDER BY kode_penyakit ASC ");
             while (baris.next()) {
                 System.out.println(baris.getString("kode_penyakit")+" | "+
                         baris.getString("nama_penyakit")+" | "+
                         baris.getString("penyebab")+" | "+
                         baris.getString("solusi"));
            }     
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
     }
     public  void cariDiagnosa(Integer ParamiDiagnosa) {
         try {
             String sql = "Select * from diagnosa where kode_penyakit = ?";
             PreparedStatement perintah = connectionDB.prepareStatement(sql);
             perintah.setInt(1, ParamiDiagnosa);
             ResultSet data = perintah.executeQuery();
             while (data.next()) {
                 System.out.println("kode : "+data.getInt("kode_penyakit"));
                 System.out.println("penyakit : "+data.getInt("nama_penyakit"));
                 System.out.println("penyebab : "+data.getInt("penyebab"));
                 System.out.println("solusi : "+data.getInt("solusi"));
             }
         } 
         catch (Exception e) {
         }
    }
    
    
// GEJALA
     public void simpanGejala (String kode_gejala, String nama_gejala, String keterangan, String gambar_ya, String gambar_tidak){
        try{
    String sql = "insert into gejala ( kode_gejala,  nama_gejala,  keterangan,  gambar_ya,  gambar_tidak) value(?, ?, ?, ?, ?)";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, kode_gejala);
    perintah.setString(2, nama_gejala);
    perintah.setString(3, keterangan);
    perintah.setString(4, gambar_ya);
    perintah.setString(5, gambar_tidak);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Disimpan");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void ubahGejala (String kode_gejala, String nama_gejala, String keterangan, String gambar_ya, String gambar_tidak){
        try{
    String sql = "update gejala set nama_gejala = ?, keterangan = ?, gambar_ya = ?, gambar_tidak = ? where kode_gejala = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, nama_gejala);
    perintah.setString(2, keterangan);
    perintah.setString(3, gambar_ya);
    perintah.setString(4, gambar_tidak);
    perintah.setString(5, kode_gejala);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Diubah");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void hapusGejala (String kode_gejala, String nama_gejala, String keterangan, String gambar_ya, String gambar_tidak){
        try{
    String sql = "delete from gejala where kode_gejala = ?";
    PreparedStatement perintah = connectionDB.prepareStatement(sql);
    perintah.setString(1, kode_gejala);
    perintah.executeUpdate();
    System.out.println("Data Berhasil Dihapus");
    }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    public void dataGejala(){
        try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("Select * from gejala ORDER BY kode_gejala ASC ");
             while (baris.next()) {
                 System.err.println(baris.getString("kode_gejala")+" | "+
                         baris.getString("nama_gejala")+" | "+
                         baris.getString("keterangan")+" | "+
                         baris.getString("gambar_ya")+" | "+
                         baris.getString("gambar)+_tidak"));
            }     
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
     public  void cariGejala(Integer ParamiGejala) {
         try {
             String sql = "Select * from gejala where kode_gejala = ?";
             PreparedStatement perintah = connectionDB.prepareStatement(sql);
             perintah.setInt(1, ParamiGejala);
             ResultSet data = perintah.executeQuery();
             while (data.next()) {
                 System.out.println("kode : "+data.getInt("kode_gejala"));
                 System.out.println("gejala : "+data.getInt("nama_gejala"));
                 System.out.println("keterangan : "+data.getInt("keterangan"));
                 System.out.println("Ya : "+data.getInt("gambar_ya"));
                 System.out.println("Tidak : "+data.getInt("gambar_tidak"));
             }
         } 
         catch (Exception e) {
         }
    }
}
    
