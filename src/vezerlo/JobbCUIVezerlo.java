
package vezerlo;

import modell.EmberModell;
import nezet.JobbNezet;


public class JobbCUIVezerlo {
    private EmberModell modell;
    private JobbNezet nezet;

    public JobbCUIVezerlo(EmberModell modell, JobbNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        
        modell.setNev(nezet.getNev());
        modell.setKor(nezet.getKor());
        /*
        String nev = nezet.bekerNev();
        int kor = nezet.bekerKor();
        
        nezet.bekerKor();
        nezet.bekerNev();*/
        
        String kimenet ="%s kora: %d".formatted(modell.getNev(),modell.getKor());
        nezet.mutat(kimenet);
    }
    
}
