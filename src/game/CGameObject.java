package game;

import game.math.Vector2D;

public class CGameObject {
	public Vector2D position;
	public double radius;
	
	public CGameObject(Vector2D pos, double radius){
		this.position = pos;
		this.radius = radius;
	}
}
