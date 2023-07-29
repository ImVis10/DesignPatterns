package SOLID.InterfaceSegregation.Solution;

public class Chef implements ChefInterface {
    
    @Override
    public void cookFood() {
        System.out.println("Cooking delicious food");
    }
}
