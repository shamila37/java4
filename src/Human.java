class Human {
    public void show(){
        System.out.println("I am a student!");
    }
}

class Shamila extends Human{
    @Override
    public void show() {
        super.show();
        System.out.println("I am Shamila.");
    }
}

class Test4{
    public static void main(String[] args) {
        Shamila s = new Shamila();
        s.show();
    }
}