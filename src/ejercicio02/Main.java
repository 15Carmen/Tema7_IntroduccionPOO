package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Cervantes", 5, 0);

        //Pido prestado dos libros
        System.out.println("Voy a pedir prestado dos libros");
        libro.prestamo();
        libro.prestamo();
        System.out.println("Numero de ejemplares prestados: "+libro.numPrestados);

        //Devuelvo un libro
        System.out.println();
        System.out.println("Voy a devolver un libro");
        libro.devolucion();
        System.out.println("Numero de ejemplares prestados: "+libro.numPrestados);



    }
}
