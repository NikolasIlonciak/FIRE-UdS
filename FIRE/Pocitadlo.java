public class Pocitadlo {
    
    private Les les;
        
    public Pocitadlo(Les les) {
        this.les = les;
        
        int zelene = 0;
        int zhorene = 0;
        
        for (int i = 0; i < this.les.getRozmerX(); i++) {
            for (int j = 0; j < this.les.getRozmerY(); j++) {
                if (this.les.getStrom(i, j).getFarba().equals("green")) {
                    zelene++;
                } else if (this.les.getStrom(i, j).getFarba().equals("red")) {
                    zhorene++;
                }
            }
        }
        
        System.out.println("Pocet stromov ktore nezhorely: " + zelene);
        System.out.println("Pocet stromov ktore zhorely: " + zhorene);
    }
}
