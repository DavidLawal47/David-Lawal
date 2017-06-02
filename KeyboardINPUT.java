package com.SuperMario.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.SuperMario.MainClass;
import com.turorial.SuperMario.entity.Entity;

public class KeyboardINPUT implements KeyListener{

	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();// when a key is pressed this int will get the key that was pressed
		
		for(Entity en: MainClass.handler.entity){
			switch(key){
			case KeyEvent.VK_W:
				if(!en.jumping) {
					en.jumping = true;
					en.gravity = 10.0;
				}
				en.setVelY(-5);
				break;
//			case KeyEvent.VK_S:
//				en.setVelY(5);
//				break;
			case KeyEvent.VK_A:
				en.setVelX(-5);
				en.facing = 0;
				break;
			case KeyEvent.VK_D:
				en.setVelX(5);
				en.facing = 1;
			break;
			}
			
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for(Entity en: MainClass.handler.entity){
			switch(key){
			case KeyEvent.VK_W:
				en.setVelY(0);
				break;
			case KeyEvent.VK_S:
				en.setVelY(0);
				break;
			case KeyEvent.VK_A:
				en.setVelX(0);
				break;
			case KeyEvent.VK_D:
				en.setVelX(0);
				break;
			}
			
		}
		
	}

	
	public void keyTyped(KeyEvent arg0) {
		//not using
		
	}

}
