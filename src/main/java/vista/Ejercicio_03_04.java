/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import vista.eleccion.CreateEleccion;
//import vista.dignidad.CreateDignidad;
import vista.candidato.CreateCandidato;
import vista.candidato.DeleteCandidato;
import vista.candidato.UpdateCandidato;
import vista.dignidad.CreateDignidad;
//import vista.candidato.DeleteCandidato;

/**
 *
 * @author ASUS
 */
public class Ejercicio_03_04 {

    public static void main(String[] args) {
        var v1 = new CreateCandidato();
        var v2 = new CreateDignidad();
        var v3 = new CreateEleccion();
        var v4 = new DeleteCandidato();
        var v5 = new UpdateCandidato();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
        v5.setVisible(true);
        
    }
}
