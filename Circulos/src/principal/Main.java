package principal;

import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args) 
	{
		JFrame ventana=new JFrame ("Un círculo");
		Panel panel= new Panel();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(panel);
		ventana.pack();
		ventana.setVisible(true);
	}
}
/*https://www.youtube.com/watch?v=hA90h5qB42w*/