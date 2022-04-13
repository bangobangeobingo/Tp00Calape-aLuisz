package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController{
	
	
	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		
		return "index";
	}
	

	
	@GetMapping("/calculoSuma")
	public String getSuma(@RequestParam (name="num1")int num1,@RequestParam(name="num2")int num2, Model model) {
		int resultadoS=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoS=nuevaCalculadora.suma();
    	model.addAttribute("resultadoS", resultadoS);
    	
		
		return "resultadosuma";
	}
	
	
	
	@GetMapping("/calculoResta")
	public String getResta(@RequestParam (name="num1")int num1,@RequestParam(name="num2")int num2, Model model) {
		int resultadoR=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoR=nuevaCalculadora.resta();
    	model.addAttribute("resultadoR", resultadoR);
    	
		
		return "resultadoresta";
	}
	
	@GetMapping("/calculoMultiplica")
	public String getMultiplica(@RequestParam (name="num1")int num1,@RequestParam(name="num2")int num2, Model model) {
		int resultadoM=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoM=nuevaCalculadora.multiplicar();
    	model.addAttribute("resultadoM", resultadoM);
    	
		
		return "resultadomultiplicacion";
	}
	@GetMapping("/calculoDivide")
	public String getDivide(@RequestParam (name="num1")int num1,@RequestParam(name="num2")int num2, Model model) {
		double resultadoD=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoD=nuevaCalculadora.dividir();
    	model.addAttribute("resultadoD", resultadoD);
    	
		
		return "resultadodivision";
	}
	@GetMapping("/calculoPotencia")
	public String getPotencia(@RequestParam (name="num1")int num1,@RequestParam(name="num2")int num2, Model model) {
		int resultadoP=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoP=nuevaCalculadora.potencia();
    	model.addAttribute("resultadoP", resultadoP);
    	
		
		return "resultadopotencia";
	}
	@GetMapping("/calculoRaiz")
	public String getRaiz(@RequestParam (name="num1")int num1,Model model) {
		int resultadoRaiz=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	resultadoRaiz=nuevaCalculadora.raiz();
    	model.addAttribute("resultadoRaiz", resultadoRaiz);
    	
		
		return "resultadoraiz";
	}
	@GetMapping("/calculoRaizN")
	public String getRaizN(@RequestParam (name="num1")int num1,@RequestParam(name="num2")int num2, Model model) {
		double resultadoRn=0;
		Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoRn=nuevaCalculadora.raizn();
    	model.addAttribute("resultadoRn", resultadoRn);
    	
		
		return "resultadoraizn";
	}
	
	
	
}