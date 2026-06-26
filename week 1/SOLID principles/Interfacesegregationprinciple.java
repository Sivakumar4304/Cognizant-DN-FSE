
interface batting {
    void bat();
}

interface bowling {
    void bowl();
}

class batsman implements batting {
    public void bat() {
        System.out.println("Player is batsmen");
    }
}

class bowler implements bowling {
    public void bowl() {
        System.out.println("Player is bowler");

    }
}

public class Interfacesegregationprinciple {
    public static void main(String[] args) {
        batting p1 = new batsman();
        bowling p2 = new bowler();
        p1.bat();
        p2.bowl();
    }
}