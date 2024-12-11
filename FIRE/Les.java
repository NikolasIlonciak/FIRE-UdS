import java.util.Random;

public class Les {
    private Stvorec[][] les;

    public Les(int rozmerX, int rozmerY, int stranaStvorca, int hustota) {
        
        this.les = new Stvorec[rozmerX][rozmerY];
        Random random = new Random();

        int totalStvorce = rozmerX * rozmerY;
        int zeleneStvorce = (totalStvorce * hustota) / 100; 

        
        for (int i = 0; i < rozmerX; i++) {
            for (int j = 0; j < rozmerY; j++) {
                this.les[i][j] = new Stvorec();
                this.les[i][j].zmenPolohu(j * stranaStvorca, i * stranaStvorca); 
                this.les[i][j].zmenStranu(stranaStvorca); 
                this.les[i][j].zmenFarbu("black"); 
            }
        }

        
        int priradeneZelene = 0;
        while (priradeneZelene < zeleneStvorce) {
            int randomX = random.nextInt(rozmerX); 
            int randomY = random.nextInt(rozmerY); 

            
            if (!this.les[randomX][randomY].getFarba().equals("green")) {
                this.les[randomX][randomY].zmenFarbu("green"); 
                priradeneZelene++;
            }

        }
    }
}