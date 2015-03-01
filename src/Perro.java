
public class Perro extends Animal 
//hereda la clase animal
{ 
	//Constructor de la clase perro
	Perro(String nombre, int edad)
	{
		this.edad=edad;
		this.nombre=nombre;
	}
	//Metodo ladrar
	String ladrar()
	{
		return "Guau Guau!!";
	}
	
	
	

}
