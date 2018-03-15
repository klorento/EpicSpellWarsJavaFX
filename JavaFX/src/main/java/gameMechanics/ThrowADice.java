package gameMechanics;

import java.util.Random;

public class ThrowADice {
    Random random = new Random();
    public ThrowADice() {
        System.out.println(random.nextInt(6)+1);
    }
}
