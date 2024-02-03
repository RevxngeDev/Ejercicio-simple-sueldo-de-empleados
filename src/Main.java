import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bono = (15890 * 10) / 100;
        double jubilacion = (35560.20 * 11) / 100;
        System.out.println("Que tipo de empleado es?: ");
        String Empleado = scanner.next();
        switch (Empleado){
            case "repositores":
                System.out.println("El sueldo es: $15.890 mas un bono del 10%, en total seria: " + (15890 + bono) );
                break;
            case "cajeros":
                System.out.println("El sueldo es: $25.630,89");
                break;
            case "supervisores":
                System.out.println("El sueldo es: $35.560,20 menos la jubilacion, en total seria: " + (35560.20 - jubilacion));
                break;
        }
    }
}