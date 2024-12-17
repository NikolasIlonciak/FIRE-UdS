import fri.shapesge.Manazer;

public class Celok {
    private Manazer manazer;
    private Ohen ohen;
    private Les les;
    private Pocitadlo pocitadlo;
    
    //vytvori vsetky potrebne objekty a pomocou Triedy manazer ich spusti
    public Celok(int velkostX, int velkostY, int hustota) {
        this.manazer = new Manazer();
        
        this.les = new Les(velkostX, velkostY, hustota);
        this.ohen = new Ohen(this.les);
        this.manazer.spravujObjekt(this.ohen);
    }
    
    //zastvi manazera a vytvori nove pocitadlo
    public void ukonci(){ 
        this.manazer.prestanSpravovatObjekt(this.ohen);
        this.pocitadlo = new Pocitadlo(this.les);
    }
}
