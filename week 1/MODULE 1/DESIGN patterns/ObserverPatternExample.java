
//observer pattern states where one object change it notifies all other muttiple objects

import java.util.ArrayList;

interface Stock {
    void register(Observer o);

    void unregister(Observer o);

    void notifyObservers();
}

class StockMarket implements Stock {

    ArrayList<Observer> list = new ArrayList<>();

    public void register(Observer o) {
        list.add(o);
    }

    public void unregister(Observer o) {
        list.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : list) {
            o.update();
        }
    }

}

interface Observer {
    void update();
}

class MobileApp implements Observer {
    public void update() {
        System.out.println("MobileApp ");
    }
}

class WebApp implements Observer {
    public void update() {
        System.out.println("WebApp ");
    }
}

class ObserverPatternExample {
    public static void main(String[] args) {

        StockMarket sm = new StockMarket();

        MobileApp mob = new MobileApp();
        WebApp web = new WebApp();

        sm.register(mob);
        sm.register(web);

        sm.notifyObservers();
    }
}