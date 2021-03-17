package pl.DevFoundry.CreationalPatterns.SingletonPreventFromSerialization;

import pl.DevFoundry.CreationalPatterns.SingletonPreventFromSerialization.singleton.GameEngine;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();

        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine == engine2);
    }
}
