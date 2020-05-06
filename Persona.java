import java.util.Vector;
public class Persona{
    private int edad;
    private String nombre;
    private String lada;
    private String telefono;
    private String sexo;
    private String ciudad;
    private String apellidoP;
    private String apellidoM;
    
    
    public Persona( int edad, String nombre,String telefono,String lada,String sexo,String ciudad,String apellidoP,String apellidoM){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono=telefono;
        this.lada=lada;
        this.sexo=sexo;
        this.ciudad=ciudad;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCiudad(String ciudad){
      this.ciudad = ciudad;
    }
    public void setApellidoP(String apellido){
      apellidoP = apellido;
    }
     public void setApellidoM(String apellido){
      apellidoM= apellido;
    }
     public void setLada(String lada){
      this.lada= lada;
    }
     public void setTelefono(String telefono){
      this.telefono= telefono;
    }
    public void setSexo(String sexo){
      this.sexo= sexo;
    }
     public String getSexo(){
        return sexo;
    }
     public String getLada(){
        return lada;
    }
    
     public String getApellidoM(){
        return apellidoM;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public String getCiudad(){
        return ciudad;
    }
    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }
}
