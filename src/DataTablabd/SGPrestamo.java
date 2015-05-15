package DataTablabd;
public class SGPrestamo {

    int cedula;
    int idLibro;
    String fPrestamo;
    String fEntrega;
    String Multa;
     
    
    public SGPrestamo(){
    }

    public SGPrestamo(int cedula, int idLibroString, String fPrestamo, String fEntrega, String Multa) {
        this.cedula = cedula;
        this.idLibro = idLibro;
        this.fPrestamo = fPrestamo;
        this.fEntrega = fEntrega;
        this.Multa = Multa;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    public int getidLibro() {
        return idLibro;
    }

    public void setidLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    
    
    
       public String getfPrestamo() {
        return fPrestamo;
    }

    public void setfPrestamo(String fPrestamo) {
        this.fPrestamo =  fPrestamo;
    }
    
    
    
    
         public String getfEntrega() {
        return fPrestamo;
    }

    public void setfEntrega(String fEntrega) {
        this.fEntrega =  fEntrega;
    }
    
   
    
    
             public String getMulta() {
        return Multa;
    }

    public void setMulta(String Multa) {
        this.Multa =  Multa;
    }
    
    
    
    
    
    
   }

  