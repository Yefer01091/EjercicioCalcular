
package ejerciciocalcular;

import java.util.Scanner;

public class Main {
        public static void main(String [] args){
        
        Main main = new Main();
        main.menu();
        
    }
    
    public void menu(){
        Scanner leer = new Scanner(System.in);
        Operacion operacion = new Operacion();
        while(true){
            System.out.print("PROGRAMA CALCULO \n"
                    + "1.Porcentaje Estudiantes\n"
                    + "2.Conversion de horas\n"
                    + "3.Area del Circulo\n"
                    + "4.Ecuacion de segundo grado\n"
                    + "5.Salir\n"
                    + "opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:operacion.Estudiantes();
                break;
                case 2:operacion.ConversionHoras();
                break;
                case 3:operacion.AreaCirculo();
                break;    
                case 4:operacion.Ecuacion();
                break;    
            }
        }  
    } 
}
