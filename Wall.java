package com.tutorial.SuperMario.tile;

import java.awt.Color;
import java.awt.Graphics;

import com.SuperMario.Handler;
import com.SuperMario.ID;
import com.SuperMario.MainClass;

public class Wall extends Tile {

	public Wall(int x, int y, int width, int height, boolean solid, ID id, Handler handler) {
		super(x, y, width, height, solid, id, handler);
		
	}

	public void render(Graphics g) {
		g.drawImage(MainClass.grass.getBufferedImage(), x, y, width, height, null);
//		g.setColor(Color.RED);
//		g.fillRect(x, y, width, height);
//		
		
	}

	public void tick() {
		
		
	}

}
