import java.util.Random;

public class Les {
    private Strom[][] les;

    public Les(int rozmerX, int rozmerY, int hustota) {
        
        this.les = new Strom[rozmerX][rozmerY];
        Random random = new Random();

        int totalStvorce = rozmerX * rozmerY;
        int zeleneStvorce = (totalStvorce * hustota) / 100; 

        
        for (int i = 0; i < rozmerX; i++) {
            for (int j = 0; j < rozmerY; j++) {
                this.les[i][j] = new Strom("black", i, j);
                
            }
        }

        
        int priradeneZelene = 0;
        while (priradeneZelene < zeleneStvorce) {
            int randomX = random.nextInt(rozmerX); 
            int randomY = random.nextInt(rozmerY); 

            
            if (!this.les[randomX][randomY].getFarba().equals("green")) {
                this.les[randomX][randomY].akcia("green"); 
                priradeneZelene++;
            }

        }
    }
}