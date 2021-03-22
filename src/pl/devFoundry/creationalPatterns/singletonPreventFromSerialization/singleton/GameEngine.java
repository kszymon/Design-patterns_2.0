package pl.devFoundry.creationalPatterns.singletonPreventFromSerialization.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private final static long serialVersionUID = 4147214103390022409L;

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine(); // <-- Singelton

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

    protected Object readResolve(){
        return getInstance();
    }
}
