import fri.shapesge.Manazer;

public class Celok {
    private Manazer manazer;
    private Ohen ohen;
    private Les les;
    private Pocitadlo pocitadlo;
    public Celok(int velkostX, int velkostY, int hustota) {
        this.manazer = new Manazer();
        
        this.les = new Les(velkostX, velkostY, hustota);
        this.ohen = new Ohen(this.les);
        this.manazer.spravujObjekt(this.ohen);
    }
    
    public void ukonci(){ 
        this.manazer.prestanSpravovatObjekt(this.ohen);
        this.pocitadlo = new Pocitadlo(this.les);
    }
}
