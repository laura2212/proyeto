
public class Pila {
 private int [ ]datos;
 private int [] copia; //private int cima;
 private final int maxTamaño=20;
 private int cuenta;
 
 
 public Pila(int cantidad){
		this.datos=new int [cantidad];
		this.copia=new int [cantidad];

		this.cuenta=0;//-1
	 }

  public void push(int numero){
	
	if(this.cuenta==(maxTamaño-1)){
		throw new RuntimeException("no es posible agregar datos pila llena");		
	}
	this.datos [this.cuenta]=numero;
	this.copia [this.cuenta]=numero;
	++cuenta;
}

public int pop(){
	if(this.isEmpty()){
     throw new RuntimeException("la pila esta vacia");
	}	
	--this.cuenta;//retiro el valor de la pila

	return 	this.datos [this.cuenta];
}

public int peek(){
	if(this.isEmpty()){
     throw new RuntimeException("la pila esta vacia");
	}
	return 	this.datos [this.cuenta-1];
}


public boolean isEmpty(){
	return this.cuenta<=0;
	
}
public  void mostrarPila() {
	  for(int i=cuenta-1;i>=0;i--){
		  if(!(this.cuenta==(maxTamaño-1)) )
		  System.out.println("|_"+datos[i]+"_|");
	  }
	
	  }

 public int tamanioPila() {
       return (this.cuenta);
	

}
 public int[]copias(){
	 return this.copia;
 }
}

