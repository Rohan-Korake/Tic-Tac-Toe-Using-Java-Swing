import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Tic_Tac_Toe
{
    public static void main(String[] args)
    {
        ProceedGame pr=new ProceedGame();
        pr.Build_GUI();
    }
}
class ProceedGame 
{
    //Global variable declaration section start
    int X_Win=0,O_Win=0;
    int X_Turn=0,O_Turn=0;
    int Draw_Count=0;
    //Global variable declaration section end

    //Global object declaration section start
    JFrame jr;
    JButton b00,b01,b02,b10,b11,b12,b20,b21,b22;
    JTextField ply1win,ply2win,ply1loss,ply2loss,ply1turn,ply2turn;
    //Global object declaration section start

    //Build GUI function start
    public void Build_GUI()
    {
        jr=new JFrame("Tic Tac Toe");

        //Heading section
        JLabel Title=new JLabel("Tic Tac Toe");
        Title.setFont(new Font("Times New Roman", Font.BOLD, 30));

        //Top row button
        b00=new JButton();
        b01=new JButton();
        b02=new JButton();

        //Middle row button
        b10=new JButton();
        b11=new JButton();
        b12=new JButton();

        //Bottom row button
        b20=new JButton();
        b21=new JButton();
        b22=new JButton();

        //Turn indicator board
        ply1turn=new JTextField();
        ply1turn.setText(" Player O playing");
        ply1turn.setEditable(false);

        ply2turn=new JTextField();
        ply2turn.setText(" Player O's Turn");
        ply2turn.setEditable(false);

        //Player 1 score board
        ply1win=new JTextField();
        ply1win.setText("  Total Wins : 0");
        ply1win.setEditable(false);

        ply1loss=new JTextField();
        ply1loss.setText("Total Losses : 0");
        ply1loss.setEditable(false); 

        //Player 2 score board
        ply2win=new JTextField();
        ply2win.setText("  Total Wins : 0");
        ply2win.setEditable(false);
 
        ply2loss=new JTextField();
        ply2loss.setText("Total Losses : 0");
        ply2loss.setEditable(false); 

        //Heading label adding into frame 
        jr.add(Title);

        //Top row button adding into frame
        jr.add(b00);
        jr.add(b01);
        jr.add(b02);

        //Middle row button adding into frame
        jr.add(b10);
        jr.add(b11);
        jr.add(b12);

        //Bottom row button adding into frame
        jr.add(b20);
        jr.add(b21);
        jr.add(b22);

        //Turn indicator board adding into frame
        jr.add(ply1turn);
        jr.add(ply2turn);

        //Player 1 score board adding into frame
        jr.add(ply1win);
        jr.add(ply1loss);

        //Player 2 score board adding into frame
        jr.add(ply2win);
        jr.add(ply2loss);

        //Heading label alignment and size
        Title.setBounds(120, 20, 200, 30);

        //Player 1 score board
        ply1win.setBounds(30,70,100,50);
        ply1loss.setBounds(250,70,100,50);
        ply1turn.setBounds(140, 70, 100, 50);

        //Top row button alignment and size
        b00.setBounds(30, 130, 100, 100);
        b01.setBounds(140, 130, 100, 100);
        b02.setBounds(250, 130, 100, 100);

        //Middle row button alignment and size
        b10.setBounds(30, 240, 100, 100);
        b11.setBounds(140, 240, 100, 100);
        b12.setBounds(250, 240, 100, 100);

        //Bottom row button alignment and size
        b20.setBounds(30, 350, 100, 100);
        b21.setBounds(140, 350, 100, 100);
        b22.setBounds(250, 350, 100, 100);
        
        //Player 2 score board
        ply2win.setBounds(30, 460, 100, 50);
        ply2loss.setBounds(250, 460, 100, 50);
        ply2turn.setBounds(140, 460, 100, 50);

        //Add ButtonListener section start
        ButtonListener buttonListener = new ButtonListener();
        b00.addActionListener(buttonListener);
        b01.addActionListener(buttonListener);
        b02.addActionListener(buttonListener);
        b10.addActionListener(buttonListener);
        b11.addActionListener(buttonListener);
        b12.addActionListener(buttonListener);
        b20.addActionListener(buttonListener);
        b21.addActionListener(buttonListener);
        b22.addActionListener(buttonListener);
        //Add ButtonListener section end     
        
        //Action command to indicate button object section start
        b00.setActionCommand("b00");
        b01.setActionCommand("b01");
        b02.setActionCommand("b02");
        b10.setActionCommand("b10");
        b11.setActionCommand("b11");
        b12.setActionCommand("b12");
        b20.setActionCommand("b20");
        b21.setActionCommand("b21");
        b22.setActionCommand("b22");
        //Action command to indicate button object section end        

        //Frame Initilization section start
        jr.setSize(400,600);
        jr.setLayout(null);
        jr.setVisible(true);
        jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Frame Initilization section end
    }
    //Build GUI function end

    //Button listener block start
    private class ButtonListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            String actionCommand = e.getActionCommand();
            switch (actionCommand) 
            {
                case "b00":
                if (O_Turn==0)
                {
                    ProceedForword(b00);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b00);
                    checkWinner();
                }
                    break;

                case "b01":
                if (O_Turn==0)
                {
                    ProceedForword(b01);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b01);
                    checkWinner();
                }
                    break;

                case "b02":
                if (O_Turn==0)
                {
                    ProceedForword(b02);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b02);
                    checkWinner();
                }                    
                    break;

                case "b10":
                     if (O_Turn==0)
                {
                    ProceedForword(b10);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b10);
                    checkWinner();
                }
                    break;

                case "b11":
                if (O_Turn==0)
                {
                    ProceedForword(b11);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b11);
                    checkWinner();
                }
                    break;
                case "b12":
                if (O_Turn==0)
                {
                    ProceedForword(b12);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b12);
                    checkWinner();
                }
                    break;

                case "b20":
                if (O_Turn==0)
                {
                    ProceedForword(b20);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b20);
                    checkWinner();
                }
                    break;

                case "b21":
                     if (O_Turn==0)
                {
                    ProceedForword(b21);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b21);
                    checkWinner();
                }
                    break;

                case "b22":
                if (O_Turn==0)
                {
                    ProceedForword(b22);
                    checkWinner();
                }
                else
                {
                    ProceedForword(b22);
                    checkWinner();
                }
                    break;

                default:
                    break;
            }
        }
    }
    //Button listener block end

    //ProceedForword function start
    public void ProceedForword(JButton Cur_obj)
    {
        Draw_Count++;
        Cur_obj.setFont(new Font("Times New Roman",Font.BOLD,67)); 
        Cur_obj.setEnabled(false);
        if (O_Turn==0)
          {
            O_Turn=1;
            X_Turn=0;
            Cur_obj.setText("O");
            Turn_Indicator("O");
          }
          else
          {
            O_Turn=0;
            X_Turn=1;
            Cur_obj.setText("X");
            Turn_Indicator("X");
          }
    }
    //ProceedForword function end

    //CheckWinner function start
    public void checkWinner()
    {
        if(b00.getText().equals("X") && b11.getText().equals("X") && b22.getText().equals("X")    //Top-Left to Bottom-Right diagonal 
        || b02.getText().equals("X") && b11.getText().equals("X") && b20.getText().equals("X")  //Top-Right to Bottom-left diagonal
        || b00.getText().equals("X") && b01.getText().equals("X") && b02.getText().equals("X")  //Top Row 
        || b10.getText().equals("X") && b11.getText().equals("X") && b12.getText().equals("X")  //Middle Row 
        || b20.getText().equals("X") && b21.getText().equals("X") && b22.getText().equals("X")  //Bottom Row 
        || b00.getText().equals("X") && b10.getText().equals("X") && b20.getText().equals("X")  //Left Column
        || b01.getText().equals("X") && b11.getText().equals("X") && b21.getText().equals("X")  //Middle Column
        || b02.getText().equals("X") && b12.getText().equals("X") && b22.getText().equals("X")) //Right Column
        {
            X_Win++;
            ply1win.setText("  Total Wins : "+X_Win);
            ply1loss.setText("Total Losses : "+O_Win);
            ply2win.setText("  Total Wins : "+O_Win);
            ply2loss.setText("Total Losses : "+X_Win);
            ply1turn.setText("        X wins!");
            ply2turn.setText("        X wins!");
            Popup('X');
        }
        else if (b00.getText().equals("O") && b11.getText().equals("O") && b22.getText().equals("O")    //Top-Left to Bottom-Right diagonal 
        || b02.getText().equals("O") && b11.getText().equals("O") && b20.getText().equals("O")  //Top-Right to Bottom-left diagonal
        || b00.getText().equals("O") && b01.getText().equals("O") && b02.getText().equals("O")  //Top Row 
        || b10.getText().equals("O") && b11.getText().equals("O") && b12.getText().equals("O")  //Middle Row 
        || b20.getText().equals("O") && b21.getText().equals("O") && b22.getText().equals("O")  //Bottom Row 
        || b00.getText().equals("O") && b10.getText().equals("O") && b20.getText().equals("O")  //Left Column
        || b01.getText().equals("O") && b11.getText().equals("O") && b21.getText().equals("O")  //Middle Column
        || b02.getText().equals("O") && b12.getText().equals("O") && b22.getText().equals("O")) //Right Column
        {
            O_Win++;
            ply1win.setText("  Total Wins : "+X_Win);
            ply1loss.setText("Total Losses : "+O_Win);
            ply2win.setText("  Total Wins : "+O_Win);
            ply2loss.setText("Total Losses : "+X_Win);
            ply1turn.setText("        O wins!");
            ply2turn.setText("        O wins!");
            Popup('O');
        }
        if (Draw_Count==9) 
        {
            ply1turn.setText("      Match Draw!");
            ply2turn.setText("      Match Draw!");
            Popup('D');
        }
    }
    //CheckWinner function end

    //Turn indicator function start
    public void Turn_Indicator(String currentPlayer)
    {
        if (currentPlayer.equals("O")) 
        {
            ply1turn.setText(" Player X's Turn");
            ply2turn.setText(" Player X playing");
        }
        else if (currentPlayer.equals("X")) 
        {
            ply2turn.setText(" Player O's Turn");
            ply1turn.setText(" Player O playing");
        }
    }
    //Turn indicator function end

    //Winner or draw match popup function start
    public void Popup(char GameResult)
    {
        if(GameResult=='X')
        {
          ImageIcon WinIcon = new ImageIcon("Win_Icon.png"); 
          int Win_response = JOptionPane.showOptionDialog(jr, "Player X Wins! Well played!","Congratulations!",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.INFORMATION_MESSAGE, 
          WinIcon, 
          new String[]{"Replay", "Exit"}, "Replay");

          if(Win_response==0)
          {
            ReplaySetup('X');
          }
          else if(Win_response==1)
          {
            System.exit(0);
          }
        }
        else if(GameResult=='O')
        {
          ImageIcon WinIcon = new ImageIcon("Win_Icon.png"); 
          int Win_response = JOptionPane.showOptionDialog(jr, "Player O Wins! Well played!","Congratulations!",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.INFORMATION_MESSAGE, 
          WinIcon, 
          new String[]{"Replay", "Exit"}, "Replay");
          
          if(Win_response==0)
            {
                ReplaySetup('O');
            }
            else if(Win_response==1)
            {
              System.exit(0);
            }
        }
    
        if(GameResult=='D' && Draw_Count==9)
        {
            int Win_response = JOptionPane.showOptionDialog(jr, "Match tied ! No winner in this round","Match drawn!",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,null,
            new String[]{"Replay", "Exit"}, "Replay");

            if(Win_response==0)
            {
                ReplaySetup('D'); 
            }
            else if(Win_response==1)
            {
            System.exit(0);
            }
        }
    }
    //Winner or draw match popup function start

    //Replay board setup function start
    public void ReplaySetup(char win)
    {
        b00.setEnabled(true);
        b00.setText("");

        b01.setEnabled(true);
        b01.setText("");

        b02.setEnabled(true);
        b02.setText("");

        b10.setEnabled(true);
        b10.setText("");

        b11.setEnabled(true);
        b11.setText("");

        b12.setEnabled(true);
        b12.setText("");

        b20.setEnabled(true);
        b20.setText("");

        b21.setEnabled(true);
        b21.setText("");

        b22.setEnabled(true);
        b22.setText("");

        Draw_Count=0;

        //Turn set section start
        if(win=='X')
        {
            ply1turn.setText(" Player X's Turn");
            ply2turn.setText(" Player X playing");
            O_Turn=1;
            X_Turn=0;
        }
        else
        {
            ply2turn.setText(" Player O's Turn");
            ply1turn.setText(" Player O playing");
            O_Turn=0;
            X_Turn=1;
        }
        //Turn set section start

    }
    //Replay board setup function start
}
