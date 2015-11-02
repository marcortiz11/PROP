public class Partida{
	private String nom_partida;
	private Int time;
	private String dificultat;
	Tauler tauler_de_partida;
	public Partida(String nom_partida, String username){
		this.nom_partida = nom_partida;
		this.time = 0;
		dificultat = ???;
		//ACLARAR TEMA DIFICULTAT
		tauler_de_partida = null;
	}
	public String get_nom_partida(){
		return nom_partida;
	}
	public String get_dificultat(){
		return dificultat;
	}
	public Int get_time(){
		return time;
	}
	public void set_time(int time){
		this.time = time;
	}
	public void set_dificultat(int dificultat){
		this.dificultat = dificultat;
	}
	public void assignar_tauler(Tauler t){
		this.tauler_de_partida = t; //referencia assignada
	}
	public Tauler get_tauler(){
		return tauler_de_partida;
	}
}