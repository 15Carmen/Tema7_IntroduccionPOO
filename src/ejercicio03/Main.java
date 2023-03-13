package ejercicio03;

public class Main {
    public static void main(String[] args) {

        //Creamos dos puntos
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(2, 4);

        //Imprimimos los puntos
        System.out.println("Punto1: " + punto1);
        System.out.println("Punto2: " + punto2);
        System.out.println();

        //Desplazamos el punto1
        System.out.println("Desplazamos el punto1");
        punto1.desplazar(2, 3);

        //Volvemos a imprimir el punto1
        System.out.println("Punto1: " + punto1);
        System.out.println();

        //Calculamos la distancia entre los dos puntos
        System.out.println("La distancia entre los puntos es: " + punto1.distancia(punto2));
    }
}
