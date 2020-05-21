import java.util.*;
public class Ordenamiento 
{
	int []vec; int n;
	Scanner leer = new Scanner(System.in);
	
	Ordenamiento()
	{
		System.out.println("ingrese el tamaño del vector");
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
	 /*
	 public class Ordenamiento 
	 {
	 	int []vec; int n;
	 	Scanner leer = new Scanner(System.in);
	 	
	 	Ordenamiento()
	 	{
	 		System.out.println("ingrese el tamaño del vector");
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
	 		System.out.println();
	 		for (int i=0;i<vec.length;i++)
	 		{
	 			System.out.print(vec[i]+" ");
	 		}
	 	}
	 	 public int[] quicksort1(int numeros[])
	 	 {
	 	   return quicksort(numeros,0,numeros.length-1); 
	 	 }
	 	 public int[] quicksort(int A [],int izq, int der)
	 	 {
	 			  int pivote=A[izq]; // tomamos primer elemento como pivote
	 			  int i=izq; // i realiza la búsqueda de izquierda a derecha
	 			  int j=der; // j realiza la búsqueda de derecha a izquierda
	 			  int aux;
	 			 
	 			  while(i<j){            // mientras no se crucen las búsquedas
	 				  mostrar(A);
	 			     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
	 			     while(A[j]>pivote) j--;         // busca elemento menor que pivote
	 			     if (i<j) {                      // si no se han cruzado                      
	 			         aux= A[i];                  // los intercambia
	 			         A[i]=A[j];
	 			         A[j]=aux;
	 			     }
	 			     mostrar(A);
	 			   }
	 			   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
	 			   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
	 			   mostrar(A);
	 			   if(izq<j-1)
	 			   {
	 				   mostrar(A);
	 				   quicksort(A,izq,j-1); // ordenamos subarray izquierdo
	 			   }
	 			      
	 			   if(j+1 <der)
	 			   {
	 				   mostrar(A);
	 				   quicksort(A,j+1,der); // ordenamos subarray derecho
	 			   }
	 			      
	 	 return A;
	 	}
	 }*/
	}