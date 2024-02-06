class Bank {
    int getInterestRate(){
        return 0;
    }
}

class BOC extends Bank{
    @Override
    int getInterestRate() {
        return 18;
    }
}

class PeoplesBank extends Bank{
    @Override
    int getInterestRate() {
        return 19;
    }
}

class CommercialBank extends Bank{
    @Override
    int getInterestRate() {
        return 20;
    }
}

class Test2{
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("BOC Bank Interest Rate :- " + b.getInterestRate() + "%");
        System.out.println("Peoples Bank Interest Rate :- " + p.getInterestRate() + "%");
        System.out.println("Commercial Bank Interest Rate :- " + c.getInterestRate() + "%");
    }
}




