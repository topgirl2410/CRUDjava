package crud;

public class Huesped {
	int codigo;
	String nombre, apellidos, direccion, ciudad, numTarjeta, numHabitacion;

	public Huesped(int codigo, String nombre, String apellidos, String direccion, String ciudad, String numTarjeta,
			String numHabitacion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.numTarjeta = numTarjeta;
		this.numHabitacion = numHabitacion;
	}
	
	public Huesped() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	
}
