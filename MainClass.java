/*PUBLIC = Giving access to the public. Classes are visible
 * Static = variable or methods  an be declared without requiring an instantiation of the class
 * Void= methods returns nothing
 */
package com.SuperMario;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.SuperMario.graphics.Sprite;
import com.SuperMario.graphics.SpriteSheet;
import com.SuperMario.input.KeyboardINPUT;
import com.turorial.SuperMario.entity.Entity;
import com.turorial.SuperMario.entity.Player;
import com.tutorial.SuperMario.tile.Wall;

// Runnable is known as an interface
public class MainClass extends Canvas implements Runnable {
	
	public static final int WIDTH = 270;
	public static final int HEIGHT = WIDTH/14*10;
	public static final int SCALE = 4;
	public static final String TITLE = "Super Mario";
	
	//creating a Game Loop Using threads
	private Thread thread;
	private boolean running = false;
	
	public static Handler handler;
	public static SpriteSheet sheet;
	public static Camera cam;
	
	public static Sprite grass;
	public static Sprite player[] = new Sprite[10];
	
	
	//constructor method
	//dimension for frame
	public MainClass(){
		Dimension size = new Dimension(WIDTH*SCALE,HEIGHT*SCALE);
		setPreferredSize(size);
		setMaximumSize(size);
		setMinimumSize(size);
	}
	
	private void init(){
		handler = new Handler();
		sheet = new SpriteSheet("/spritesheet.png");
		cam = new Camera();
		
		addKeyListener(new KeyboardINPUT());
		
		grass = new Sprite(sheet,1,1);
		
		for(int i = 0; i < player.length; i++){
		
			player[i] = new Sprite(sheet, i+1,16);
		}
	
		
		handler.addEntity(new Player(300,512,64,64,true,ID.player,handler));
		//handler.addTile(new Wall(200,200,64,64,true,ID.Wall,handler));
		
	}
	
	//synchronized = protects the thread from other thread interference and from memory errors
	private synchronized void start(){
	if(running) return; //return = Get out of this method
	running = true;
	thread = new Thread(this, "Thread");
	thread.start();
		
	}
	
	private synchronized void stop(){
		if(!running) return; //return = Get out of this method
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

	public void run() {
		//timers
		init();
		requestFocus();
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		double delta = 0.0;
		double ns = 1000000000.0/60.0;
		int frames = 0;
		int ticks = 0;
		
		while(running){
			long now = System.nanoTime();
			delta+=(now-lastTime)/ns;
			lastTime = now;
			
			while(delta >= 1){
				tick();
				ticks++;
				delta--;
				
			}
			render();
			frames++;
			
			if(System.currentTimeMillis()-timer > 1000){
				timer+=1000;
				System.out.println(frames + "Frames per Seconds " + ticks + "Updates Per Seconds");
				frames = 0;
				ticks = 0;
			}
		}
	
		stop();
		}
	
	//render = display everything on the screen
	public void render(){
		//buffer 
		
		BufferStrategy bs = getBufferStrategy();
		if(bs==null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.translate(cam.getX(),cam.getY());
		handler.render(g);
		g.dispose();
		bs.show();
	}
	
	//tick = update
	public void tick(){
		handler.tick();
		
		for(Entity e:handler.entity){
			if(e.getID() == ID.player){
				cam.tick(e);
			}
		}
		
	}
	
	public static int getFramewidth(){
		return WIDTH*SCALE;
	}
	
	public static int getFrameHeight(){
		return HEIGHT*SCALE;
	}
	public static void main(String[] args){
		//creating an object
		MainClass game = new MainClass();
		JFrame frame = new JFrame(TITLE);
		frame.add(game);
		frame.pack();
		frame.setResizable(false);// MEANS WE CANT RESIZE OUR FRAME
		frame.setLocationRelativeTo(null);// sets the frame in the middle of the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		game.start();
	}

 }

