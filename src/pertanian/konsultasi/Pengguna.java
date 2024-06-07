/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian.konsultasi;

/**
 *
 * @author User
 */
import java.util.Date;
import java.util.List;

public class Pengguna extends Konsultasi implements KonsultasiInterface {

    public Pengguna(int idKonsul, Date tanggal, String idPengguna, String kodeDiagnosa) {
        super(idKonsul, tanggal, idPengguna, kodeDiagnosa);
    }

    @Override
    public void tambahKonsultasi(Konsultasi konsultasi) {
        // implementasi metode tambahKonsultasi
    }

    @Override
    public void ubahKonsultasi(Konsultasi konsultasi) {
        // implementasi metode ubahKonsultasi
    }

    @Override
    public void hapusKonsultasi(Konsultasi konsultasi) {
        // implementasi metode hapusKonsultasi
    }

    @Override
    public List<Konsultasi> cariKonsultasi(String kriteria) {
        // implementasi metode cariKonsultasi
        return null;
        // implementasi metode cariKonsultasi
    }
}
