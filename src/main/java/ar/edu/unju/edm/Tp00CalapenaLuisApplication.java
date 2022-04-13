package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00CalapenaLuisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00CalapenaLuisApplication.class, args);
	
	String nombre ="Luis Calapeña";
	System.out.println("Hola edm,dice: "+ nombre +" "+ darNombre());
	
	
	Calculadora miCalculadora =new Calculadora(10,4);
	
	int suma=miCalculadora.suma();
	System.out.println("la suma es: "+suma);
	

	System.out.println("la resta es:" +miCalculadora.resta());
	System.out.println("la multiplicacion es :"+miCalculadora.multiplicar());
	System.out.println("la potencia es :"+miCalculadora.potencia());
	System.out.println("la raiz cuadra del primer numero es:"+miCalculadora.raiz());
	System.out.println("la raiz N:"+miCalculadora.raizn());
	
	double dividir =miCalculadora.dividir();
	if(dividir==0) {
		System.out.println("el divisor tiene que ser mayor a 0");
	}
	else {
		System.out.println("la division es:"+dividir);
	}
     
	}

	private static String darNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
