import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class FiboClient
{

	
	public static void main(String[] args)
	{try{
	      
	      Registry registry = LocateRegistry.getRegistry("172.20.10.13");
	 
	      
	      FiboInt power_proxy = (FiboInt)registry.lookup("PowerObject");
	 
	      int  k;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("Podaj ilosc elementow: ");
	      k=s.nextInt();
	      System.out.println("Fibonacci("+k+")=" + power_proxy.fibonacci(k));
	      k=s.nextInt();
	      
	     
	    }catch(NotBoundException nbe){
	      nbe.printStackTrace();
	    }catch(RemoteException re){
	      re.printStackTrace();
	    }

	}

}
