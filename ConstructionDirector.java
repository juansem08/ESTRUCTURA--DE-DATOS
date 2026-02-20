public class ConstructionDirector {

    public void buildBasicHouse(HouseBuilder builder) {
        builder.buildWalls();
        builder.buildRoof();
    }

    public void buildLuxuryHouse(HouseBuilder builder) {
        builder.buildWalls();
        builder.buildRoof();
        builder.buildGarage();
        builder.buildSwimmingPool();
        builder.buildGarden();
        builder.buildStatues();
    }
}