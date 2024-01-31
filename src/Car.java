class Car {
    public void drive() {
        System.out.println("Car drive!");
    }
}

class Audi extends Car{
    public void reverse(){
        System.out.println("Revers through corner");
    }

    public void brake(){
        System.out.println("Brake through slope");
    }

    public void autoDrive(){
        super.drive();
        reverse();
    }
}

class Test5{
    public static void main(String[] args) {
        Audi a = new Audi();
        a.autoDrive();
    }
}

//object eka run wenawa.
//constructor eka call wenawa.
//drive method eka run wenawa.
//reverse method eka call wenawa

