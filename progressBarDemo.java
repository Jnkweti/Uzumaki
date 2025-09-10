
import java.awt.*;
import javax.swing.*;


public class progressBarDemo {
    
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    progressBarDemo(){

        bar.setValue(10);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        
        fill();
    }
    public void fill()
    {
        int counter = 0;
        // while(counter <= 100) {
        //     bar.setValue(counter);
        //     try {
        //       Thread.sleep(10);
        //     } catch (InterruptedException e) {
        //       e.printStackTrace();
        //     }
        //     counter += 1;
        //   }
          

        while(counter <= 100)
        {
            bar.setValue(counter);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        counter += 1;
        }
        
    }
    class Solution {
        public boolean detectCapitalUse(String word) {
            boolean allUpper = true;
            for (int i = 1; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    allUpper = false;
                    break;
                }
            }
            if (Character.isUpperCase(word.charAt(0)) && allUpper) {
                return true;
            }
            if (Character.isUpperCase(word.charAt(0)) && !allUpper) {
                return false;
            }
            if (Character.isLowerCase(word.charAt(0)) && !allUpper) {
                return true;
            }
            if (Character.isLowerCase(word.charAt(0)) && allUpper) {
                return false;
            }
            return false;
        }
    }
    
}
