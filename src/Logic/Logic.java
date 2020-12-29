package Logic;

import java.util.ArrayList;
import java.util.List;

public class Logic  {
    

    public Vehiculo vehiculoMasCaro(List<Vehiculo> listaVehiculos) {
        
        Vehiculo masCaro = listaVehiculos.get(0);
        
         for(Vehiculo vehiculo: listaVehiculos){

            if (masCaro.getPrecio() <= vehiculo.getPrecio()) {
                masCaro = vehiculo;
            }
           
        }
        
        return masCaro;
    }

    public Vehiculo vehiculoMasBarato(List<Vehiculo> listaVehiculos) {
        
        Vehiculo masBarato = listaVehiculos.get(0);
        
         for(Vehiculo vehiculo: listaVehiculos){
             
            if (masBarato.getPrecio()>= vehiculo.getPrecio()) {
                masBarato = vehiculo;
            }
           
        }
 
         return masBarato;
    }

    public void imprimirListaVehiculos(List<Vehiculo> listaVehiculos) {
        for(Vehiculo vehiculo: listaVehiculos){
        
            vehiculo.mostrarDatos();
           
        }     
    }

    public List<Vehiculo> letraEnModelo(List<Vehiculo> listaVehiculos, String letra) {
        List<Vehiculo> listaLetraEnModelo = new ArrayList<>();
        
        listaVehiculos.forEach((vehiculo) -> {
            for (int i = 0; i < vehiculo.getModelo().length(); i++) {
                
                if ( letra.charAt(0) == vehiculo.getModelo().charAt(i)) {
                    listaLetraEnModelo.add(vehiculo);                  
                }
            }
        });
        
        
        return listaLetraEnModelo;

    }

    public void imprimirVehPorLetra(List<Vehiculo> listaVehiculos, String letra) {
        List<Vehiculo> listaLetraEnModelo = new ArrayList<>();
        listaLetraEnModelo = letraEnModelo(listaVehiculos, letra);
        
        for(Vehiculo vehiculo: listaLetraEnModelo){
             
        System.out.println("Veheculo que contiene en el modelo la letra '"+ letra + "': " + vehiculo.getMarca()+ " " + vehiculo.getModelo() + " " + Vehiculo.cambioFormatoPrecio(vehiculo.getPrecio()));

           
        }
  
    }

    public void imprimirMarcaModelo(List<Vehiculo> listaVehiculos) {
        listaVehiculos.forEach((vehiculo) -> {
            System.out.println(vehiculo.getMarca()+" " +vehiculo.getModelo());
        });
        
    }

        
 


}