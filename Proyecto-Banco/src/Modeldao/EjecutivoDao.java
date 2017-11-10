/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeldao;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Ejecutivo;

/**
 *
 * @author David
 */
public class EjecutivoDao{
    private static final String SQL_LISTAR=
            "SELECT * FROM listarejecutivo";
    
    private static final Conexion cnn=Conexion.saberEstado();

    public ArrayList<Ejecutivo> listar() {
    
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Ejecutivo> Ejecutivos= new ArrayList();
        try {
            ps=cnn.getCnn().prepareStatement(SQL_LISTAR);
            rs=ps.executeQuery();
            while(rs.next()){
                Ejecutivos.add(
                        new Ejecutivo(rs.getString("RUT"),
                                rs.getString("NOMBRE_COMPLETO"),
                                rs.getString("FECHA_CONTRATO")));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar ejecutivos"+ex.toString());
        }
        return Ejecutivos;
    }
}