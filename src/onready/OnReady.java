
package onready;

import Logic.Auto;
import Logic.Logic;
import Logic.Moto;
import Logic.Vehiculo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnReady {

    public static void main(String[] args) {
        //Aca tento los metodos donde guardo algunos metodos
        Logic logic = new Logic();
        //Instancio vehiculos
        Auto autoUno = new Auto ("Peugeot","206",4,200000);
        Moto motoUno = new Moto("Honda","Titan",125, 60000);
        Auto autoDos = new Auto("Peugeot", "208", 5, 250000);
        Moto motoDos = new Moto("Yamaha","YBR", 160, 80500.50);
        //Creo una lista de Vehiculos
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        //agrego vehiculos a mi lista
        listaVehiculos.add(autoUno);
        listaVehiculos.add(motoUno);
        listaVehiculos.add(autoDos);
        listaVehiculos.add(motoDos);
        
        //Busca el vehiculo mas caro de una lista de vehiculos
        Vehiculo masCaro =  logic.vehiculoMasCaro(listaVehiculos);
        //Busca el vehiculo mas barato de una lista de vehiculos
        Vehiculo masBarato = logic.vehiculoMasBarato(listaVehiculos);
        
        
        //imprimir
        
        logic.imprimirListaVehiculos(listaVehiculos);     
   
        System.out.println("=============================");
                
        System.out.println("Vehiculo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());
        System.out.println("Vehiculo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());
        //Hice un metodo para imprimir de una vez los vehiculos con consiga con la letra que elijan,
        //Este metodo imprimira todos los vehiculos que consiga con la letra que pasen como parametro
        //Dentro de logic existe logic.letraEnModelo(List<Vehiculos> List,String Letra) que solo busca
        logic.imprimirVehPorLetra(listaVehiculos, "Y");
        
        System.out.println("=============================");
        System.out.println("Vehiculo ordenado por precio de mayor a menor:");
        
        //ordena la lista por precio de mayor a menor por medio de una interfas y el metodo
        //compareTo.
        Collections.sort(listaVehiculos);
        logic.imprimirMarcaModelo(listaVehiculos);     

        
        
        }
    
}
