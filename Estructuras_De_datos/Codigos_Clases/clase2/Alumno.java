class Alumno
{
	String nombre;
	String apPat;
	String apMat;
	int edad;
	char sexo;
	double peso;
	Alumno(String n, String aP, String aM, int e, char s, double peso )
	{
		nombre = n;
		apPat = aP;
		apMat = aM;
		edad = e;
		sexo = s;
		this.peso = peso;
	}
	public void mostrar()
	{
		System.out.println("--------------------------------");
		System.out.println("Datos del estudiante: "+nombre);
		System.out.println("Nombre: ............. "+nombre);
		System.out.println("Apellido Paterno: ... "+apPat);
		System.out.println("Apellido Materno: ... "+apMat);
		System.out.println("Edad: ............... "+edad);
		System.out.println("Sexo: ............... "+sexo);
		System.out.println("Peso: ............... "+peso);
	}
}
