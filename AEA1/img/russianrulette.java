import javax.swing.*;
import java.awt.*;

public class russianrulette{
	public static void main(String[] args){
        // Create a new JFrame
        JFrame frame = new JFrame("Image Display Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        // Load the image
        ImageIcon imageIcon = new ImageIcon("C:/Users/Gerard/Documents/Prat/Java/AEA1/img/barrel.png"); // Update the path
        JLabel label = new JLabel(imageIcon);
        
        // Add the label to the frame
        frame.getContentPane().add(label);
        
        // Set frame to be visible
        frame.setVisible(true);
	}
}