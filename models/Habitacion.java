
package titoshotel.models;

import java.util.Objects;

public class Habitacion {
    private int id;
    private int numero;
    private int camasSingle;
    private int camasDobles;
    private int precio;
    
    
    //Constructor
    
    public Habitacion(int id,int numero,int camasSingle,int camasDobles,int precio){
    this.id=id;
    this.numero=numero;
    this.camasSingle=camasSingle;
    this.camasDobles=camasDobles;
    this.precio=precio;
}
    
   // Getters
    
    public int getid(){
        return this.id;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getCamasSingle(){
        return this.camasSingle;
    }
    public int getCamasDobles(){
        return this.camasDobles;
    }
    public int getPrecio(){
        return this.precio;
    }
    
    //Setters
    
    public void setId(int newId){
        id=newId;
    }
    public void setNumero(int newNumero){
        numero=newNumero;
    }
    public void setCamasSingle(int newCamasSingle){
        camasSingle=newCamasSingle;
    }
    public void setCamasDobles(int newCamasDobles){
        camasDobles=newCamasDobles;
    }
    public void setPrecio(int newPrecio){
        precio=newPrecio;
    }
    
    // toString
    
    @Override
    public String toString(){
    return "Habitacion[id="+id
            +",numero="+numero+
            ",camasSingle="+camasSingle+
            ",camasDobles="+camasDobles+
            ",precio="+precio+
            "]";    
    }
    // equals
    
    @Override
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
        Habitacion aux=(Habitacion)obj;
        if(this.id!=aux.id){
            return false;
        }
        if(this.numero!=aux.numero){
            return false;
        }
        if(this.camasSingle!=aux.camasSingle){
            return false;
        }
        if(this.camasDobles!=aux.camasDobles){
            return false;
        }
        if(this.precio!=aux.precio){
            return false;
        }
        return true;
    }
    
    }

        
    





