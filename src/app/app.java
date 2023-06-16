
package app;

import servicie.AlumnoService;


public class app {


    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoService as = new AlumnoService();
        
        as.crearAlumno();
        as.notaFinal();
    }
    
}
