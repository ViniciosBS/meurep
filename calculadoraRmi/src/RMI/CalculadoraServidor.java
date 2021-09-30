package RMI;

import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraServidor{
	
	public static void main(String[] args) {
		try {
			Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099);
			r.rebind("Calculadora", new rmi());
			System.out.println("Servidor online");
		} catch (RemoteException e) {
			System.out.println("Servidor offline");
			e.printStackTrace();
		}
		
	}

}
