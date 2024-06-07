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

public class Konsultasi {
    private int idKonsul;
    private Date tanggal;
    private String idPengguna;
    private String kodeDiagnosa;

    public Konsultasi(int idKonsul, Date tanggal, String idPengguna, String kodeDiagnosa) {
        this.idKonsul = idKonsul;
        this.tanggal = tanggal;
        this.idPengguna = idPengguna;
        this.kodeDiagnosa = kodeDiagnosa;
    }
}
