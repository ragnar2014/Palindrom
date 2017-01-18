/**Laboration 2-2**/
/**Av David Nilsson L�fvall**/
/**L�rare: Mikael Nilsson/Robert Jonsson**/
/**Ett program som testar om inmatad str�ng �r en palindrom eller inte. Programmet tar bort mellanslag f�r fraser och 
 * fungerar oavsett om man skriver med gemener eller versal. Till hj�lp anv�nder programmet StringBuffer klassen.**/

package palindrom;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;


public class Palindrom {

	public static void main(String[] args) {
		JOptionPane window= new JOptionPane();
		
		//Skapar inmatning som lagras i en str�ng
		String input= window.showInputDialog("Put in word");
		
		String editInput=input.replaceAll("\\s+","");
		
		//Skapar en StringBuffer fr�n str�ngen
		StringBuffer str2= new StringBuffer(editInput);
		
		//V�nder StringBuffern
		str2.reverse();
		
		//G�r om alla char till gemener i editInput
		String tolower= editInput.toLowerCase();
		
		
		//J�mf�r StringBuffern med inmatade str�ngen
		if(str2.toString().toLowerCase().equals(tolower))
		{
			
			JOptionPane.showMessageDialog(window, "The word "+input+ " is a palindrome");
			
		}
		
		else
		{
			JOptionPane.showMessageDialog(window,"The word "+input+ " is not a palindrome");
		}

	}

}
