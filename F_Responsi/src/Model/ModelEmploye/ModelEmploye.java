/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ModelEmploye;

/**
 *
 * @author Lab Informatika
 */
public class ModelEmploye {
    private int id;
    private String nama;
    private String divisi;
    private int nilai_target;
    private int nilai_disiplin;
    private int nilai_inovasi;
    private float nilai_akhir;
    private String status;
    
    public ModelEmploye() {}
    
    public ModelEmploye (int id, String nama, String divisi, int nilai_target, int nilai_disiplin, int nilai_inovasi, int nilai_akhir, String status){
        this.id = id;
        this.nama = nama;
        this.nilai_target = nilai_target;
        this.nilai_disiplin = nilai_disiplin;
        this.nilai_inovasi = nilai_inovasi;
        this.nilai_akhir = nilai_akhir;
        this.status = status;
    }
    
    public ModelEmploye(String nama, String divisi, int nilai_taget, int nilai_disiplin, int nilai_inovasi, int nilai_akhir, String status) {
        this.nama = nama;
        this.nilai_target = nilai_target;
        this.nilai_disiplin = nilai_disiplin;
        this.nilai_inovasi = nilai_inovasi;
        this.nilai_akhir = nilai_akhir;
        this.status = status;
        
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public int getNilai_target() {
        return nilai_target;
    }

    public void setNilai_target(int nilai_target) {
        this.nilai_target = nilai_target;
    }

    public int getNilai_disiplin() {
        return nilai_disiplin;
    }

    public void setNilai_disiplin(int nilai_disiplin) {
        this.nilai_disiplin = nilai_disiplin;
    }

    public int getNilai_inovasi() {
        return nilai_inovasi;
    }

    public void setNilai_inovasi(int nilai_inovasi) {
        this.nilai_inovasi = nilai_inovasi;
    }

    public float getNilai_akhir() {
        return nilai_akhir;
    }

    public void setNilai_akhir(float nilai_akhir) {
        this.nilai_akhir = nilai_akhir;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
 
}
