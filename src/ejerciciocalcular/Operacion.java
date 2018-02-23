
package ejerciciocalcular;

import java.util.Scanner;

public class Operacion {
    
    public void Estudiantes(){
        
        System.out.println("CALCULO DE PORCENTAJES");
        System.out.println("PROGRAMACION II");
        System.out.println("CURSO 301");
        
        double estudiantes = 240;
        double menores = 35;
        double porcentaje;
        
        porcentaje = (100/estudiantes)*menores;
        
        System.out.println("El porcentaje es: "+porcentaje+"%");
    }
    
    public void ConversionHoras(){
        Scanner leer = new Scanner(System.in);
        int horasTotales,semanas,dias,horas;
        
        System.out.println("Digite el numero de horas: ");
        horasTotales = leer.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 /24;
        horas = horasTotales%24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);

    }
    
    public void AreaCirculo(){
        Scanner leer = new Scanner(System.in);
        double areaCir;
        double pi = 3.14;
        double radio;
       
        
        
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
        
        areaCir = pi*Math.pow(radio,2);

        System.out.println("Area del circulo: "+areaCir);
    }
    
    public void Ecuacion(){
        Scanner leer = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double x1;
        double x2;
        
        System.out.println("a: ");
        a = leer.nextDouble();
        
        System.out.println("b: ");
        b = leer.nextDouble();
        
        System.out.println("c: ");
        c = leer.nextDouble();        
        
        if(Math.sqrt(Math.pow(b, 2) - (4*a*c)) >= 0){
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);

            System.out.println("Solucion X1: "+x1);
            System.out.println("Solucion X2: "+x2);
        }
        else System.out.println("Solucion Compleja");
      
    }
    
}
