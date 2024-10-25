import java.util.Scanner;

public class CensoFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int cantidadFamilias = scanner.nextInt();

        double[] agua = new double[cantidadFamilias];
        double[] luz = new double[cantidadFamilias];
        double[] gas = new double[cantidadFamilias];
        int[] estratos = new int[cantidadFamilias];

        for (int i = 0; i < cantidadFamilias; i++) {
            System.out.print("Ingrese el valor del agua para la familia " + (i + 1) + ": ");
            agua[i] = scanner.nextDouble();

            System.out.print("Ingrese el valor de la luz para la familia " + (i + 1) + ": ");
            luz[i] = scanner.nextDouble();

            System.out.print("Ingrese el valor del gas para la familia " + (i + 1) + ": ");
            gas[i] = scanner.nextDouble();

            System.out.print("Ingrese el estrato de la familia " + (i + 1) + " (1, 2 o 3+): ");
            estratos[i] = scanner.nextInt();
        }

        for (int i = 0; i < cantidadFamilias; i++) {
            double descuentoAgua = calcularDescuento(agua[i], estratos[i]);
            double descuentoLuz = calcularDescuento(luz[i], estratos[i]);
            double descuentoGas = calcularDescuento(gas[i], estratos[i]);

            double totalAgua = agua[i] - descuentoAgua;
            double totalLuz = luz[i] - descuentoLuz;
            double totalGas = gas[i] - descuentoGas;

            System.out.println("Familia " + (i + 1) + ":");
            System.out.println("Total a pagar por agua: " + totalAgua);
            System.out.println("Total a pagar por luz: " + totalLuz);
            System.out.println("Total a pagar por gas: " + totalGas);
            System.out.println();
        }

        scanner.close();
    }

    public static double calcularDescuento(double valor, int estrato) {
        double descuento = 0;
        if (estrato == 1) {
            descuento = valor * 0.20;
        } else if (estrato == 2) {
            descuento = valor * 0.15;
        } else if (estrato >= 3) {
            descuento = valor * 0.09;
        }
        return descuento;
    }
}

