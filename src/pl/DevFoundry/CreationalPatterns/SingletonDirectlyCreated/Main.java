package pl.DevFoundry.CreationalPatterns.SingletonDirectlyCreated;

import pl.DevFoundry.CreationalPatterns.SingletonDirectlyCreated.singleton.GameEngine;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();

        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine == engine2);
    }
}
