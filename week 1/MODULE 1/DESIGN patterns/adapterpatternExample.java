//adapter acts as bridge b/w two incompatible interfaces.
interface PaymentProcessor {
    void processPayment();
}

class phonepe {
    void payusingphonepe() {
        System.out.println("paid using phonepe");
    }
}

class googlepay {
    void payusinggooglepay() {
        System.out.println("paid using googlepay");
    }
}

class phonepeAdapter implements PaymentProcessor {
    phonepe ppe = new phonepe();

    public void processPayment() {
        ppe.payusingphonepe();
    }
}

class googlepayAdapter implements PaymentProcessor {
    googlepay gpay = new googlepay();

    public void processPayment() {
        gpay.payusinggooglepay();
    }

}

public class adapterpatternExample {
    public static void main(String[] args) {
        PaymentProcessor phonepeAdapter = new phonepeAdapter();
        phonepeAdapter.processPayment();

        PaymentProcessor googlepayAdapter = new googlepayAdapter();
        googlepayAdapter.processPayment();
    }
}
