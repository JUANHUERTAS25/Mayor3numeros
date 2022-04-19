/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Mayor3numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,z, mayor;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y:"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite z:"));
        
        if(x > y && x > z){
            mayor = x;        
        }
        else if(y > x && y > z){
            mayor = y;
        }
        else {
            mayor = z;
        }
        
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + mayor, "POO", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }   
}
