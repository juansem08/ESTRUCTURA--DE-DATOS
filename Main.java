public class Main {

    public static void main(String[] args) {

        ConstructionDirector director = new ConstructionDirector();

        // ===== BUILDER =====
        ModernHouseBuilder builder = new ModernHouseBuilder();

        director.buildLuxuryHouse(builder);

        House luxuryHouse = builder.getResult();

        System.out.println("Luxury house created with Builder:");
        luxuryHouse.showDetails();

        // ===== PROTOTYPE =====
        House clonedHouse = (House) luxuryHouse.clone();

        System.out.println("Cloned house created with Prototype:");
        clonedHouse.showDetails();

        // Modificamos la casa clonada
        clonedHouse.hasGarage = false;

        System.out.println("Modified cloned house:");
        clonedHouse.showDetails();
    }
}