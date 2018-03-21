package players;


public class AIPlayer extends Player {
    private static AIPlayer instance;
    static{
        instance = new AIPlayer();
    }
    public static AIPlayer getInstance(){
        return instance;
    }
}
