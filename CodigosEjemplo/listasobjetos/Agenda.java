package listasobjetos;

import java.util.*;
public class Agenda{
	
	private ArrayList<Persona> lista;
	
	Agenda(){
		lista = new ArrayList<Persona>();
	}
	
	public int añadePersona(Persona p) 
											throws AgendaExcepcion{
		if(buscaPersona(p.dameDNI())!=null)
			throw new AgendaExcepcion("La persona con el DNI "+p.dameDNI()+ " ya está en la lista");
		else
			lista.add(p);
			
		return lista.size();
	}
	
	public boolean borraPersona(Persona p){
		for( Persona i: lista)
			if(i.dameDNI().equals(p.dameDNI())){
				lista.remove(i);
				return true;
			}
			return false;
	}
	
	public String muestraListaPersona(){
		String temp="";
		for( Persona p: lista)
			temp += p.muestraPersona();
		return temp;
	}
	
	public Persona buscaPersona(String dNI){
		for( Persona p: lista)
			if(p.dameDNI().equals(dNI))
				return p;
		return null;
	}
}
