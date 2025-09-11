class Curso
{
	Alumno[] lista;
	int cant;
	Curso()
	{
		lista = new Alumno[100];
		cant = 0;
	}
	void regEstudiante(Alumno a)
	{
		lista[cant] = a;
		cant++;
	}
	void mostrarReg()
	{
		for(int i=0; i<cant;i++) {
			lista[i].mostrar();
		}
	}
}
