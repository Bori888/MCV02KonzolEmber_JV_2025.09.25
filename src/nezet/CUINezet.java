
package nezet;

import java.util.Scanner;

public class CUINezet {
    private static final Scanner sc =new Scanner(System.in);
     public void mutat(String uzenet) {
        System.out.println(uzenet);
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
