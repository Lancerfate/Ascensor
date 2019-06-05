package Tp6While;

public class Ascensor 
{
	private int pisoMaximo = 0; //piso maximo que debera subir el ascensor
	private int pisoMinimo = 0; //piso minimo que debera poder bajar el ascensor
	private int pisoActual = 0; //piso en el que se encontrara el ascensor
	
	
	
	/*Al constructor ascensor le voy a pasar por parametro el piso maximo/minimo
	 *  que llegara el ascensor y el piso en el que va a estar*/
	 
	public Ascensor(int pisoMaximo, int pisoMinimo, int pisoActual) 
	{
		this.pisoMaximo = pisoMaximo;
		this.pisoMinimo = pisoMinimo;
		this.pisoActual = pisoActual;
	}
	 //crear un metodo setter para que el ascensor suba un piso solo
	
	public void subirUnPiso() 
	{
		/*esto es para que suba/baje un piso solo cuando se cumpla la condicion, osea,
		 *  cuando el piso actual sea mayor al piso minimo y menor al piso maximo*/
		if(pisoActual <= pisoMaximo && pisoActual >= pisoMinimo) 
		{
			pisoActual++;
		}
		
	}
	
	 //crear un metodo setter para que el ascensor baje un piso solo
	
	public void bajarUnPiso() 
	{
		if(pisoActual <= pisoMaximo && pisoActual >= pisoMinimo) 
		{
			pisoActual--;
		}
	}
	
	//crear un metodo setter para subir o bajar varios pisos(la cantidad de pisos se lo pasare por parametro)
	
	public void irAlPiso(int piso) 
	{
		while(piso != pisoActual) /*si el piso que ingresa por parametro es diferente del piso actual 
			                        entonces se cumplira lo que esta dentro de las comillas del while*/
		{
			/*esto es para que suba/baje un piso solo cuando se cumpla la condicion, osea,
			 *  cuando el piso actual sea mayor al piso minimo y menor al piso maximo*/
			if(pisoActual <= pisoMaximo && pisoActual >= pisoMinimo) 
			{
				if(pisoActual > piso) //Si el piso actual es mayor al piso que se ingreso el ascensor bajara
				{
					pisoActual--;
				}
				else                 //Sino el ascensor subira
				{
					pisoActual++;
				}
			}
		}
	}
	
	//crear un  metodo getter que nos diga el piso actual del ascensor
	
	public int decirPiso() 
	{
		return pisoActual;
		
	}

}
