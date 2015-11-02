public class Perfil{
	private String usuari;
	private String contrasenya;
	private Puntuacio puntuacio;
	Map<String,Partida> partides_usuari = new HashMap<String,Partida>();
	public Perfil(){
		this.usuari = "convidat";
		this.contrasenya = "";
		puntiacio = new Puntuacio(); (?)
	}
	public Perfil(String usuari, String contrasenya){
		this.usuari = usuari;
		this.contrasenya = contrasenya;
		puntiacio = new Puntuacio(); (?)
	}
	public void add_puntuacio(Puntuacio puntuacio){
		this.puntuacio.facil += puntuacio.facil;
		this.puntuacio.mig += puntuacio.mig;
		this.puntuacio.dificil += puntuacio.dificil;
	}
	public String get_contrasenya(){
		return contrasenya;		
	}
	public String get_usuari(){
		return usuari;
	}
	public Puntuacio get_puntuacio(){
		return puntuacio;
	}
	public Partida get_partida(String nom_partida){
		return partides_usuari.get(nom_partida);
	}
	public void assignar_nova_partida(Partida partida){
		partides_usuari.put(partida.get_nom_partida(),partida);
	}
}