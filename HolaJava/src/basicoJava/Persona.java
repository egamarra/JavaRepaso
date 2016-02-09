package basicoJava;

public class Persona {
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private char sexo;
	private char edad;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellidoP, String apellidoM, char sexo, char edad) {
		super();
		this.setNombre(nombre);
		this.setApellidoP(apellidoP);
		this.setApellidoM(apellidoM);
		this.setSexo(sexo);
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public char getEdad() {
		return edad;
	}

	public void setEdad(char edad) {
		this.edad = edad;
	}
	

}
