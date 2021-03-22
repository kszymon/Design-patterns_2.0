package pl.devFoundry.creationalPatterns.singletonPreventFromReflection;

import pl.devFoundry.creationalPatterns.singletonPreventFromReflection.singleton.GameEngineEnum;

public class Main {

    public static void main(String[] args) {

        GameEngineEnum engine = GameEngineEnum.INSTANCE;

        GameEngineEnum engine2 = GameEngineEnum.INSTANCE;

        System.out.println(engine == engine2);

    }
}
