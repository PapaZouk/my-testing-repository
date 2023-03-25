package pl.zajavka.case1;

public class Dog extends Animal {
    private String name;

    public void sniff() {
        System.out.println("I'm soo sniffing!");
    }

    @Override
    public String whatIsYourName() {
        return "My name is " + name;
    }
}
