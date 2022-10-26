

public class AlbumDelMundial  {
	
	private int dni;
	private String nombre;
	private String tipoAlbum;
	private Fabrica fabrica;
	
	public AlbumDelMundial() {
		fabrica = new Fabrica();
	}
	
	void registrarParticipante(int dni, String nombre, String tipoAlbum){
		this.dni=dni;
		this.nombre=nombre;
		this.tipoAlbum=tipoAlbum;

		if(tipoAlbum=="Tradicional") {
			fabrica.crearAlbumTradicional();
		}
	}
}
