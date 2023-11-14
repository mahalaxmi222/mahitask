// Define a class called MyClass
class MyClass {
    // Instance variable
    private int value;

    // Default constructor
    public MyClass() {
        System.out.println("Default Constructor called");
        value = 0;
    }

    // Parameterized constructor
    public MyClass(int val) {
        System.out.println("Parameterized Constructor called");
        value = val;
    }

    // Copy constructor
    public MyClass(MyClass original) {
        System.out.println("Copy Constructor called");
        value = original.value;
    }

    // Method to display the value
    public void display() {
        System.out.println("Value: " + value);
    }
}

