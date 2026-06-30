//software entities  should be open for extension but closed for modification
interface payment {
    void pay();
}

class cash implements payment {

    public void pay() {
        System.out.println("Paid with cash");
    }
}

class upi implements payment {
    public void pay() {
        System.out.println("Paid with UPI");
    }
}

class opencloseprinciple {
    public static void main(String[] args) {

        payment p1 = new cash();
        payment p2 = new upi();
        p1.pay();
        p2.pay();

    }
}