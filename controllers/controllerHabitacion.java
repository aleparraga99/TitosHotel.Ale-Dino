
package titoshotel.controllers;

import java.util.List;
import titoshotel.models.Habitacion;


public class controllerHabitacion {
   private List<Habitacion> habitaciones;
   
   // Constructor
   
   public controllerHabitacion(List<Habitacion> habitaciones){
       this.habitaciones=habitaciones;
   }

   // Getter
   
   public List<Habitacion> getList(){
       return this.habitaciones;
   }
   
   // Setter
   
   public void setList(List<Habitacion> newHabitaciones){
       this.habitaciones=newHabitaciones;
   }
}
