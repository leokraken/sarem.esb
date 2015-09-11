package saremesb.datatypes;

public class DataPersonResult {
	private String nombre;
	private String direccion;
	private String movil;
	private String telefono;
	private String FN;
	private int PaisID;
	private String Sexo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFN() {
		return FN;
	}
	public void setFN(String fN) {
		FN = fN;
	}
	public int getPaisID() {
		return PaisID;
	}
	public void setPaisID(int paisID) {
		PaisID = paisID;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	

}
