

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;

public class StartServer {

	public static void main(String argv[]) {
		
		//System.setProperty("java.security.policy","Server.policy");
		if(System.getSecurityManager() == null) {
		 System.setSecurityManager(new RMISecurityManager());
		 }
		

		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			//System.setProperty("java.security.policy","Server.policy");
			//System.setProperty("java.rmi.server.hostname","127.0.0.1");
			
			//if(System.getSecurityManager()==null)
				//System.setSecurityManager(new RMISecurityManager());
			
			
			//System.setProperty("java.security.policy","Server.policy");
			//System.setProperty("java.rmi.server.hostname","127.0.0.1");
			
			
			
			//String url="rmi://127.0.0.1:1099/dir";
			
			//Naming.rebind(url, obj);
			
			
			
			
			ServerImplementation serverImpl = new ServerImplementation();
			
			//serverImpl.setFile("/home/arjun/Downloads/", "str.ppt");
			Naming.rebind("dir", serverImpl);
			
			System.out.println("Server is ready");
			

		} catch (Exception e) {
			System.out.println("error in server: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// public static void main(String a[]) throws Exception{
	// Runtime.getRuntime().exec("/bin/bash -c rmiregistry");
	// TimeUnit.SECONDS.sleep(2);
	// System.setProperty("java.security.policy","Server.policy");
	// System.setProperty("java.rmi.server.hostname","172.16.80.71");
	//
	// if(System.getSecurityManager()==null)
	// System.setSecurityManager(new RMISecurityManager());
	//
	//
	// Implement fi = new Implement();
	// Naming.rebind("dir", fi);
	// System.out.println("server started!!!");
	//
	//
	// AddC obj = new AddC();
	// String url="rmi://172.16.80.71:1099/ADD";
	//
	// Naming.rebind(url, obj);
	//
	// System.out.println("Server started");
	// }

}
