//strategy pattern is behaviour design pattern that provides strategy to select one algorithm from multiple algorithms at run time .
interface PaymentStrategy {
    void pay();
}

class CreditCardPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Paid using credit card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Paid using PayPal");
    }
}

class PaymentContext {
    PaymentStrategy ps;

    PaymentContext(PaymentStrategy ps) {
        this.ps = ps;
    }

    void show() {
        ps.pay();
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {

        PaymentContext pc1 = new PaymentContext(new CreditCardPayment());
        pc1.show();

        PaymentContext pc2 = new PaymentContext(new PayPalPayment());
        pc2.show();
    }
}
