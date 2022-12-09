/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jurge
 */
import Conexion.GestorBD;
import Views.CrearTablespace;
import Conexion.GestorBD;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminTableSpace {
    
    private GestorBD gestor= null;
    
    public AdminTableSpace(){
        this.gestor=new GestorBD();
    }
    
    public void CrearTableSpace(String Nombre, String Numero){
        String CrearTS="CREATE TABLESPACE " + Nombre + "DATAFILE 'C:\\Users\\jurge\\Desktop\\Datos_Proyecto\\ "+Nombre+".BDF' SIZE "+Numero+"M AUTOEXTEND;"; 
        
        
    }
    
    
    
    
    
    
}
