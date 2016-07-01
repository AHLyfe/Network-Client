package network;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.minlog.Log;

public class GameClient{
	public Client client;
	Kryo kryo;
	public ClientListener clientListener;
	public NetworkManager networkManager;
	public static final int DEFAULT_PORT = 2718;
	
	public GameClient(){
		if(connectToServer("127.0.0.1", DEFAULT_PORT)){
			System.out.println("Connection established");
			//LoginRequest req = new LoginRequest();
			//req.setUsername("Bunny");
			//client.sendTCP(req);
		}
	}
	
	public Boolean connectToServer(String ip, int port){
		Log.debug("Clint log");
		try{
			client = new Client();
			networkManager = new NetworkManager();
			networkManager.register(client.getKryo());
			
			clientListener = new ClientListener(this);
			client.addListener(clientListener);
			
			client.start();
			
			client.connect(10000, ip, port, port);
			
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
			client.close();
			return false;
		}
	}
	
	public void disconnect(){
		Log.info("Client disconnected");
		client.stop();
	}
}