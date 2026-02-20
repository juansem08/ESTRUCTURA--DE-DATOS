public interface HouseBuilder {

    void buildWalls();
    void buildRoof();
    void buildGarage();
    void buildSwimmingPool();
    void buildGarden();
    void buildStatues();

    House getResult();
}