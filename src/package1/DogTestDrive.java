package package1;

public class DogTestDrive {
    public static void main(String[] args) {
        // dog test code goes here

        Dog d = new Dog();
        d.breed = "Golden Retriever";
        d.name = "Taci";
        d.size = 60;
        System.out.println(d.breed);
        System.out.println(d.name);
        System.out.println(d.size);
        d.bark();
        
    }
}