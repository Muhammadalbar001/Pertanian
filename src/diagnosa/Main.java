/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagnosa;

import CRUD.database;
import gui.FrameUtama;

 
/**
 *
 * @author User
 */

//import java.util.ArrayList;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// UJI
         new FrameUtama(). setVisible(true);
//        database dbConnect = new database();
        
//        dbConnect.simpanUji("2210010359", "Muhammad Alfin", "085435662716", "Jl.Kecubung");
//        dbConnect.ubahUji("2210010359", "Muhammad Albar", "083141886688", "Sungai Jingah");
//        dbConnect.hapusUji("2210010667", "", "", "");
        

// DETAIL KONSULTASI

//        dbConnect.simpanDetailKonsultasi(2, 001, "Busuk Akar", "Jamur");
//        dbConnect.ubahDetailKonsultasi(1, 99, "pusing", "Migran");
//        dbConnect.hapusDetailKonsultasi("1", "", "", "");
//        dbConnect.dataDetailKonsultasi();
//        dbConnect.cariDetailKonsultasi(1);

// KONSULTASI

//        dbConnect.simpanKonsultasi (01, tanggal, "001", "0909", 42.42);
//        dbConnect.ubahKonsultasi
//        dbConnect.hapusKonsultasi("1", "", "", "","");
//        dbConnect.dataKonsultasi(1);
// DIAGNOSA
//        dbConnect.simpanDiagnosa("01", "Hawar Daun", "Jamur", "Gunakan Fungsida yang sesuai dan terjadwal");
//        dbConnect.ubahDiagnosa("01", "Busuk Akar", "Jamur", "Perbaiki Drainese tanah, Hindari overwatering, dan gunakan pupuk yang tepat");
//        dbConnect.hapusDiagnosa("01", "", "", "");
//        dbConnect.dataDiagnosa(01);

// GEJALA
//        dbConnect.simpanGejala("11", "nama_gejala", "keterangan", "gambar_ya", "gambar_tidak");
//        dbConnect.ubahGejala("11", " layu", " kekeringan atau kelebihan air", " penyakit akar", "Tidak Mendapatkan Nutrisi yang cukup");
//        dbConnect.hapusGejala("11", "", "", "", "");
//        dbConnect.dataGejala(11);
// 
    }
} 
//    public static void main(String[] args) {
//        ArrayList<Diagnosa> daftarPenyakit = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Contoh data awal
//        daftarPenyakit.add(new Diagnosa("P001", "Demam", "Virus", "Minum banyak air dan istirahat cukup"));
//        daftarPenyakit.add(new Diagnosa("P002", "Flu", "Virus", "Istirahat dan minum obat flu"));
//
//        // Menampilkan data awal
//        tampilkanData(daftarPenyakit);
//
//        // Meminta input dari pengguna
//        System.out.println("Masukkan data penyakit baru:");
//        System.out.print("Kode Penyakit: ");
//        String kode = scanner.nextLine();
//        System.out.print("Nama Penyakit: ");
//        String nama = scanner.nextLine();
//        System.out.print("Penyebab: ");
//        String penyebab = scanner.nextLine();
//        System.out.print("Solusi: ");
//        String solusi = scanner.nextLine();
//
//        // Menambahkan data baru ke dalam ArrayList
//        daftarPenyakit.add(new Diagnosa(kode, nama, penyebab, solusi));
//
//        // Menampilkan data setelah penambahan
//        tampilkanData(daftarPenyakit);
//
//        scanner.close();
//    }
//
//    // Metode untuk menampilkan data penyakit dari ArrayList
//    private static void tampilkanData(ArrayList<Diagnosa> daftarPenyakit) {
//        System.out.println("Daftar Penyakit:");
//        for (Diagnosa penyakit : daftarPenyakit) {
//            System.out.println("Kode Penyakit: " + penyakit.getKodePenyakit());
//            System.out.println("Nama Penyakit: " + penyakit.getNamaPenyakit());
//            System.out.println("Penyebab: " + penyakit.getPenyebab());
//            System.out.println("Solusi: " + penyakit.getSolusi());
//            System.out.println("---------------------------------");
//        }
//    }

