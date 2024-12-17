public class Ohen {
    private int tikCounter;
    private int cislo;
    private Les les;
    
    //na pravej strane pola lesa sa nastavi farba vsetkych stromov na cervenu
    public Ohen(Les les) {
        this.les = les;
        this.cislo = 1;
        this.tikCounter = 0;
        for(int i = 0; i < les.getRozmerX(); i++ ) {
            les.setStrom(0, i, "red");
        }
    }
    
    //spusti akciu horenia a zmeni susedne zelene stromi na cervene
    public void hori(int tik) {
        for(int i = 0; i < tik; i++ ) {
            for(int j = 0; j < les.getRozmerY(); j++) {
                if(les.getStrom(i, j).getFarba().equals("green")) {
                    try{
                        if(les.getStrom(i+1, j).getFarba().equals("red")) {
                            les.setStrom(i, j, "red");
                        }
                    } catch(ArrayIndexOutOfBoundsException e){}
                    try{
                        if(les.getStrom(i-1, j).getFarba().equals("red")) {
                            les.setStrom(i, j, "red");
                        }
                    } catch(ArrayIndexOutOfBoundsException e){}
                    try{   
                        if(les.getStrom(i, j+1).getFarba().equals("red")) {
                            les.setStrom(i, j, "red");
                        }
                    } catch(ArrayIndexOutOfBoundsException e){}
                    try{    
                        if(les.getStrom(i, j-1).getFarba().equals("red")) {
                            les.setStrom(i, j, "red");
                        }
                    } catch(ArrayIndexOutOfBoundsException e){}
                }
            }
        }
    } 
    
    //casovac ktory sa raz za sekundu spusti
    public void tik() {
        try{
            if (this.tikCounter < 1) {
                this.tikCounter++;
                return;
            }
            this.tikCounter = 0;
            this.hori(this.cislo);
            this.cislo++;
        } catch(ArrayIndexOutOfBoundsException e){}
    }
}
