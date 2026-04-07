public class TestAnimal{
    public static void main(String []args){
        // Create the AnimalRegistry with default prototypes
        AnimalRegistry registry = new AnimalRegistry();

        // Create clones of animals using the registry
        System.out.println("=== Creating Animals using Prototype Pattern ===");
        
        Animal sheep1 = registry.createSheep();
        Animal sheep2 = registry.createSheep();
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        // Demonstrate that clones work
        System.out.println("\n=== Animal Types and Sounds ===");
        System.out.print(sheep1.getType() + ": ");
        sheep1.makeSound();
        
        System.out.print(sheep2.getType() + ": ");
        sheep2.makeSound();
        
        System.out.print(cow1.getType() + ": ");
        cow1.makeSound();
        
        System.out.print(horse1.getType() + ": ");
        horse1.makeSound();

        // Verify that sheep1 and sheep2 are different objects
        System.out.println("\n=== Verify Cloning (Different Objects) ===");
        System.out.println("sheep1 == sheep2: " + (sheep1 == sheep2));
        System.out.println("sheep1.equals(sheep2): " + (sheep1.equals(sheep2)));
        System.out.println("sheep1 class: " + sheep1.getClass().getName());
        System.out.println("sheep2 class: " + sheep2.getClass().getName());
    }
}