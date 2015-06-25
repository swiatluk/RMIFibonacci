import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class FiboServer
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{try{
	      //Create server object
	      FiboImpl power = new FiboImpl();
	 
	      //Reference to registry service by creating registry service
	      
	      Registry registry = LocateRegistry.createRegistry(1099);
	 
	      //Register server object to registry with unique name
	      registry.rebind("PowerObject", power);
	 
	      System.out.println("Server starts...");
	    }catch(RemoteException re){
	      re.printStackTrace();
	    }
	}

}
