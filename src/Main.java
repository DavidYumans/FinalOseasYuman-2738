import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu=new Scanner(System.in);

        System.out.println("Seleccione el ejercicio que desea ejecutar: ");
        System.out.println("1.Numero Mayor");
        System.out.println("2.Concatenar parametros tipo texto");
        System.out.println("3.Operaciones");
        System.out.println("4.Numero Primo");
        System.out.println("5.Clase Estudiante");
        System.out.println("6.Crear Lista de estudiantes");
        System.out.println("7.Mostrar Lista de Estudiantes");

        int opc= menu.nextInt();

        switch (opc){
            case 1:
                System.out.println("Numero Mayor:");

                Scanner numero=new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                int num1=numero.nextInt();
                System.out.println("Ingrese el Segundo numero: ");
                int num2=numero.nextInt();
                System.out.println("Ingrese un tercer numero: ");
                int num3=numero.nextInt();

                NumeroMayor leer=new NumeroMayor(num1, num2, num3);
                int mayor= leer.ejercicio1();

                System.out.println("El numero mayor es: "+mayor);
                break;
            case 2:
                System.out.println("Concatenar Parametros Tipo Texto: ");
                break;
            case 3:
                System.out.println("Operaciones Logicas: ");
                break;
            case 4:
                System.out.println("Numero Primo: ");
                break;
            case 5:
                System.out.println("Clase Estudiante: ");
                break;
            case 6:
                System.out.println("Crear Lista de Estudiantes: ");
                break;
            case 7:
                System.out.println("Mostrar Lista de Estudiantes: ");
                break;
        }



    }
}