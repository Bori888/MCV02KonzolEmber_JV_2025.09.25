
package modell;


public class EmberModell {
    private String nev;
    private int kor;
     public EmberModell(String nev, int kor) {
        this.nev = nev;
         setKor(kor);
    }

    public EmberModell(String nev) {
        this(nev,18);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        /*1<x<130 */
        if(kor<1 || kor>130) {
            throw new IllegalArgumentException("Hibas Adat (1<kor<130)!");

        }
        this.kor = kor;
    }

   
    
}
