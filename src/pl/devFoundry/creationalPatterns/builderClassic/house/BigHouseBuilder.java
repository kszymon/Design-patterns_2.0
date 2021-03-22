package pl.devFoundry.creationalPatterns.builderClassic.house;

public class BigHouseBuilder implements HouseBuilder{

    private House house;

    public BigHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big floors");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("big roof");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("big windows");
    }

    @Override
    public void buildDoors() {
        this.house.setWindows("big doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("big garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
