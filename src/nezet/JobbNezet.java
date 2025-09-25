
package nezet;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JobbNezet {
    private static final Scanner sc =new Scanner(System.in);
     public void mutat(String uzenet) {
         JOptionPane.showMessageDialog(null, uzenet);
    }

    public String bekerNev() {
        mutat("Név: ");
        return sc.nextLine();
    }
    public int bekerKor() {
        mutat("Kor: ");
        return sc.nextInt();
    }

    
}
