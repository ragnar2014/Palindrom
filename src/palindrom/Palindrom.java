/**Laboration 2-2**/
/**Av David Nilsson Löfvall**/
/**Lärare: Mikael Nilsson/Robert Jonsson**/
/**Ett program som testar om inmatad sträng är en palindrom eller inte. Programmet tar bort mellanslag för fraser och 
 * fungerar oavsett om man skriver med gemener eller versal. Till hjälp använder programmet StringBuffer klassen.**/

package palindrom;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;


public class Palindrom {

	public static void main(String[] args) {
		JOptionPane window= new JOptionPane();
		
		//Skapar inmatning som lagras i en sträng
		String input= window.showInputDialog("Put in word");
		
		String editInput=input.replaceAll("\\s+","");
		
		//Skapar en StringBuffer från strängen
		StringBuffer str2= new StringBuffer(editInput);
		
		//Vänder StringBuffern
		str2.reverse();
		
		//Gör om alla char till gemener i editInput
		String tolower= editInput.toLowerCase();
		
		
		//Jämför StringBuffern med inmatade strängen
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
