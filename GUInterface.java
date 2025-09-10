
import javax.swing.JOptionPane;

public class GUInterface {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + "years old.");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height(cm)) "));
        JOptionPane.showMessageDialog(null, "you are " + height + "cm tall");
    }
    
}