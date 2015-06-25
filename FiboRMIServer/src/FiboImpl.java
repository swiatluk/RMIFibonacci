import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;


public class FiboImpl extends UnicastRemoteObject implements FiboInt
{

	protected FiboImpl() throws RemoteException
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long fibonacci(int n) throws RemoteException
	{
		 try {
		      System.out.println("Zapytanie z " + getClientHost());
		    } catch (ServerNotActiveException ex) {
		      ex.printStackTrace();
		    }
		 
		    return calculateFibonacci(n);
	}

	private long calculateFibonacci(int n)
	{
		if (n == 0) {
		      return 0L;
		    }
		    if (n == 1) {
		      return 1L;
		    }
		 
		    return (calculateFibonacci(n - 1) + calculateFibonacci(n - 2));
	}

	
	

	

}
