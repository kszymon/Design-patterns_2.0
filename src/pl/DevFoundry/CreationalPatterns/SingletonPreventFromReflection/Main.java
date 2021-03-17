package pl.DevFoundry.CreationalPatterns.SingletonPreventFromReflection;

import pl.DevFoundry.CreationalPatterns.SingletonPreventFromReflection.singleton.GameEngineEnum;

public class Main {

    public static void main(String[] args) {

        GameEngineEnum engine = GameEngineEnum.INSTANCE;

        GameEngineEnum engine2 = GameEngineEnum.INSTANCE;

        System.out.println(engine == engine2);

    }
}
