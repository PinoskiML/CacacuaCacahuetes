import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Saludar!");

        System.out.println("1.1");
        saludoNombreSinParam();  //1.1
        Scanner sc = new Scanner (System.in);


        System.out.println("1.2");
        System.out.println("Saludo:");
        String greeting = sc.nextLine();

        System.out.println("Nombre: ");
        String name = sc.nextLine();
        //System.out.println(name);


        //saludoNombreSinParam();
        //System.out.println("1.2");
        saludoNombre(greeting, name);  //1.2

        //1.3
        System.out.println("1.3");
        String resultadoReturn = saludoNombreConParametrosYReturn(greeting, name);
        System.out.println("Método saluda con return: " + resultadoReturn);


        System.out.println("2.  Calcular ");

        String salir ="";
        do {
            mathSwitch();
            System.out.print("'S' para salir, cualquier otra tecla para continuar: ");
            salir = sc.nextLine();
        }  while (!salir.equalsIgnoreCase("S"));

        //3
        System.out.println("3. ");


        String comida = "";

        do {
            pideComida();
            System.out.print("Cual es la comida??");
            comida = sc.nextLine();
        } while (!comida.equalsIgnoreCase("cacahuete"));

        dormirse();


        //System.out.println("Laterz");
        sc.close();

        //end of main
    }

    private static void dormirse() {
        System.out.println("zzZZzzzzzZzzz....");
    }

    private static void pideComida() {
        System.out.println("CACATUA CACAHUETE!!");
    }

    private static void mathSwitch() {
        Scanner sc = new Scanner (System.in);
        System.out.println(" \n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir ");
   /*     int option;   DEPRECATED this is for numerical only

        try {
            option = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException numberFormatException){
            option = 5;   //triggers default
        }*/

        String option = sc.nextLine();


        switch (option){
            case "1":
            case "+":  //sumar
                try {

                    System.out.print("Primer numero: " );
                    double numA = Double.parseDouble(sc.nextLine());
                    System.out.print("Segundo numero: ");
                    double numB = Double.parseDouble(sc.nextLine());

                    double result = numA + numB;
                    System.out.println("El resultado es: " +result);
                } catch (NumberFormatException numberFormatException){
                    System.out.println("La entrada debe de ser dígitos: ");
                }break;

            case "2":  //Restar
            case "-":
                try {

                    System.out.print("Primer numero: ");
                    double numA = Double.parseDouble(sc.nextLine());
                    System.out.print("Segundo numero: ");
                    double numB = Double.parseDouble(sc.nextLine());

                    double result = numA - numB;
                    System.out.println("El resultado es :" +result);
                } catch (NumberFormatException numberFormatException){
                    System.out.println("La entrada debe de ser dígitos: ");
                }break;


            case "3":
            case "*":    //Multiplicar
                try {

                    System.out.print("Primer numero: ");
                    double numA = Double.parseDouble(sc.nextLine());
                    System.out.print("Segundo numero: ");
                    double numB = Double.parseDouble(sc.nextLine());

                    double result = numA * numB;
                    System.out.println("El resultado es :" +result);
                } catch (NumberFormatException numberFormatException){
                    System.out.println("La entrada debe de ser dígitos: ");
                }break;


            case "4":  // dividir
            case "/":
                try {

                    System.out.print("Primer numero: ");
                    double numA = Double.parseDouble(sc.nextLine());
                    System.out.print("Segundo numero: ");
                    double numB = Double.parseDouble(sc.nextLine());

                    double result = numA / numB;
                    System.out.println("El resultado es :" +result);
                } catch (NumberFormatException numberFormatException){
                    System.out.println("La entrada debe de ser dígitos: ");
                }break;

            default:
                System.out.println("Number must be between 1 and 4");
        }


    }

    //1.2
    private static void saludoNombreSinParam() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Saludo:");
        String greeting = sc.nextLine();

        System.out.println("Nombre: ");
        String name = sc.nextLine();

        System.out.println(greeting + " " + name);
    }

//1.2
    private static void saludoNombre(String saludo, String name) {
        System.out.println(saludo + " " + name);
    }

//1.3
    private static String saludoNombreConParametrosYReturn(String greeting, String name) {
        String saludoNombre = (greeting + " " + name + "1.3");
        return saludoNombre;
    }





}
