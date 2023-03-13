package ejercicio01;

public class CuentaCorriente {
    /**
     * Atributo que guarda el nombre del titular de la cuenta corriente
     */
    String nombre;
    /**
     * Atributo que guarda el dni del titular
     */
    final String DNI;
    /**
     * Atributo que guarda el saldo de la cuenta corriente
     */
    double saldo;

    /**
     * Constructor de la clase CuentaCorriente con todos los atributos
     * @param nombre
     * @param DNI
     * @param saldo
     */
    public CuentaCorriente(String nombre, String DNI, double saldo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    /**
     * Constructor de la clase CuentaCorriente con el atributo DNI y saldo
     * @param DNI
     * @param saldo
     */
    public CuentaCorriente(String DNI, double saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    /**
     * Método que saca tanto dinero de la cuenta corriente como se especifique por parámetro
     * @param cantidadSacar
     */
    public void sacarDinero(double cantidadSacar){
        if (saldo>0){
            if (saldo>cantidadSacar){
                saldo-=cantidadSacar;
            }else {
                System.out.println("No tiene suficiente saldo para sacresta cantidad de dinero");
            }
        }else {
            System.out.println("No tiene suficiente saldo para sacar dinero");
        }
    }

    /**
     * Precondición: El parámetro cantidadIngresar debe ser mayor que 0
     * Método que ingresa tanto dinero en la cuenta corriente como se especifique por parámetro
     * @param cantidadIngresar
     */
    public void ingresarDinero(double cantidadIngresar){
        saldo+=cantidadIngresar;
    }

    /**
     * Método que muestra la información de la cuenta corriente
     * @return
     */
    @Override
    public String toString() {
        String result="";
        result += "DNI: " + DNI + "\n";
        result += "Nombre: " + nombre + "\n";
        result += "Saldo: " + saldo;
        return result;
    }
}
