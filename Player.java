package com.turorial.SuperMario.entity;

import java.awt.Color;
import java.awt.Graphics;

import com.SuperMario.Handler;
import com.SuperMario.ID;
import com.SuperMario.MainClass;
import com.tutorial.SuperMario.tile.Tile;

public class Player extends Entity {
	
	private int frame = 0;
	private int frameDelay = 0;
	
	private boolean animate = false;

	public Player(int x, int y, int width, int height, boolean solid, ID id, Handler handler) {
		super(x, y, width, height, solid, id, handler);
		setVelX(5);

	}

	public void render(Graphics g) {
		if(facing == 0) {
			g.drawImage(MainClass.player[frame+2].getBufferedImage(), x, y, width, height, null);
			
		}else if(facing == 1) {
			g.drawImage(MainClass.player[frame].getBufferedImage(), x, y, width, height, null);
		}
	}
		
//		g.setColor(Color.BLUE);
//		g.fillRect(x, y, width, height);
		
	

	
	public void tick() {
		x+=velX;
		y+= velY;
		if(x <= 0) x = 0;
		if(y <= 0) y = 0;
		if(x + width >= 1080) x = 1080 - width;
		if(y + height >= 771) y = 771 - height;
		if(velX != 0) animate = true;
		else animate = false;
		for(Tile t : handler.tile){
			if(!t.solid) break;
			if(t.getID()== ID.Wall){
				if(getBoundsTop().intersects(t.getBounds())){
					setVelY(0);
					if(jumping){
						jumping = false;
						gravity = 0.8;
						falling = true;
					}
					y = t.getY()+ height;
				}
				if(getBoundsBottom().intersects(t.getBounds())){
					setVelY(0);
					if(falling) falling = false; 
				}
				else{
					 if(!falling && !jumping){
						 gravity = 0.8;
						 falling  = true;
					 }
					//y = t.getY()-height;;
					}
				if(getBoundsLeft().intersects(t.getBounds())){
					setVelX(0);
					x =  t.getX() + t.width;
				
				}
				if(getBoundsRight().intersects(t.getBounds())){
					setVelX(0);
					x =  t.getX()-t.width;
				}
			}
		}
		if(jumping){
			gravity -=0.1;
			setVelY((int)-gravity);
			if(gravity<=0.0){
				jumping = false;
				falling = true;
			}
		}
		
		if(falling){
			gravity+=0.1;
			setVelY((int)gravity);
		}
		if(animate){
			frameDelay++;
			if(frameDelay >=2) {
				frame++;
				if(frame>=1) {
					frame = 0;
				}
				frameDelay = 0;
			}
		}
	}
}
