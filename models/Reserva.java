
package titoshotel.models;
import java.util.Date;

public class Reserva {
    private int id;
    private int numReserva;
    private Date checkIn;
    private Date checkOut;
    private Habitacion oHabitacion;
    private Pasajero oPasajero;
    private int senia;
    
    //Constructor
    
    public Reserva(int id,int numReserva, Date checkIn,Date checkOut,Habitacion oHabitacion,Pasajero oPasajero, int senia){
    this.id=id;
    this.numReserva=numReserva;
    this.checkIn=checkIn;
    this.checkOut=checkOut;
    this.oHabitacion=oHabitacion;
    this.oPasajero=oPasajero;
    this.senia=senia;
}
    
   // Getters
    
    public int getid(){
        return this.id;
    }
    public int getNumReserva(){
        return this.numReserva;
    }
    public Date getCheckIn(){
        return this.checkIn;
    }
    public Date getCheckOut(){
        return this.checkOut;
    }
    public Habitacion getOHabitacion(){
        return this.oHabitacion;
    }
    public Pasajero getOPasajero(){
        return this.oPasajero;
    }
    public int getSenia(){
        return this.senia;
    }
    //Setters
    
    public void setId(int newId){
        id=newId;
    }
    public void setNumReserva(int newNumReserva){
        numReserva=newNumReserva;
    }
    public void setCheckIn(Date newCheckIn){
        checkIn=newCheckIn;
    }
    public void setCheckOut(Date newCheckOut){
        checkIn=newCheckOut;
    }
    public void setOHabitacion(Habitacion newOHabitacion){
        oHabitacion=newOHabitacion;
    }
    public void setOPasajero(Pasajero newOPasajero){
        oPasajero=newOPasajero;
    }
    public void setSenia(int newSenia){
        senia=newSenia;
    }
    
    // toString
    
    public String toString(){
        return "Reserva[id"+id+
                ",numReserva="+numReserva+
                ",checkIn="+checkIn+
                ",checkOut="+checkOut+
                ",oHabitacion="+oHabitacion+
                ",oPasajero="+oPasajero+
                ",senia="+senia+
                "]";
    }
    
    // equals
    
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        Reserva aux=(Reserva)obj;
        if(this.id!=aux.id){
            return false;
        }
        if(this.numReserva!=aux.numReserva){
            return false;
        }
        if(this.checkIn!=aux.checkIn){
            return false;
        }
        if(this.checkOut!=aux.checkOut){
            return false;
        }
        if(this.oHabitacion!=aux.getOHabitacion()){
            return false;
        }
        if(this.oPasajero!=aux.getOPasajero()){
            return false;
        }
        if(this.senia!=aux.senia){
            return false;
        }
    
        return true;
    }
}
