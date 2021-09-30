import java.util.ArrayList;

public class ControlCliente {

   
    private ArrayList <Cliente> list;

    Vista vi; //instanciar vista

    //constructor para la arrayList de objetos maestros
    ControlCliente(Vista vi){
        list = new ArrayList<Cliente>();
        this.vi = vi;
    }

    //Publicar menu
    public void Menucliente(){
        int op =0;

        while(op != 6){

            switch(vi.Menu()){
                case 1: addcliente();
                        imprimirCliente();
                        break;
                case 2: vi.imprimirSaldo(sumarSaldo((busquedaCliente(vi.pedirCuenta()))));
                        break;
                case 3: vi.imprimirSaldo(restarSaldo((busquedaCliente(vi.pedirCuenta()))));
                        break;
                case 4: int aux = busquedaCliente(vi.pedirCuenta());
                        int aux1 = busquedaCliente(vi.pedirDestino());
                        double aux2 = vi.realizarDeposito();
                        vi.imprimirSaldo(transferir(aux, aux1, aux2));
                        break;
                case 5: imprimirClientes(busquedaCliente(vi.pedirCuenta()));
                        break;
                case 6:op=6;break;
            }
        }
    }

    //agregar cliente
    public void addcliente(){
        list.add(0, new Cliente(vi.pedirNombre(), vi.pedirApellido(), vi.pedirCuenta()));
    }

    
    //imprimir info cliente creado
    public void imprimirCliente() {
        System.out.println(list.get(0));

    }

    //imprimir clientes
    public void imprimirClientes(int posicion) {
        if (posicion != -1) {
            System.out.println(list.get(posicion));
        } else{
            vi.error();
        }

    }
    
    public int busquedaCliente(int numCuenta) {

        for(int i= 0; i < list.size(); i++){
            if (numCuenta == list.get(i).getNumcuenta()) {
                
                return i;
            }
        }
        return -1;
    }

    public Double sumarSaldo(int posicion){
        if(posicion != -1) {
            double aux = vi.realizarDeposito();
            double aux1 = list.get(posicion).getSaldo();

            list.get(posicion).setSaldo(aux+aux1);

            return list.get(posicion).getSaldo();
        }

        return null;

    }

    public Double restarSaldo(int posicion) {
        if (posicion != -1) {
            double aux = vi.realizarRetiro();
            double aux1 = list.get(posicion).getSaldo();

            list.get(posicion).setSaldo(aux1 - aux);

            return list.get(posicion).getSaldo();
        }

        return null;

    }

    public Double transferir(int posicion1, int posicion2, double cantidad){
        if (posicion1 != -1 && posicion2 != -1) {
            
            double aux = list.get(posicion1).getSaldo();
            list.get(posicion1).setSaldo(aux - cantidad);

            double aux1 = list.get(posicion2).getSaldo();
            list.get(posicion2).setSaldo(aux1 + cantidad);

            return list.get(posicion1).getSaldo();
        } else {
            if(posicion1 == -1 && posicion2 != -1){
                return null;
            } else{
                if (posicion1 != -1 && posicion2 == -1) {
                    return null;
                }
            }
        }
        return null;
    }




}
