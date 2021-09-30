package RMI;

import java.rmi.*;

public interface Calculadora extends Remote {
	public Double soma(Double a, Double b) throws RemoteException;
	public Double subtracao(Double a, Double b) throws RemoteException;
	public Double divisao(Double a, Double b) throws RemoteException;
	public Double multiplicacao(Double a, Double b) throws RemoteException;
}
