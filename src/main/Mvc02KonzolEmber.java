
package main;

import modell.EmberModell;
import nezet.CuiNezet;
import vezerlo.CUIVezerlo;


public class Mvc02KonzolEmber {

    public static void main(String[] args) {
        EmberModell modell =new EmberModell("Nem ezt adom meg");
        CuiNezet nezet = new CuiNezet();
        CUIVezerlo vezerlo =new CUIVezerlo(modell, nezet);
    }
    
}
