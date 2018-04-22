package it.unibs.fdp.tamagotchi;

public class Pet
{
	
	private final static int MAX_AFFETTO = 100;
	private final static int MAX_SAZIETA = 100;
	private final static int soglia_affetto_min=50;
	private final static int soglia_sazieta_min=50;
	private final static int riduzione_affetto=5;
	private final static int riduzione_sazieta=5;
	private final static String messaggio_morte="Il tamagotchi e' morto";
	private final static String messaggio_inflice="Il tamagotchi e' infelice";
	private final static String messaggio_felice="Il tamagotchi e' felice";
	
	private String toString="";
	private String nome_tamagotchi="";
	private int affetto=0;
	private int sazieta=0;
	
	public Pet(String nomeTamagotchi,int affetto,int sazieta) {
		this.sazieta=sazieta;
		this.nome_tamagotchi=nomeTamagotchi;
		this.affetto=affetto;
	}
	public void statistiche() {
		if(sonoMorto()==true)
			toString=messaggio_morte;
		else if(sonoTriste()==true)
			toString=messaggio_inflice;
		else
			toString=messaggio_felice;
		System.out.println(toString+";"+nome_tamagotchi+"ha"+sazieta+"di sazieta e"+affetto+"di affetto");
	}
	
	public void riceviBiscotti(int Biscotti) {
		sazieta=sazieta+10*Biscotti;
		affetto=affetto-riduzione_affetto;
		if (sazieta>MAX_SAZIETA)
			sazieta=MAX_SAZIETA;
	}
	public void riceviCarrezze(int Carezze) {
		affetto=affetto+10*Carezze;
		sazieta=sazieta-riduzione_sazieta;
		if (affetto>MAX_AFFETTO)
			affetto=MAX_AFFETTO;
	}
	public boolean sonoTriste() {
		if (affetto<=soglia_affetto_min||sazieta<=soglia_sazieta_min)
				return true;
		return false;
	}
	public boolean sonoFelice() {
		if (affetto>soglia_affetto_min||sazieta>soglia_sazieta_min)
				return true;
		return false;
	}
	public boolean sonoMorto() {
		if (affetto<=0||sazieta<=0)
				return true;
		return false;
	}
	
}
