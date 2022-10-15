package src;

public class Main {

    public static void main(String[] args) {

// Facade pattern called in main to use as an interface layer
        Facade object = new Facade();
        object.beginFacade();
    }
}
