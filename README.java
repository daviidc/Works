import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {

        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese su calificación
        System.out.print("Digite su calificación entre un número mayor a cero y menor que 5: ");
        float nota = sc.nextFloat();

        // Validar que la calificación esté dentro del rango permitido
        if (nota < 0 || nota > 5) {
            System.out.println("Introduzca un valor válido");
        } else {
            // Determinar el desempeño según la calificación
            if (nota >= 0 && nota < 2.9) {
                System.out.println("Desempeño insuficiente");
            } else if (nota >= 2.9 && nota < 3.5) {
                System.out.println("Desempeño regular");
            } else if (nota >= 3.5 && nota < 4.5) {
                System.out.println("Desempeño bueno");
            } else {
                System.out.println("Desempeño excelente");
            }
        }
    }
}
        
