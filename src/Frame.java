import javax.swing.*;

public class Frame {
	public static void main(String[] args){
		JFrame frame= new JFrame("2D Game");
		frame.add(new Board());
		frame.setVisible(true);
		frame.setSize(1200, 600);
	}
}
