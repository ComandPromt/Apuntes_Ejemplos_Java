package juegos;
public class Juego_Oca_Completo {
	
		public static void main(String[] args) {
		Dado d1=new Dado();
	String Cadena;
	String porfin;
	String espaciador;
	porfin="a";
	Cadena="\nDe oca a oca y gane";
	espaciador="\n------------------------------";
		//Variable que guardara la posicion de la casilla
		
		int casilla=0;
		int totalcasillas=63;
		System.out.println(espaciador);		
		System.out.println ("\nEmpieza el juego,suerte");
		System.out.println(espaciador);
		d1.tirarDado();
	do{
		
		d1.tirarDado();
			if (casilla + d1.getValorDado() >totalcasillas) 
			{
				if (casilla + d1.getValorDado() ==totalcasillas)

				{
					casilla=totalcasillas;
				}
				
				if(casilla==58)
				 {casilla=1;
				 d1.tirarDado();
				 }
				
				System.out.println("\nEstas en la casilla:"+casilla);
								
	     				int avz=totalcasillas-casilla;
	     				casilla=casilla+avz;
	     				System.out.println(espaciador);
	     		System.out.println("\nValor del dado: "+d1.getValorDado());
	     		
				System.out.println("\nHas avanzado a la casilla:"+casilla );
				
				int avz2=d1.getValorDado()-avz;
				casilla=casilla-avz2;
				
				System.out.println("\nHas regresado a la casilla:"+casilla );
				System.out.println(espaciador);
				
				if(casilla==58)
				 {casilla=1;}
				
			}	
			
//Codigo de avanze de casillas			
			
			if (casilla + d1.getValorDado() <totalcasillas) 
			{
				int avance=casilla+d1.getValorDado();
				casilla=avance;
				
				System.out.println("\nValor del dado: "+d1.getValorDado());
				System.out.println ("\nEstas en la casilla "+casilla);
				System.out.println(espaciador);
				d1.tirarDado();
			
			}
		
				if(casilla==1)
				 {casilla=6;
				 System.out.println ("\nDe puente a puente y tiro porque me lleva la corriente");
				 System.out.println ("\nEstas en la casilla:"+casilla);
				 System.out.println(espaciador);
				 }
				
					else
						
				if(casilla==6)
					 {casilla=12;
					 System.out.println ("\nDe puente a puente y tiro porque me lleva la corriente");
					 System.out.println ("\nEstas en la casilla:"+casilla);
					 System.out.println(espaciador);
					 }				
				else
					
					if(casilla==5)
					 {casilla=9;
					 System.out.println ("\nDe oca a oca y tiro porque me toca");
					 System.out.println ("\nEstas en la casilla:"+casilla);
					 System.out.println(espaciador);
					}
				
					else
						
						if(casilla==9)
						 {casilla=14;
						 System.out.println ("\nDe oca a oca y tiro porque me toca");
						 System.out.println ("\nEstas en la casilla:"+casilla);
						 System.out.println(espaciador);
						 }
				
						else
							
							if(casilla==14)
							 {casilla=18;
							 System.out.println ("\nDe oca a oca y tiro porque me toca");
							 System.out.println ("\nEstas en la casilla:"+casilla);
							 System.out.println(espaciador);
							 }
				
							else
								
								if(casilla==18)
								 {casilla=23;
								 System.out.println ("\nDe oca a oca y tiro porque me toca");
								 System.out.println ("\nEstas en la casilla:"+casilla);
								 System.out.println(espaciador);
								 }
				
								else
									
									if(casilla==23)
									 {casilla=27;
									 System.out.println ("\nDe oca a oca y tiro porque me toca");
									 System.out.println ("\nEstas en la casilla:"+casilla);
									 System.out.println(espaciador);
									 }
				
									else
										
										if(casilla==26)
										 {casilla=53;
										 System.out.println ("\nDe dado a dado y tiro porque me ha tocado");
										 System.out.println ("\nEstas en la casilla:"+casilla);
										 System.out.println(espaciador);
										 }
										
										else
											
										if(casilla==27)
										 {casilla=32;
										 System.out.println ("\nDe oca a oca y tiro porque me toca");
										 System.out.println ("\nEstas en la casilla:"+casilla);
										 System.out.println(espaciador);
										 }
				
										else
											
											if(casilla==32)
											 {casilla=36;
											 System.out.println ("\nDe oca a oca y tiro porque me toca");
											 System.out.println ("\nEstas en la casilla:"+casilla);
											 System.out.println(espaciador);
											 }
				
											else
												
												if(casilla==36)
												 {casilla=41;
												 System.out.println ("\nDe oca a oca y tiro porque me toca");
												 System.out.println ("\nEstas en la casilla:"+casilla);
												 System.out.println(espaciador);
												 }
				
												else
													
													if(casilla==41)
													 {casilla=45;
													 System.out.println ("\nDe oca a oca y tiro porque me toca");
													 System.out.println ("\nEstas en la casilla:"+casilla);
													 System.out.println(espaciador);
													 }
				
													else
														
														if(casilla==42)
														 {casilla=30;
														 System.out.println ("\nDel laberinto al 30");
														 System.out.println ("\nEstas en la casilla:"+casilla);
														 System.out.println(espaciador);
														 }
				
														else
															
														if(casilla==45)
														 {casilla=50;
														 System.out.println ("\nDe oca a oca y tiro porque me toca");
														 System.out.println ("\nEstas en la casilla:"+casilla);
														 System.out.println(espaciador);
														 }
				
														else
															
															if(casilla==50)
															 {casilla=54;
															 System.out.println ("\nDe oca a oca y tiro porque me toca");
															 System.out.println ("\nEstas en la casilla:"+casilla);
															 System.out.println(espaciador);
															 }
				
															else
																
																if(casilla==54)
																 {casilla=59;
																 System.out.println ("\nDe oca a oca y tiro porque me toca");
																 System.out.println ("\nEstas en la casilla:"+casilla);
																 System.out.println(espaciador);
																 }
				
																else
																	
																	if(casilla==58)
																	 {casilla=1;
																	 System.out.println ("\nEstas en la casilla:"+casilla); 
																	 System.out.println(espaciador);
																	 }
				
																	else
																		
																	if(casilla==59)
																	 {casilla=63;
																	 System.out.println(Cadena);
																	 porfin="ad";
																	 System.out.println(espaciador);
																	 }
		
/*
 
 Si al tirar el dado resulta que llegamos a la casilla 63 nos salimos
 del bucle, es decir, ¡¡hemos ganado el juego!!	
 		
 */
		
			if (casilla + d1.getValorDado() ==totalcasillas)

			{
				casilla=totalcasillas;
			}
			
		}
	
	while (casilla<totalcasillas);	
		
	if (porfin=="ad" && casilla==totalcasillas){
		
		System.out.println("\nHas llegado a la casilla: "+casilla);
		System.out.println(espaciador);
		System.out.println("\nEnhorabuena!!!, has ganado!!!");
		System.out.println(espaciador);
	}


	if (casilla==totalcasillas && porfin=="a")
		
	{
		
		System.out.println("\nValor del dado: "+d1.getValorDado());
	System.out.println("\nHas llegado a la casilla: "+casilla);
	System.out.println(espaciador);
		System.out.println("\nEnhorabuena!!!, has ganado!!!");
		System.out.println(espaciador);
		}
		
	}
	}