package Logic;

import java.text.DecimalFormat;

public class Vehiculo implements Comparable<Vehiculo>{
    public String marca;
    public String modelo;
    public double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    } 
   public void mostrarDatos(){};
   
    public static String cambioFormatoPrecio(double precio){
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
        return df.format(precio);
        
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
     public int compareTo(Vehiculo vehiculo) {
            if (precio > vehiculo.getPrecio()) {
                return -1;
            }
            if (precio < vehiculo.getPrecio()) {
                return 1;
            }
            return 0;
        }
    
}
