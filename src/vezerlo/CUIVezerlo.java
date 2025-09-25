
package vezerlo;

import modell.EmberModell;
import nezet.CuiNezet;


public class CUIVezerlo {
    private EmberModell modell;
    private CuiNezet nezet;

    public CUIVezerlo(EmberModell modell, CuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        String nev = nezet.bekerNev();
        int kor = nezet.bekerKor();
        
        nezet.bekerKor();
        nezet.bekerNev();
        
        String kimenet ="%s kora: %d\n".formatted(modell.getNev(),modell.getKor());
        nezet.mutat(kimenet);
    }
    
}
