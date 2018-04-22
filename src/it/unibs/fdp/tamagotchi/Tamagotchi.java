package it.unibs.fdp.tamagotchi;

import it.unibs.fp.mylib.MyMenu;

public class Tamagotchi
{
	
	private final static String SALUTO = "Benvenuti nel mondo dei Tamagotchi"; //Inizializzazione di un saluto;
	public static final String CORNICE_TRATTEGGIATA = "----------------------------------------------------------------------";
	
	private final static String RICHIESTA_NOME = "Inserisci il nome del tuo Tamagotchi";//Messaggio su schermo per inserimento nome Tamagotchi;
	private final static String RICHIESTA_SAZIETA = "Inserisci il valore iniziale di sazieta'";//Messaggio su schermo relativo all'inserimento del valore iniziale di sazieta';
	private final static String RICHIESTA_AFFETTO = "Inserisci il valore iniziale di affetto";//Messaggio su schermo relativo all'inserimento del valore iniziale di affetto;
	
	private final static String SCEGLI_BISCOTTI = "Dai biscotti al Tamagotchi";
	private final static String SCEGLI_CAREZZE = "Dai carezze al Tamagotchi";
	
	private final static String RICHIESTA_BISCOTTI = "Inserisci il numero di biscotti da dare al Tamagotchi";
	private final static String RICHIEATTA_CAREZZE =  "Inserisci il numero di carezze da dare al Tamagotchi";
	private final static String [] SCELTA_AZIONE = /*creazione delle voci neccesarie per il tamagotchi, sotto forma di array*/
		{
				SCEGLI_BISCOTTI,
				SCEGLI_CAREZZE
		};
	
	private final static int MAX_BISCOTTI = 20;
	private final static int MAX_CAREZZE = 20;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean uscita=true;
		MyMenu menu = new MyMenu(SALUTO,SCELTA_AZIONE);
		Pet tama = new Pet("eee",2,2);
		do 
		{ 
			
			switch(menu.scegli())
			{
			case 1:
				
				break;
			case 2:
				
				break;
			case 0:
				uscita=false;

			}

		}while (uscita);
		

	}

}
