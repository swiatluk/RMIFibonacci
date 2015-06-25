import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class FiboServer
{

	
	public static void main(String[] args)
	{try{
	    
	      FiboImpl power = new FiboImpl();
	 
	      	      
	      Registry registry = LocateRegistry.createRegistry(1099);
	 
	      
	      registry.rebind("PowerObject", power);
	 
	      System.out.println("Server starts...");
	    }catch(RemoteException re){
	      re.printStackTrace();
	    }
	}

}
