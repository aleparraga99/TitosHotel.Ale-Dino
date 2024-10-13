
package titoshotel.models;


public class Pasajero {
    private int id;
    private String nombre;
    private String apellido;
    private int telefono;
    private int dni;
    private String correo;
    
    //Constructor
    
    public Pasajero(int id,String nombre,String apellido,int telefono,int dni,String correo){
    this.id=id;
    this.nombre=nombre;
    this.apellido=apellido;
    this.telefono=telefono;
    this.dni=dni;
    this.correo=correo;
}
    
   // Getters
    
    public int getid(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public int getDni(){
        return this.dni;
    }
    public String getCorreo(){
        return this.correo;
    }
    
    //Setters
    
    public void setId(int newId){
        id=newId;
    }
    public void setNombre(String newNombre){
        nombre=newNombre;
    }
    public void setApellido(String newApellido){
        apellido=newApellido;
    }
    public void setTelefono(int newTelefono){
        telefono=newTelefono;
    }
    public void setDni(int newDni){
        dni=newDni;
    }
    public void setCorreo(String newCorreo){
        correo=newCorreo;
    }
    
    // toString
    
    @Override
    public String toString(){
    return "Pasajero[id"+id+
            ",nombre="+nombre+
            ",apellido="+apellido+
            ",telefono="+telefono+
            ",dni="+dni+
            ",correo="+correo+
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
        Pasajero aux=(Pasajero)obj;
        if(this.id!=aux.id){
            return false;
        }
        if(this.nombre.equals(aux.nombre)==false){
            return false;
        }
        if(this.apellido.equals(aux.apellido)==false){
            return false;
        }
        if(this.telefono!=aux.telefono){
            return false;
        }
        if(this.dni!=aux.dni){
            return false;
        }
        if(this.correo.equals(aux.correo)==false){
            return false;
        }
    
        return true;
    }
}

