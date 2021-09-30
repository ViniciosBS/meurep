package RMI;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalculadoraCliente {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Double n1,n2;
	int op;
	
	try {
		Registry miRegistro=LocateRegistry.getRegistry("localhost",1099);
		Calculadora c=(Calculadora)Naming.lookup("//localhost/Calculadora");
		while(true) {
			System.out.println("\n1 - Soma");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			System.out.println("5 - Todas operaçoes");
			System.out.println("0 - Sair\n");
			op=sc.nextInt();
			if(op==1) {
				System.out.print("Informe o numero1 para soma: ");
				n1=sc.nextDouble();
				System.out.print("\nInforme o numero2 para soma: ");
				n2=sc.nextDouble();
				System.out.println("\nA soma de "+n1+" + "+ n2+" é: " + c.soma(n1, n2));
				
			}
			if(op==2) {
				System.out.print("Informe o numero1 para subtracao: ");
				n1=sc.nextDouble();
				System.out.print("\nInforme o numero2 para subtracao: ");
				n2=sc.nextDouble();
				System.out.println("\nA subtracao de "+n1+" - "+ n2+" é: " + c.subtracao(n1, n2));
			}
			if(op==3) {
				System.out.print("Informe o numero1 para multiplicao: ");
				n1=sc.nextDouble();
				System.out.print("\nInforme o numero2 para multiplicao: ");
				n2=sc.nextDouble();
				System.out.println("\nA multiplicao de "+n1+" * "+ n2+" é: " + c.multiplicacao(n1, n2));
			}
			if(op==4) {
				System.out.print("Informe o numero1 para divisao: ");
				n1=sc.nextDouble();
				System.out.print("\nInforme o numero2 para divisao: ");
				n2=sc.nextDouble();
				if(n2!=0) {
				System.out.println("\nA divisao de "+n1+" / "+ n2+" é: " + c.divisao(n1, n2));
				}else {
					System.out.println("Nao e possivel dividir por 0");
				}
			}
			if(op==5) {
				System.out.print("Informe o numero1: ");
				n1=sc.nextDouble();
				System.out.print("\nInforme o numero2: ");
				n2=sc.nextDouble();
				System.out.println("\nA soma de "+n1+" + "+ n2+" é: " + c.soma(n1, n2));
				System.out.println("A subtracao de "+n1+" - "+ n2+" é: " + c.subtracao(n1, n2));
				System.out.println("A multiplicao de "+n1+" * "+ n2+" é: " + c.multiplicacao(n1, n2));
				if(n2!=0) {
					System.out.println("A divisao de "+n1+" / "+ n2+" é: " + c.divisao(n1, n2));
				}else {
					System.out.println("Nao e possivel dividir por 0");
				}
				
				
			}
			if(op==0) {
				System.exit(0);
			}
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}}
