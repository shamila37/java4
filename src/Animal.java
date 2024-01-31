class Animal {

    public void print(){
        System.out.println("i am animal!");
    }
}

class Dog extends Animal{
//    public void print(){  // meka apita penne na. meka thinne jvm eke.
//
//    }

    @Override
    public void print() {
        System.out.println("I am Dog!");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
    }
}
