class MyDogList {
    private Dog [] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        }
    }
}

public class DogTestDrive {
    public void main(String [] args) {
        Dog a = new Dog();
        Dog b = new Dog();
        MyDogList c = new MyDogList();
        c.add(a);
        c.add(b);
    }
}