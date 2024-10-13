
package titoshotel.controllers;
import java.util.List;
import titoshotel.models.Pasajero;

public class controllerPasajero {
    private List<Pasajero> pasajeros;
    
    // Constructor
   
   public controllerPasajero(List<Pasajero> pasajeros){
       this.pasajeros=pasajeros;
   }

   // Getter
   
   public List<Pasajero> getList(){
       return this.pasajeros;
   }
   
   // Setter
   
   public void setList(List<Pasajero> newPasajeros){
       this.pasajeros=newPasajeros;
   }
}
