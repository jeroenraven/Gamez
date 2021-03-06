package engine.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import engine.scene.entity.Player;

public class Keyboard implements KeyListener {
	private final boolean[] down;
	public boolean left = false;

	public Keyboard() {
		down = new boolean[256];
	}

	public boolean isDown(final int code) {
		return down[code];
	}

	@Override
	public void keyPressed(final KeyEvent e) {
		down[e.getKeyCode()] = true;
		//System.out.println(e.getKeyCode());
		if (down[65]) {
			Player.left(true);
			//System.out.println("left");
		}
		if (down[32]) {
			Player.up(true);
			//System.out.println("up");
		}
		if (down[83]) {
			Player.down(true);
			//System.out.println("down");
		}
		if (down[68]) {
			Player.right(true);
			//System.out.println("right");
		}
		if (down[16]){
			Player.sprint(true);
		}
		if (down[27]) {
			System.exit(-1);
		}
	}

	@Override
	public void keyReleased(final KeyEvent e) {
		down[e.getKeyCode()] = false;
		if (!down[65]) {
			Player.left(false);
			//System.out.println("not left");
		} 
		if (!down[32]) {
			Player.up(false);
			//System.out.println("not up");
		}
		if (!down[83]) {
			Player.down(false);
			//System.out.println("not down");
		} 
		if (!down[68]) {
			Player.right(false);
			//System.out.println("not right");
		}
		if (!down[16]) {
			Player.sprint(false);
		}
	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
