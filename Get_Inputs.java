package principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Get_Inputs {
     

    public static void getInputsFromJOptionPane()
    {
        String name;
        name = JOptionPane.showInputDialog(null,
         "Please enter your name");
        JOptionPane.showMessageDialog(null,"Hi "+ name);
        
 
    }
     
    public static void main(String args[])
    {

       getInputsFromJOptionPane(); 

    }
  
}