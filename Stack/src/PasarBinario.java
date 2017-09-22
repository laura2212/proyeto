import java.util.Scanner;
import java.util.Stack;


public class PasarBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Stack<String> mipila=new Stack<String>();
 int num=validar();
 convertir(mipila, num);
 mostrarResultado(mipila,num);
	}

	public static void convertir (Stack<String>mipila,int num) {
		  while (num!= 0){
		   if(num % 2 == 0){
			   mipila.add("0");
		   }else{
		    mipila.add("1");
		   }
		   num = (num / 2);
		  }
		 }
	
	public static void mostrarResultado(Stack<String>pila,int num){
		String resultado="";
		String aux="";
		
		while(!pila.isEmpty()){
			aux=pila.pop();
			resultado=resultado+aux;
		}
		signo(num, resultado);
		}

	public static int validar(){
		int num=0;
		boolean siEs=false;
		while(!siEs){
		 Scanner scaner=new Scanner(System.in);
		 try{
		 System.out.println("Ingrese numero entero a convertir");
		 int num1=scaner.nextInt();	
		 siEs=true;
		 num=num1;
		 }catch (Exception num1){
		 System.out.println("Debe ingresar numero entero"); 
	}}
		return num;
	
	}
	public static void signo(int num,String resultado) {
		if (num<0) {
			resultado="-"+resultado;
			System.out.print("Binario con signo explicito de "+num+" es: "+resultado+" ");
		}else{
		System.out.print("Binario de "+num+" es: "+resultado+" ");
		}
	}
}