/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagnosa;

/**
 *
 * @author User
 */
public class Diagnosa {
    private String kodePenyakit;
    private String namaPenyakit;
    private String penyebab;
    private String solusi;

    public Diagnosa(String kodePenyakit, String namaPenyakit, String penyebab, String solusi) {
        this.kodePenyakit = kodePenyakit;
        this.namaPenyakit = namaPenyakit;
        this.penyebab = penyebab;
        this.solusi = solusi;
    }

    // getter and setter
    public String getKodePenyakit() {
        return kodePenyakit;
    }

    public void setKodePenyakit(String kodePenyakit) {
        this.kodePenyakit = kodePenyakit;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }

    public String getPenyebab() {
        return penyebab;
    }

    public void setPenyebab(String penyebab) {
        this.penyebab = penyebab;
    }

    public String getSolusi() {
        return solusi;
    }

    public void setSolusi(String solusi) {
        this.solusi = solusi;
    }
}

