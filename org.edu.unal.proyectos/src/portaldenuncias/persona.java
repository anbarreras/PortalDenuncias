package portaldenuncias;

public class persona {
	
	//ATRIBUTOS
	
	String nombre;
	String cedula;
	String fecha;
	String tipoDenuncia;
	String edad;
	String ciudad;
	String descripcion;
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	public String getNombre(String nombre) {
		return nombre;
	}
	
	
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCedula(String cedula) {
		return cedula;
	}
	
	
	public void setTipoDenuncia( String tipoDenuncia) {
		this.tipoDenuncia = tipoDenuncia;
	}
	public String getTipoDenuncia(String tipoDenuncia) {
		return tipoDenuncia;
	}
	
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getFecha(String fecha) {
		return fecha;
	}
	
	
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getEdad(String edad) {
		return edad;
	}
	
	public void setCiudad (String ciudad) {
		this.ciudad=ciudad;
	}
	public String getCiudad(String ciudad) {
		return ciudad;
	}
	
	public void setDescripcion (String descripcion) {
		this.descripcion=descripcion;
	}
	public String getDescripcion(String descripcion) {
		return descripcion;
	}
	
	
	
	
}
