
package main;

import modell.EmberModell;
import nezet.CuiNezet;
import vezerlo.CUIVezerlo;


public class Mvc02KonzolEmber {

    public static void main(String[] args) {
        CuiNezet nezet = new CuiNezet();
        nezet.bekerNev();
        nezet.bekerKor();
        
        
        
        EmberModell modell =new EmberModell(nezet.getNev();nezet.getKor());
        
        CUIVezerlo vezerlo =new CUIVezerlo(modell, nezet);
    }
    
}
