package cuentacorriente;

/**
 *
 * @author Berta
 */
public class Main {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta1;
        double saldoActual;
        
        cuenta1 = new CuentaCorriente("Mariano Martinez","1001-5632-58-234567891",2500,0);
        try 
        {
            cuenta1.ingresar(150);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(1695);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al ingresar");
        }
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    
}
