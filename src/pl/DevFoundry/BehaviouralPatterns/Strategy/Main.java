package pl.DevFoundry.BehaviouralPatterns.Strategy;

import pl.DevFoundry.BehaviouralPatterns.Strategy.chef.Chef;
import pl.DevFoundry.BehaviouralPatterns.Strategy.chef.egg_cooker.HardBoiledEggCooker;
import pl.DevFoundry.BehaviouralPatterns.Strategy.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        //Nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //Nowe zamówienie - jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }
}
