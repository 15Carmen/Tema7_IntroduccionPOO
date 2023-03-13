package ejercicio03;

public class Punto {

    /**
     * Atributo que guarda la coordenada x del punto
     */
    int x;
    /**
     * Atributo que guarda la coordenada y del punto
     */
    int y;

    /**
     * Un constructor con parámetros que copie las coordenadas pasadas como argumento a los atributos del objeto.
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que imprime por pantalla las coordenadas del punto
     *
     * @return las coordenadas del punto en formato (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Método que modifica las coordenadas del punto
     *
     * @param x
     * @param y
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que desplaza el punto la cantidad indicada (dx,dy)
     *
     * @param dx
     * @param dy
     */
    public void desplazar(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Método que calcula la distancia entre dos puntos
     *
     * @param p
     * @return la distancia entre los dos puntos
     */
    public double distancia(Punto p) {
        //Declaro la variable
        double distancia;

        //Calculo la distancia entre los dos puntos
        distancia = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));

        return distancia;
    }

}
