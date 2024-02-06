public class Employee {
    int basic = 25000;
    int salary(){
        return basic;
    }
}
class Manager extends Employee {
    @Override
    int salary() {
        return basic + 50000;
    }
}
class Executive extends Employee {
    @Override
    int salary() {
        return basic + 30000;
    }
}
class Test3 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("Manager's salary " + manager.salary());
        Executive executive = new Executive();
        System.out.println("Executive's salary " + executive.salary());
    }
}