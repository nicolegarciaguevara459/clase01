/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import util.Conexion;

/**
 *
 * @author UPEU
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conex();
    }
    public static void conex(){
        if(Conexion.getConexion()!=null){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}
