package network;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

import network.packet.ClientUpdate;
import network.packet.LoginRequest;
import network.packet.LoginResponse;

public class ClientListener extends Listener{
	public GameClient gameClient;
	
	public ClientListener(GameClient gameClient){
		this.gameClient = gameClient;
	}
	
	@Override
	public void connected(Connection con) {
		LoginRequest req = new LoginRequest();
		req.setUsername("Bunny");
		con.sendTCP(req);
	}
	
	@Override
	public void disconnected(Connection con) {
		
	}
	
	@Override
	public void received(Connection con, Object obj) {
		if(obj instanceof LoginResponse){
			LoginResponse response = (LoginResponse) obj;
			
			System.out.println(response.getResponseText());
		}
		else if (obj instanceof ClientUpdate){
			
		}
	}
}
