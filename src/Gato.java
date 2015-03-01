
public class Gato extends Animal
//hereda la clase Animal
{
	
	//Constructor de la clase gato
		Gato(String nombre, int edad)
		{
			this.edad=edad;
			this.nombre=nombre;
		}
		//Metodo maullar
		String maullar()
		{
			return "Miau Miau!!";
		}

}
