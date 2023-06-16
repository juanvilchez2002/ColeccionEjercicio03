
package servicie;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    //creamos un arrayList de tipo Alumnos
    ArrayList<Alumno> alumnos;
    //consola
    Scanner consola;
    
    //inicializamos con el constructor
    public AlumnoService() {
        this.alumnos = new ArrayList();
        this.consola = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearAlumno(){
        
        String alumno;
        String op;
        int[] notas = new int[3];
        
        do{
            System.out.print("Ingrese nombre del alumno: ");
            alumno = consola.nextLine();
            System.out.println("Ingresa las notas: ");
            for(int i=0; i<notas.length; i++){
                System.out.print("nota ("+(i+1)+"): ");
                notas[i] = consola.nextInt();
            }
            
            consola.nextLine();
            System.out.println("");
            System.out.print("¿Desea ingresar otro alumno? (S/N): ");
            op=consola.nextLine();
            
            if(op.equalsIgnoreCase("n")){
                break;
            }
            System.out.println("");
        }while(true);
        
        
        alumnos.add(new Alumno(alumno, notas));
    }
    
    public void notaFinal(){
        
        System.out.print("Ingrese el nombre a calcular: ");
        String nombreABuscar = consola.nextLine();
        int sumaNotas = 0;
        for(Alumno nombre: alumnos){
            if(nombre.getNombre().equalsIgnoreCase(nombreABuscar)){
                System.out.println("encontrado");
                for(int i=0; i<nombre.getNotas().length; i++){
                    sumaNotas+=nombre.getNotas()[i];
                }
                System.out.println("El promedio de notas es: "+(sumaNotas/nombre.getNotas().length));
            }
        }
    }
}
