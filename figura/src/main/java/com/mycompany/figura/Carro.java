/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Amnada Pilamonta <amandapilamonta1@gmail.com>
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
      // Crear un metodo main para que mande llamar al costructor 
    public static void main(String []args){
        //instancia mi clase
        Atributos objeto =new Atributos();
        //Nombre clase +objeto(variable)
        String propietario = JOptionPane.showInputDialog("Introduce el Propietario ");
          
        String valor = JOptionPane.showInputDialog("Introduce valor comercial");
        int valorcomercial = Integer.parseInt(valor);
        String color = JOptionPane.showInputDialog("Introduce el color ");
        String placa = JOptionPane.showInputDialog("Introduce la Placa ");
        String matriculado = JOptionPane.showInputDialog("Introduce Si esta matriculado ");
        String anio = JOptionPane.showInputDialog("Introduce Año de Matriculacion ");
        int aniofabricacion = Integer.parseInt(anio);
       
        objeto.setPropietario(propietario);
        objeto.setValorcomercial(valorcomercial);
        objeto.setColor(color);
        objeto.setMatriculado(matriculado);
        objeto.setAniofabricacion(aniofabricacion);
      

        JOptionPane.showMessageDialog(null, objeto.datos() + "\n"
                + objeto.calcularAnio() + "\n" );
// click derecho = format ( restroctura el codigo)
    
        
        
        
        
        
    }
    
}
