package ch.adesso.codingdojo.forestfire;

import javax.swing.WindowConstants;

/**
 * See http://rosettacode.org/wiki/Forest_fire
 */
public class ForestFire {

	private static final float F = 0.0001F;
	private static final float P = 0.03F;
	private static final float TREE_PROB = 0.5F;

	private static final int[] EMPTY_COLOR = new int[] { 0, 0, 0 };
	private static final int[] TREE_COLOR = new int[] { 0, 255, 0 };
	private static final int[] FIRE_COLOR = new int[] { 255, 0, 0 };

	private Window window;
	private int width;
	private int height;

	public ForestFire(int width, int height) {
		this.width = width;
		this.height = height;
		initAndShowWindow();
		initForest();
	}

	private void initAndShowWindow() {
		this.window = new Window(width, height);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	private void initForest() {
		// TODO
		// window.setColor(x, y, TREE_COLOR);
		// window.setColor(x, y, EMPTY_COLOR);
		window.repaint();
	}

	public void processEndless() {
		while (true) {
			process();
			window.repaint();
		}
	}

	private void process() {
		// TODO
	}

}
