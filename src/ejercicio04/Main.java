package ejercicio04;

import java.util.Scanner;

public class Main {

    // Declaramos el scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaramos las variables
        String nombre; // Variable que guarda el nombre del artículo
        double precioSinIva; // Variable que guarda el precio sin IVA del artículo
        int cuantosQuedan; // Variable que guarda cuantos artículos quedan en el almacén
        String tieneCupon; // Variable que guarda la respuesta del usuario
        int opcion; // Variable que guarda la opción que elige el usuario
        boolean salir = false; // Variable que guarda si el usuario quiere salir del programa

        // Pedimos los datos al usuario
        System.out.println("Introduce el nombre del artículo");
        nombre = sc.nextLine();
        System.out.println("Introduce el precio sin IVA del artículo");
        precioSinIva = sc.nextDouble();
        System.out.println("Introduce cuantos artículos quedan en el almacén");
        cuantosQuedan = sc.nextInt();

        // Creamos el objeto
        Articulo articulo1 = new Articulo(nombre, precioSinIva, cuantosQuedan);

        // Mostramos la información del artículo
        System.out.println(articulo1);

        // Hacemos un salto de línea estético
        System.out.println();

        System.out.println("Precio de venta al público: " + articulo1.getPVP() + "€");

        System.out.println("¿Tiene un cupón de descuento?");
        tieneCupon = sc.next();

        if (tieneCupon.equals("si") || tieneCupon.equals("Si")) {
            hacerDescuento(articulo1);
        }

        // Hacemos un salto de línea estético
        System.out.println();

        do {
            // Mostramos el menú por consola
            pintarMenu();

            opcion = sc.nextInt();

            // Según la opción que elija el usuario, se ejecutará una acción u otra
            switch (opcion) {
                case 1: { // Si elige la opción 1, se venderá el artículo
                    venderArticulo(articulo1);
                    System.out.println();
                    break;
                }
                case 2: { // Si elige la opción 2, se almacenará el artículo
                    almacenarArticulo(articulo1);
                    System.out.println();
                    break;
                }
                case 3: { // Si elige la opción 3, se saldrá del programa
                    System.out.println("Hasta luego");
                    salir = true;
                }
            }
        } while (!salir);
    }

    /**
     * Método que hará el descuento al artículo si el usuario lo desea
     * 
     * @param articulo : artículo al que se le va a hacer el descuento
     */
    public static void hacerDescuento(Articulo articulo) {
        double descuento; // Variable que guarda el descuento que se le puede hacer al artículo

        // Le pedimos al usuario que introduzca el descuento
        System.out.println("Introduce el descuento");
        descuento = sc.nextDouble();
        // Mostramos el precio con el descuento por pantalla
        System.out.println("Precio de venta al público con un descuento del " + descuento + "%: "
                + articulo.getPVPDescuento(descuento) + "€");
    }

    /**
     * Método que pinta el menú por pantalla
     */
    public static void pintarMenu() {
        System.out.println("Indique que desea hacer con el articulo");
        System.out.println("[1] Venderlo");
        System.out.println("[2] Almacenarlo");
        System.out.println("[3] Nada");
    }

    /**
     * Método que va a restar unidades al artículo que se le pasa por parámetro
     * 
     * @param articulo : artículo al que se le van a restar unidades
     */
    public static void venderArticulo(Articulo articulo) {
        // Declaramos las variables
        int cuantosVender; // Variable que guarda cuantos artículos se van a vender

        // Le pedimos al usuario que introduzca cuantas unidades quiere vender
        System.out.println("Introduce cuantas unidades quieres vender");
        cuantosVender = sc.nextInt();

        // Si el usuario quiere vender más unidades de las que hay en el almacén, le
        // mostramos un mensaje de error
        if (cuantosVender > articulo.getCuantosQuedan()) {
            System.out.println("No hay suficientes unidades en stock");
        } else { // Si no, le restamos las unidades que ha pedido y las mostramos por pantalla
            articulo.vender(cuantosVender);
            System.out.println("Quedan en stock " + articulo.getCuantosQuedan() + " unidades del artículo");
        }
    }

    /**
     * Método que va a sumar unidades al artículo que se le pasa por parámetro
     * 
     * @param articulo : artículo al que se le van a sumar unidades
     */
    public static void almacenarArticulo(Articulo articulo) {
        int cuantosAlmacenar; // Variable que guarda cuantos artículos se van a almacenar

        // Le pedimos al usuario que introduzca cuantas unidades quiere almacenar
        System.out.println("Introduce cuantas unidades quieres almacenar");
        cuantosAlmacenar = sc.nextInt();

        // Sumamos las unidades que ha pedido y las mostramos por pantalla
        articulo.almacenar(cuantosAlmacenar);
        System.out.println("Quedan en stock " + articulo.getCuantosQuedan() + " unidades del artículo");
    }
}
