package pl.DevFoundry.CreationalPatterns.SingletonDirectlyCreated.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine(); // <-- Singleton

    private GameEngine() {

    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmienamy stan gry
            //renderujemy grafike
        }
    }

    public static GameEngine getInstance() {
        return instance;
    }
}
