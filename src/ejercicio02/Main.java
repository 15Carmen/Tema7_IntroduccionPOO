package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Cervantes", 5, 0);

        //Pido prestado dos libros
        System.out.println("Voy a pedir prestado dos libros");
        Libro.prestamo();
        Libro.prestamo();
        System.out.println("Numero de ejemplares disponibles: "+ Libro.numEjemplares);
        System.out.println("Numero de ejemplares prestados: "+Libro.numPrestados);

        //Devuelvo un libro
        System.out.println();
        System.out.println("Voy a devolver un libro");
        Libro.devolucion();
        System.out.println("Numero de ejemplares disponibles: "+ Libro.numEjemplares);
        System.out.println("Numero de ejemplares prestados: "+Libro.numPrestados);



    }
}
