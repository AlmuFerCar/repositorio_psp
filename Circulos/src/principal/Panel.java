package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel
{
	public Panel()
	{
		setBackground(Color.GREEN);
		setForeground(Color.WHITE);
		setPreferredSize(new Dimension(200,200));
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(75, 75, 50, 50);
	}

}
