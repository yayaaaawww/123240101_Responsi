/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ModelEmploye;

import java.util.*;
import Model.Connector;
import java.sql.*;


/**
 *
 * @author Lab Informatika
 */
public class DAOEmploye implements interfaceDAOEmploye{
   

    @Override
    public boolean insert(ModelEmploye employe) {
        String sql = "INSERT INTO evaluasi (nama, divisi, nilai_target, nilai_disiplin, nilai_inovasi, nilai_akhir, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = Connector.getConnection().prepareStatement(sql)){
            ps.setString(1, employe.getNama());
            ps.setString(2, employe.getDivisi());
            ps.setInt(3, employe.getNilai_target());
            ps.setInt(4, employe.getNilai_disiplin());
            ps.setInt(5, employe.getNilai_inovasi());
            ps.setFloat(6, employe.getNilai_akhir());
            ps.setString(7, employe.getStatus());
            
        } catch (SQLException e) {
            System.err.println("Gagal Insert : " + e.getMessage());
        }return false;
    }

    @Override
    public List<ModelEmploye> getAll() {
        List<ModelEmploye> list = new ArrayList<>();
    String sql = "SELECT * FROM  evaluasi";
        try (Statement st = Connector.getConnection().createStatement();
                ResultSet rs = st.executeQuery(sql)){
                ModelEmploye employe = new ModelEmploye(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("divisi"),
                        rs.getInt("nilai_taget"),
                        rs.getInt("nilai_disiplin"),
                        rs.getInt("nilai_inovasi"),
                        rs.getInt("nilai_akhir"), //kak gatau kenapa padahal yang lain float tapi dia kalo getFloat jadi merah
                        rs.getString("status")
                );
               list.add(employe);
        } catch (SQLException e) {
            System.err.println("Gagal Insert : " + e.getMessage());
        }return list;
    }

    @Override
    public boolean update(ModelEmploye employe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
// ini juga kenapa merah habis aku kasih jarnya ya kak?? 
