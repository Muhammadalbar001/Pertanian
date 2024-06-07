/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian.konsultasi;

/**
 *
 * @author User
 */
import java.util.List;

public interface KonsultasiInterface {
    void tambahKonsultasi(Konsultasi konsultasi);
    void ubahKonsultasi(Konsultasi konsultasi);
    void hapusKonsultasi(Konsultasi konsultasi);
    List<Konsultasi> cariKonsultasi(String kriteria);
}

