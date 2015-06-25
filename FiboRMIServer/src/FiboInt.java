import java.rmi.Remote;
import java.rmi.RemoteException;


public interface FiboInt extends Remote
{
	 long fibonacci(int n) throws RemoteException;
	

}
