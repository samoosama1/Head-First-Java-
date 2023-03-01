package package1;

public class nullCheck {
    public static void main(String[] args) {
        Dog[] pets;
        pets = new Dog[7];
        for (int i = 0 ; i <= 3 ; i++) {
            pets[i] = new Dog();
        }
        
        for (int j = 0 ; j < pets.length ; j++ ) {
            if (pets[j] == null) {
                System.out.println("Null");         
            } else if (pets[j].getClass() == Dog.class) {
                System.out.println("This is a dog");
            } else {
                System.out.println("Dunno");
            }
        }  
    }
}
    

