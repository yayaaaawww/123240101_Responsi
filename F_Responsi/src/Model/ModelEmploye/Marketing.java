/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ModelEmploye;

/**
 *
 * @author Lab Informatika
 */
public class Marketing extends ModelEmploye implements Scoretable{
    private static final float MIN_SCORE = 85.0f;
    
    public Marketing(String nama, int nilai_target, int nilai_disiplin, int nilai_inovasi) {
        setNama(nama);
        setDivisi("Enginerr / IT");
        setNilai_target(nilai_target);
        setNilai_disiplin(nilai_disiplin);
        setNilai_inovasi(nilai_inovasi);
        setNilai_akhir(calculateScore());
        setStatus(promosiStatus());
        
    }
    
    @Override 
    public float calculateScore() {
        return ((getNilai_target() * 0.5f) + (getNilai_disiplin() * 0.3f) + (getNilai_inovasi() * 0.2f));
    }
    
    @Override
    public String promosiStatus() {
        return calculateScore() >= MIN_SCORE ? "PROMOSI" : "TETAP";
    }
   }
