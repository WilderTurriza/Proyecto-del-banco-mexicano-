public class App {
    public static void main(String[] args) throws Exception {
        
        Vista vi = new Vista();

        ControlCliente Clie = new ControlCliente(vi);

        Clie.Menucliente();
    }
}
