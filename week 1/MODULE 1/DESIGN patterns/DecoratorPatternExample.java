//Decorator example adds new functionality to an object by wrapping decorator class instead of modifying it.
interface Notifier {
    void send();
}

class EmailNotifier implements Notifier {
    public void send() {
        System.out.println("Sending email notification");
    }
}

abstract class NotifierDecorator implements Notifier {
    Notifier notifier;

    NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}

class SMSNotifierdecorator extends NotifierDecorator {
    SMSNotifierdecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        notifier.send();
        System.out.println("Sending SMS notification");
    }
}

class slackNotifierdecorator extends NotifierDecorator {
    slackNotifierdecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        notifier.send();
        System.out.println("Sending slack notification");
    }
}

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierdecorator(emailNotifier);
        Notifier slackNotifier = new slackNotifierdecorator(smsNotifier);

        slackNotifier.send();
    }
}
