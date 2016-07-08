package network;

import com.esotericsoftware.kryo.Kryo;

import network.packet.ClientUpdate;
import network.packet.LoginRequest;
import network.packet.LoginResponse;

public class NetworkManager {
	
	
	public void register(Kryo kryo){
		// TODO: ADD NEEDED PACKETS
		kryo.register(LoginRequest.class);
		kryo.register(LoginResponse.class);
		kryo.register(ClientUpdate.class);
	}
}
