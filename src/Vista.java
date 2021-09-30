import java.util.Scanner;

public class Vista {

    private Scanner lectura;

    public Integer Menu() {

        lectura = new Scanner(System.in);

        System.out.println("***Menú para cliente del banco mexicano***");
        System.out.println("1- Agregar Cliente");
        System.out.println("2- Realizar deposito");
        System.out.println("3- Realizar Retiro");
        System.out.println("4- Realizar Transferencia");
        System.out.println("5- Busqueda de Cliente x Cuenta");
        System.out.println("6- Salir");
        System.out.println("Opcion: ");

        return lectura.nextInt();

    }

    //pedir datos del cliente
    public String pedirNombre() {
        lectura = new Scanner(System.in);

        System.out.println("Escriba el nombre del cliente: ");


        return lectura.nextLine();

    }

    public String pedirApellido() {

        lectura = new Scanner(System.in);

        System.out.println("Escriba el apellido del cliente: ");

        return lectura.nextLine();

    }
    public Integer pedirCuenta() {

        lectura = new Scanner(System.in);

        System.out.println("Escriba el número de cuenta del cliente: ");

        return lectura.nextInt();

    }

    public Integer pedirDestino() {

        lectura = new Scanner(System.in);

        System.out.println("Escriba el número de cuenta del usuario al que le quiere transferir: ");

        return lectura.nextInt();

    }

    public Double realizarDeposito() {

        lectura = new Scanner(System.in);

        System.out.println("Escriba la cantidad de dinero que quiere depositar");

        return lectura.nextDouble();

    }

    public Double realizarRetiro() {

        lectura = new Scanner(System.in);

        System.out.println("Escriba la cantidad que desea retirar");

        return lectura.nextDouble();

    }

    public void imprimirSaldo(Double nuevoSaldo){
        if(nuevoSaldo != null){
            if(nuevoSaldo <0){
                System.out.println("Fondos insuficientes para la acción");
            } else{
                System.out.println("Acción realizada con éxito");
                System.out.println("Su saldo es de $" + nuevoSaldo);
            }
            
        } else {
            System.out.println("Error: Número de cuenta no encontrado");
        }
    }

    public void error(){
        System.out.println("Error: Número de cuenta no encontrado");
    }


}