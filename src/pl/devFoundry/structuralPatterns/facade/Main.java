package pl.devFoundry.structuralPatterns.facade;

import pl.devFoundry.structuralPatterns.facade.deliverybox.DeliveryBoxFacade;

public class Main {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }
}
