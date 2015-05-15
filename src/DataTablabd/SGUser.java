package DataTablabd;

public class SGUser {

    int cedula;
    String nombre;
    String correoelectronico;
    String telefono;
    String direccion;
     
    
    public SGUser(){
    }

    public SGUser(int cedula, String nombre, String correoelectronico, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correoelectronico = correoelectronico;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setCorreoElectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
    
    public String getCorreoElectronico() {
        return correoelectronico;
    }
    
   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getDirecccion() {
        return direccion;
    }
    
    
  }
    
    
       
    
    
    
    
    
    
    
    
      
    
  
    
    
    
