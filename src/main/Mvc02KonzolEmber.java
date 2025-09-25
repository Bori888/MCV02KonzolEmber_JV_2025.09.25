
package main;

import modell.EmberModell;
import nezet.CUINezet;
import vezerlo.CUIVezerlo;


public class Mvc02KonzolEmber {

    public static void main(String[] args) {
        CUINezet nezet = new CUINezet();
        nezet.bekerNev();
        nezet.bekerKor();
        
        
        
        EmberModell modell =new EmberModell(nezet.getNev();nezet.getKor());
        
        CUIVezerlo vezerlo =new CUIVezerlo(modell, nezet);
    }
    
}
