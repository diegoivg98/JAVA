package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseDatosPersonas implements AlmacenamientoDatos{
    
    

    @Override
    public Conjunto obtenerRut() {
        
        List ruts = new ArrayList();
        ruts.add(9999999);
        ruts.add(16789543);
        ruts.add(12258963);
        ruts.add(79408677);
        
        Conjunto cRut = new Conjunto();
        Iterator it = ruts.iterator();
        while(it.hasNext())            
            cRut.adicionarElemento(it.next());
        
        return cRut;        
    }

    @Override
    public MiMap datosPersonas() {
        MiMap m = new MiMap();
        m.adicionar(15597568, new Persona(15597568, "Pedro","Gonzalez", "pgonzalez@gmail.com", "34 oriente 1630"));
        m.adicionar(16789543, new Persona(16789543, "Juan", "Rojas", "jrojas@gmail.com", "11 oriente 530"));
        m.adicionar(12258963, new Persona(12258963, "Pablo", "Hernandez", "phernandez@gmail.com", "5 oriente 1120"));
        m.adicionar(79408677,new Persona(79408677, "Rodrigo", "Bernal", "rbernal@hotmail.com", "1 oriente S/n"));
        m.adicionar(9999999,new Persona(79408677, "Pepe", "Antartico", "pantartico@hotmail.com", "2 oriente S/n"));
        return m;
    
    }
    
}
