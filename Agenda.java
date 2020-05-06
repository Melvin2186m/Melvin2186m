import java.util.Vector;
import java.lang.Math;
import java.util.*; 
public class Agenda{
    
 
    Vector<Persona> personas = new Vector<Persona>(100);
    private String Lada []={"951","955","599","233","125","944"};
    private String ciudad[]={"Aguascalientes","Baja California","Baja California Sur","Campeche","Chiapas","Chihuahua","Coahuila",
            "Colima","Distrito Federal","Durango","Estado de México","Guanajuato","Guerrero","Hidalgo","Jalisco",
            "Jalisco","Jalisco","Michoacán","Morelos","Nayarit","Nayarit","Nuevo León","Oaxaca","Puebla","Querétaro",
            "Quintana Roo","San Luis Potosí","Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatan",
            "Zacatecas"};
    private String nombreM[]={"Maria","Monserrat","Ariana","Jany","Isabel","Melissa","Nancy","Jazmin","Yesenia","Linda","Salma"};

    private String nombreH[]={"Melvin","Amos","Tomas","Uziel","Kevin","Uriel","Cesar","Aaron","Daniel","Juan","Elias","Pedro"};

    private String apellidos[]={"Hernandez","Garcia","Espinoza","Zarate","Arrasola","Cueva","Juarez","Lopez","Aragon","Blanco"};
    
    public void crearperPer(){
        
        for(int i=0;i<600;i++)
            if(getRandomNumero(20,100)%2==0){
            String lada=Lada[getRandomNumero(0,Lada.length-1)];
            String numerotel =lada+"123"+ getRandomNumero(1000,9000);
            personas.add( new Persona(getRandomNumero(10,90),
            nombreM[getRandomNumero(0, nombreM.length - 1)],
            numerotel,lada,"femenino",ciudad[getRandomNumero(0,ciudad.length-1)],
            apellidos[getRandomNumero(0,apellidos.length-1)],apellidos[getRandomNumero(0,apellidos.length-1)]
            )
            
            );
        }else{
            String lada=Lada[getRandomNumero(0,Lada.length-1)];
            String numerotel =lada+"123"+ getRandomNumero(1000,9000);
            personas.add(new Persona(getRandomNumero(10,90), 
            nombreH[getRandomNumero(0, nombreH.length - 1)],
            numerotel,lada,"Masculino",ciudad[getRandomNumero(0,ciudad.length-1)],
            apellidos[getRandomNumero(0,apellidos.length-1)],apellidos[getRandomNumero(0,apellidos.length-1)]
            ));
        }
        }
    
    private int getRandomNumero(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public Vector<Persona> getPersonas(){
       return personas;
    }
}

