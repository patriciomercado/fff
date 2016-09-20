package tarea1909;
public class Alumno extends Persona{

	private int añoIngreso;
	private String Matricula;

    public Alumno(String nomb, String apel, String ru, String cum, int año) {
        super(nomb, apel, ru, cum);
        this.añoIngreso = año;
        this.Matricula = generarMatricula(ru,año);
    }

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	public String getMatricula() {
		return Matricula;
	}

	private String generarMatricula(String rut, int año) {
            String mat = "";
            String year = "";
            year = Integer.toString(año);
            year = year.substring( year.length() - 2, year.length());
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            mat = rut + year;
            return mat;    
	}
}