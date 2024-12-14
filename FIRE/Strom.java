import fri.shapesge.Stvorec;

public class Strom {
    private Stvorec strom;
    private String farba;
    
    public Strom(String farba, int x, int y) {
        this.strom = new Stvorec();
        this.strom.zmenStranu(10);
        this.strom.zmenPolohu(x*10, y*10);
        this.strom.zmenFarbu(farba);
        this.farba = farba;
        this.strom.zobraz();
    }
    
    public void akcia(String farba) {
        this.strom.zmenFarbu(farba);
        this.farba = farba;
    }
    
    public String getFarba() {
        return this.farba;
    }
}