import java.lang.Math;
import java.util.*;
public class Consulta{
    
 public Vector<Persona> buscarNombre(String nombre){
     Vector <Persona> nombreP=new Vector<Persona>();
     Agenda agenda= new Agenda();
     agenda.crearperPer();
     for(int i=0;i<agenda.getPersonas().size();i++){
        if(nombre.compareToIgnoreCase(agenda.getPersonas().get(i).getNombre())==0){
            nombreP.add(agenda.getPersonas().get(i));
        }
        
        
     }
        
     return nombreP;
    }
    public Vector<Persona> buscarHombresOmujeres(String sexo){
    Vector<Persona> buscar=new Vector<Persona>();
    Agenda agenda=new Agenda();
    agenda.crearperPer();
    if(sexo.compareToIgnoreCase("femenino")==0){
    for(int i=0;i<agenda.getPersonas().size();i++){
      if(sexo.compareToIgnoreCase(agenda.getPersonas().get(i).getSexo())==0){
        buscar.add(agenda.getPersonas().get(i));
        }
          }
    }else{
    for(int i=0;i<agenda.getPersonas().size();i++){
      if(sexo.compareToIgnoreCase(agenda.getPersonas().get(i).getSexo())==0){
        buscar.add(agenda.getPersonas().get(i));
    
    }
   }
  }
  return buscar;
  }
 public Vector<Persona> buscarCiudad(String ciudad){
    Vector<Persona> ciudadP=new Vector<Persona>(); 
    Agenda agenda=new Agenda();
    agenda.crearperPer();
    for(int i=0;i<agenda.getPersonas().size();i++){
      if(ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){
        ciudadP.add(agenda.getPersonas().get(i));
        }
    }
    return ciudadP;
    }
     public Vector<Persona> buscarapellido(String apellido){
    Vector<Persona> apellidoP=new Vector<Persona>(); 
    Agenda agenda=new Agenda();
    agenda.crearperPer();
    for(int i=0;i<agenda.getPersonas().size();i++){
      if(apellido.compareToIgnoreCase(agenda.getPersonas().get(i).getApellidoP())==0||
      apellido.compareToIgnoreCase(agenda.getPersonas().get(i).getApellidoM())==0){
        apellidoP.add(agenda.getPersonas().get(i));
        }
    }
    return apellidoP;
    }
     
     public Vector<Persona> buscarlada(String lada){
    Vector<Persona> ladaP=new Vector<Persona>(); 
    Agenda agenda=new Agenda();
    agenda.crearperPer();
    for(int i=0;i<agenda.getPersonas().size();i++){
      if(lada.compareToIgnoreCase(agenda.getPersonas().get(i).getLada())==0){
            ladaP.add(agenda.getPersonas().get(i));
        }
      }
      return ladaP;
   }
   public Vector<Persona> buscarApellidoyCiudad(String apellido,String ciudad){
    Vector<Persona> apellidoyCiudad=new Vector<Persona>(); 
    Agenda agenda=new Agenda();
    agenda.crearperPer();
    for(int i=0;i<agenda.getPersonas().size();i++){
        if(apellido.compareToIgnoreCase(agenda.getPersonas().get(i).getApellidoP())==0||
      apellido.compareToIgnoreCase(agenda.getPersonas().get(i).getApellidoM())==0){
        if(ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){
        apellidoyCiudad.add(agenda.getPersonas().get(i));
               }
         }
      }
    
    return apellidoyCiudad;
    }
    public Vector<Persona> buscarMayoresEdadyCiudad(String ciudad){
    Vector<Persona> buscarEdadCiudad=new Vector<Persona>(); 
    Agenda agenda=new Agenda();
    agenda.crearperPer();
     for(int i=0;i<agenda.getPersonas().size();i++){
        if(agenda.getPersonas().get(i).getEdad()>=18 &&
      ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){
        
        buscarEdadCiudad.add(agenda.getPersonas().get(i));
               }
         }
         return buscarEdadCiudad;
      }
     public Vector<Persona> buscarMujeresmayCiu(String ciudad){
     Vector<Persona> buscarEdadCiudad=new Vector<Persona>(); 
     Agenda agenda=new Agenda();
     String sexo="femenino";
     agenda.crearperPer();
     for(int i=0;i<agenda.getPersonas().size();i++){
       if(sexo.compareToIgnoreCase(agenda.getPersonas().get(i).getSexo())==0){ 
         if(agenda.getPersonas().get(i).getEdad()>=18 &&
      ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){
        
        buscarEdadCiudad.add(agenda.getPersonas().get(i));
               }
            }   
         }
         return buscarEdadCiudad;
      }
      public Vector<Persona> buscarHombresmayCiu(String ciudad){
     Vector<Persona> buscarEdadCiudad=new Vector<Persona>(); 
     Agenda agenda=new Agenda();
     agenda.crearperPer();
     for(int i=0;i<agenda.getPersonas().size();i++){
       if(agenda.getPersonas().get(i).getSexo().compareToIgnoreCase("masculino")==0){
      if(ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){ 
         if(agenda.getPersonas().get(i).getEdad()>=18 &&
      ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){
        
        buscarEdadCiudad.add(agenda.getPersonas().get(i));
               }
            }   
         }
        }
         return buscarEdadCiudad;
      }
      public Vector<Persona> sexoCiudadMayores(String ciudad,String sexo){
        Vector<Persona> Buscar=new Vector<Persona>();
        Agenda agenda=new Agenda();
        agenda.crearperPer();
        for(int i=0;i<agenda.getPersonas().size();i++){
       if(agenda.getPersonas().get(i).getEdad()>=18){
            if(ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0)
            if(sexo.compareToIgnoreCase(agenda.getPersonas().get(i).getSexo())==0){ 
          Buscar.add(agenda.getPersonas().get(i));
        }
      
    }
   }
    return Buscar;
  }
   public Vector<Persona> apellidoCiudadySexo(String apellido,String ciudad,String sexo){
        Vector<Persona> Buscar=new Vector<Persona>();
        Agenda agenda=new Agenda();
        agenda.crearperPer();
        for(int i=0;i<agenda.getPersonas().size();i++){
          if(apellido.compareToIgnoreCase(agenda.getPersonas().get(i).getApellidoP())==0
           || apellido.compareToIgnoreCase(agenda.getPersonas().get(i).getApellidoM())==0){
            if(ciudad.compareToIgnoreCase(agenda.getPersonas().get(i).getCiudad())==0){
            if(sexo.compareToIgnoreCase(agenda.getPersonas().get(i).getSexo())==0){ 
          Buscar.add(agenda.getPersonas().get(i));
        }
      }
    }
   }
    return Buscar;
  }
}

