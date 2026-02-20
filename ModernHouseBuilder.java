public class ModernHouseBuilder implements HouseBuilder {

    private House house;

    public ModernHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        house.walls = "Concrete walls";
    }

    @Override
    public void buildRoof() {
        house.roof = "Modern roof";
    }

    @Override
    public void buildGarage() {
        house.hasGarage = true;
    }

    @Override
    public void buildSwimmingPool() {
        house.hasSwimmingPool = true;
    }

    @Override
    public void buildGarden() {
        house.hasGarden = true;
    }

    @Override
    public void buildStatues() {
        house.hasStatues = true;
    }

    @Override
    public House getResult() {
        return house;
    }
}