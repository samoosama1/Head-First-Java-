<<<<<<< HEAD

=======
package package3;
>>>>>>> 98897548d40da810e605585d2a970308864986e3

public class Player {
    int number = 0; // where the guess goes
    
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
