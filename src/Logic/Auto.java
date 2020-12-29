package Logic;

public class Auto extends Vehiculo  {

    private int puertas = 0;

    public Auto(String marca, String modelo,int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public void mostrarDatos() {
      
        String datosConFormato = "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + Integer.toString(getPuertas()) + " // Precio: $" + Auto.cambioFormatoPrecio(getPrecio());
       
        System.out.println(datosConFormato);
    }

    public int getPuertas() {
        return puertas;
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
