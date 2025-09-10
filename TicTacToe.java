
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame implements ActionListener 
{
  private JButton[][] buttons = new JButton[3][3];
  private boolean player1Turn = true;

  public TicTacToe() {
    super("Tic Tac Toe");
    setLayout(new GridLayout(3, 3));
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        buttons[i][j] = new JButton();
        buttons[i][j].addActionListener(this);
        add(buttons[i][j]);
      }
    }
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    JButton buttonClicked = (JButton) e.getSource();
    if (buttonClicked.getText().equals("")) {
      if (player1Turn) {
        buttonClicked.setText("X");
      } else {
        buttonClicked.setText("O");
      }
      player1Turn = !player1Turn;
    } else {
      JOptionPane.showMessageDialog(this, "This space is already occupied!");
    }
    checkForWin();
  }

  public void checkForWin() {
    for (int i = 0; i < 3; i++) {
      // check for horizontal wins
      if (buttons[i][0].getText().equals(buttons[i][1].getText()) && buttons[i][0].getText().equals(buttons[i][2].getText()) && !buttons[i][0].getText().equals("")) {
        showWinMessage(buttons[i][0].getText());
        return;
      }
      // check for vertical wins
      if (buttons[0][i].getText().equals(buttons[1][i].getText()) && buttons[0][i].getText().equals(buttons[2][i].getText()) && !buttons[0][i].getText().equals("")) {
        showWinMessage(buttons[0][i].getText());
        return;
      }
    }
    // check for diagonal wins
    if (buttons[0][0].getText().equals(buttons[1][1].getText()) && buttons[0][0].getText().equals(buttons[2][2].getText()) && !buttons[0][0].getText().equals("")) {
      showWinMessage(buttons[0][0].getText());
      return;
    }
    if (buttons[0][2].getText().equals(buttons[1][1].getText()) && buttons[0][2].getText().equals(buttons[2][0].getText()) && !buttons[0][2].getText().equals("")) {
      showWinMessage(buttons[0][2].getText());
      return;
    }
  }

  public void showWinMessage(String player) {
    JOptionPane.showMessageDialog(this, player + " wins!");
    resetGame();
  }

  public void resetGame() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        buttons[i][j].setText("");
      }
    }
    player1Turn = true;
  }

  public static void main(String[] args) {
    new TicTacToe();
  }
}


