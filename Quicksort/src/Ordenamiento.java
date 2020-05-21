import java.util.*;
public class Ordenamiento 
{
	int []vec; int n;
	Scanner leer = new Scanner(System.in);
	
	Ordenamiento()
	{
		System.out.println("ingrese el tama�o del vector");
		n=leer.nextInt();
		vec=new int[n];
		llenar();
		vec = quicksort1(vec);
		mostrar(vec);
	}
	
	public void llenar()
	{
		System.out.println("ingrese los datos del vector");
		for (int i=0;i<n;i++)
		{
			vec[i]=leer.nextInt();
		}
	}
	public void mostrar(int vec[])
	{
		System.out.println("el vector ordenado es: ");
		for (int i=0;i<vec.length;i++)
		{
			System.out.print(vec[i]+" ");
		}
	}
	 public int[] quicksort1(int numeros[])
	 {
	   return quicksort2(numeros,0,numeros.length-1); 
	 }
	 public int[] quicksort2(int numeros[],int izq, int der)
	 {
	   if(izq>=der)
		   return numeros;
	   int i=izq, d=der;
	   if(izq!=der)
	   {
		    int pivote;
		    int aux;
		    pivote = izq;
		    while(izq!=der)
		    {
			    while(numeros[der]>=numeros[pivote] && izq<der)
			    	 der--;
			    while(numeros[izq]<numeros[pivote] && izq<der)
			    	 izq++;
			    if(der!=izq)
			    {
			      aux = numeros[der];
			      numeros[der]=numeros[izq];
			      numeros[izq]=aux;
		        }
	        }
		   if(izq==der)
		   {
			    quicksort2(numeros,i,izq-1);
			    quicksort2(numeros,izq+1,d);
		   }
		   mostrar(numeros);
	   }
	   else
	   {
		   mostrar(numeros);
		   return numeros;
	   }  
	   return numeros; 
	  }
	}