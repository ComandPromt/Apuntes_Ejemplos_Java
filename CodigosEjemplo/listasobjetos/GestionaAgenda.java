package listasobjetos;

public class GestionaAgenda{
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		Persona p= new Persona("Juan", "111");
		try{
			agenda.a�adePersona(p);
			p= new Persona("Antonio", "222");
			agenda.a�adePersona(p);
			p= new Persona("Manuel","333");
			agenda.a�adePersona(p);
			agenda.a�adePersona(p);
			agenda.borraPersona(p);
			agenda.a�adePersona(p);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(agenda.muestraListaPersona());
	}
}
