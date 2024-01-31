class Company {
    int id;
    String name;
    Company (int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Virtusa extends Company{
    double salary;
    Virtusa(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public void printData(){
        System.out.println("id :- " + id + "  name:- " + name + "  salary:- " + salary);
    }
}

class Test6{
    public static void main(String[] args) {
        Virtusa v = new Virtusa(1, "shamila", 450000.00);
        v.printData();
    }
}