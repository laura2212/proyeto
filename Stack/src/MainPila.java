import java.util.Scanner;


public class MainPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[ ]copia1={};
        int[ ]copia2={};

        System.out.println("Ingrese tamaño pilas=");
	    Scanner scaner=new Scanner(System.in);
		int tamanio=scaner.nextInt();
		
		Pila miPila=new Pila(tamanio);
		Pila miPila2=new Pila(tamanio);
		
		menu(miPila,miPila2,tamanio);
	}
	
	
	
		
		 public static void cargarPila(Pila pila,int tamanio){
			int cont=0;
			Scanner scaner=new Scanner(System.in);
			do{
			System.out.println("Ingrese valor");
			pila.push(scaner.nextInt());
			cont=cont+1;
			}while(cont<=tamanio-1); 
		}
		
	public static int comparar(Pila pila1, Pila pila2){
		int aux1,aux2;
		int resultado=2;
		for(int i=0;i<=pila1.tamanioPila();i++){
			aux1=pila1.pop();
			aux2=pila2.pop();
			if(aux1==aux2){
		   
			if(pila1.isEmpty()){
				
				resultado=0;
			}
			}
			if(aux1>aux2){
				resultado=1;
				}
		  if(aux1<aux2){
				resultado=-1;
				}	
			}
		return resultado;
		}
	
	public static void  menu(Pila pila1,Pila pila2,int tamanio) {
	    Scanner scaner=new Scanner(System.in);
	    
		System.out.println("*****************************");
		System.out.println("1_Cargar pilas              *");
		System.out.println("2_Mostrar pilas             *");
		System.out.println("3_Resultado de comparacion  *");
		System.out.println("4_Salir                     *");
		System.out.println("*****************************");

		int op =scaner.nextInt();
        opciones (op,pila1,pila2,tamanio);
	}
	
	public static void opciones(int op,Pila miPila,Pila miPila2,int tamanio) {
	do{
		switch(op){
		case 1: System.out.println("Ingrese datos Pila 1");
	            cargarPila(miPila,tamanio);
		        System.out.println("Ingrese datos Pila 2");
		        cargarPila(miPila2,tamanio);
		break;
		case 2:System.out.println("Pila 1= ");
	           miPila.mostrarPila();
		       System.out.println("Pila 2= ");
		       miPila2.mostrarPila();
		break;
		
		case 3:System.out.println("Resultado= "+ comparar(miPila, miPila2));
        break;
		case 4:System.exit(1);
	    break;
		default:menu( miPila, miPila2, tamanio);
		break;
        
	}
		menu(miPila, miPila2, tamanio);
}while(op!=0);
	}	
		
	}



