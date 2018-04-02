package listasobjetos;

public class GestionaAgenda{
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		Persona p= new Persona("Juan", "111");
		try{
			agenda.añadePersona(p);
			p= new Persona("Antonio", "222");
			agenda.añadePersona(p);
			p= new Persona("Manuel","333");
			agenda.añadePersona(p);
			agenda.añadePersona(p);
			agenda.borraPersona(p);
			agenda.añadePersona(p);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(agenda.muestraListaPersona());
	}
}
