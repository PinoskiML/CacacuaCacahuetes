import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Saludar!");

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
        System.out.println("1.2");
        saludoNombre(greeting, name);  //1.2

        //1.3
        System.out.println("1.3");
        String resultadoReturn = saludoNombreConParametrosYReturn(greeting, name);
        System.out.println("Resultado return: " + resultadoReturn);




        //end of main
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
