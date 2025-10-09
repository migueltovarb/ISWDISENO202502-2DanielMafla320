package sistemaReservas;

public class Estudiante {
	public String nombre;
	public String codigo;
	public String programa;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	public void registrar() {
		System.out.println("El usuario se registro correctamente");
	}
	public Estudiante(String nombre, String codigo, String programa) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.programa = programa;
	}
	@Override
	public String toString() {
		return "Estudiante [estudiante=" + nombre + ", codigo=" + codigo + ", programa=" + programa + "]";
	}
}
