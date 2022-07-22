package Flappybird;

import java.awt.Graphics;

import javax.swing.JPanel;

// import Flappybird.FlappyBird;

public class Renderer extends JPanel
{

	// private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		FlappyBird.flappyBird.repaint(g);
	}
	
}