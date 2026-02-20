public class House implements Prototype {

    protected String walls;
    protected String roof;
    protected boolean hasGarage;
    protected boolean hasSwimmingPool;
    protected boolean hasGarden;
    protected boolean hasStatues;

    public House() {
    }

    // Constructor de copia (usado por Prototype)
    public House(House target) {
        if (target != null) {
            this.walls = target.walls;
            this.roof = target.roof;
            this.hasGarage = target.hasGarage;
            this.hasSwimmingPool = target.hasSwimmingPool;
            this.hasGarden = target.hasGarden;
            this.hasStatues = target.hasStatues;
        }
    }

    @Override
    public Prototype clone() {
        return new House(this);
    }

    public void showDetails() {
        System.out.println("House details:");
        System.out.println("Walls: " + walls);
        System.out.println("Roof: " + roof);
        System.out.println("Garage: " + hasGarage);
        System.out.println("Swimming Pool: " + hasSwimmingPool);
        System.out.println("Garden: " + hasGarden);
        System.out.println("Statues: " + hasStatues);
        System.out.println("-----------------------------");
    }
}