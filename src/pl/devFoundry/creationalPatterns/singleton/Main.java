package pl.devFoundry.creationalPatterns.singleton;

import pl.devFoundry.creationalPatterns.singleton.singleton.GameEngine;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();

        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine == engine2);
    }
}
