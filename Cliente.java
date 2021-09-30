public class Cliente {
    //atributos
    private String nombre;
    private String apellido;
    private Integer numCuenta;
    private Double saldo;

    Cliente(){}

    Cliente(String nombre,String apellido,Integer numCuenta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
        this.saldo=0.0;
    }

    Cliente(String nombre, String apellido, Integer numCuenta,Double saldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    //setter y getter

    //nombre
    public void setNombre(String nombre){

        this.nombre= nombre;
    }

    public String getNombre(){

        return this.nombre;
    }

    //apellido
    public void setApellido(String apellido){

        this.apellido= apellido;
    }

    public String getApellido(){

        return this.apellido;
    }

    //Numero de cuenta
    public void setNumcuenta(Integer numCuenta){

        this.numCuenta= numCuenta;
    }

    public Integer getNumcuenta(){

        return this.numCuenta;
    }

    //Saldo
    public void setSaldo(Double saldo){

        this.saldo= saldo;
    }

    public Double getSaldo(){

        return this.saldo;
    }

    
    //sobrecarga del tostring en el objeto para dar su datos
    @Override
    public String toString() {
    return "Nombre: " + getNombre() + "\n" + "Apellido: "+ getApellido()+ "\n" + "Número de cuenta: " + getNumcuenta() + "\n"+"Saldo: "+getSaldo()+ "\n";
    }
}
