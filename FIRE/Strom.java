import fri.shapesge.Stvorec;

public class Strom {
    private Stvorec strom;
    
    public Strom(String farba, int x, int y) {
        this.strom = new Stvorec();
        this.strom.zmenStranu(1);
        this.strom.zmenPolohu(x, y);
        this.strom.zmenFarbu(farba);
        this.strom.zobraz();
    }
    
    public void akcia(String farba) {
        this.strom.zmenFarbu(farba);
    }
}