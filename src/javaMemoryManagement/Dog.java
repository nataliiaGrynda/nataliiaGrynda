package javaMemoryManagement;

public class Dog {



    public String bread;
    public int age;

    @Override
    protected void finalize() {
        System.out.println("a dog object is garbage collected");
    }
}
