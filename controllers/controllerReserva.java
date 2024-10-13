
package titoshotel.controllers;
import java.util.List;
import titoshotel.models.Reserva;

public class controllerReserva {
    private List<Reserva> reservas;
    
    // Constructor
   
   public controllerReserva(List<Reserva> reservas){
       this.reservas=reservas;
   }

   // Getter
   
   public List<Reserva> getList(){
       return this.reservas;
   }
   
   // Setter
   
   public void setList(List<Reserva> newReservas){
       this.reservas=newReservas;
   }
}
