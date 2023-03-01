package package1;

public class DogArray {
    public static void main(String[] args) {
        // make a dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Taci";

        // now make dog array
        Dog[] myDogs = new Dog[3];

        // and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the dogs using array
        // references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Karabaş";

        // hmm what is myDogs[2] name?
        System.out.println("last dog's name is " + myDogs[2].name);

        // now loop through the array and tell all
        // the dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }
}
