package pl.DevFoundry.StructuralPatterns.Adapter;

public class Main {

    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKSocket ukSocket = new UKSocket();

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Lodon calling to the faraway towns");
            }
        };

        ContinentalDevice continentalDevice = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Lodon calling to the underworld");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio, continentalDevice);

        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);

    }
}
