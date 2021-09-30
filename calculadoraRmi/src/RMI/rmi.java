package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class rmi extends UnicastRemoteObject implements Calculadora{
	public rmi() throws RemoteException{
		Double a,b;
	}

	public Double soma(Double a, Double b) throws RemoteException {
		return a+b;
	}

	public Double subtracao(Double a, Double b) throws RemoteException {
		return a-b;
	}

	public Double divisao(Double a, Double b) throws RemoteException {
		return a/b;
	}

	public Double multiplicacao(Double a, Double b) throws RemoteException {
		return a*b;
	}
	

}
