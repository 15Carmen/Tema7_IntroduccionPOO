package ejercicio02;

public class Libro {
    /**
     * Atributo que guarda el título del libro
     */
    String titulo;
    /**
     * Atributo que guarda el autor del libro
     */
    String autor;
    /**
     * Atributo que guarda el número de ejemplares del libro
     */
    static int numEjemplares;
    /**
     * Atributo que guarda el número de ejemplares prestados del libro
     */
    static int numPrestados;

    /**
     * Constructor de la clase Libro sin parámetros
     */
    public Libro() {
    }

    /**
     * Constructor de la clase Libro con todos los atributos
     * @param titulo
     * @param autor
     * @param numEjemplares
     * @param numPrestados
     */
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    /**
     * Método que devuelve si un libro se ha prestado o no
     * @return true si se ha prestado, false si no se ha prestado
     */
    public static boolean prestamo() {
        //Declaro las variables
        boolean prestado = false;

        //Si hay ejemplares disponibles, incremento el número de ejemplares prestados y decremento el número de ejemplares disponibles
        if (numEjemplares > 0) {
            numEjemplares--;
            numPrestados++;
            //Indico que el libro se ha prestado
            prestado = true;
        } else {    //Si no hay ejemplares disponibles, muestro un mensaje por pantalla
            System.out.println("No hay ejemplares disponibles");
        }
        //Devuelvo el valor de la variable prestado
        return prestado;
    }

    /**
     * Método que devuelve si un libro se ha devuelto o no
     * @return true si se ha devuelto, false si no se ha devuelto
     */
    public static boolean devolucion() {
        //Declaro las variables
        boolean devuelto = false;

        //Si hay ejemplares prestados, incremento el número de ejemplares disponibles y decremento el número de ejemplares prestados
        if (numPrestados > 0) {
            numEjemplares++;
            numPrestados--;
            //Indico que el libro se ha devuelto
            devuelto = true;
        } else {    //Si no hay ejemplares prestados, muestro un mensaje por pantalla
            System.out.println("No hay ejemplares prestados");
        }
        //Devuelvo el valor de la variable devuelto
        return devuelto;
    }



}
