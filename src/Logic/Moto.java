package Logic;

public class Moto extends Vehiculo  {
    
    private int cilindrada = 0;

    public Moto(String marca, String modelo,int cilindrada ,double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos() {
        String datosConFormato = "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + Integer.toString(getCilindrada()) + "cc // Precio: $" + Moto.cambioFormatoPrecio(getPrecio());
       
        System.out.println(datosConFormato);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    
}
