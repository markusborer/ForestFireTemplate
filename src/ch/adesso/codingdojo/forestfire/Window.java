package ch.adesso.codingdojo.forestfire;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private int width;
	private int height;
	private long lastTime = System.nanoTime();
	private BufferedImage image;

	public Window(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		initialize();
	}

	private void initialize() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics graphics) {
				super.paint(graphics);
				graphics.drawImage(image, 0, 0, null);
				showFramesCount();
			}
		};
		panel.setPreferredSize(new Dimension(width, height));
		this.add(panel);
		this.pack();
	}

	private void showFramesCount() {
	    long time = System.nanoTime();
	    long frames = 1000000000l / (time - lastTime);
	    setTitle("Frames " + frames);
	    lastTime = time;
    }

	public void setColor(int x, int y, int[] color) {
		image.getRaster().setPixel(x, y, color);
	}

}
