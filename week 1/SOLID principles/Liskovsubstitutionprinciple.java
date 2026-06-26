/*objcets of child class should be able to replace the objects 
of parent class without affecting the correctness of the program. */

class player {
    void play() {
        System.out.println("Player is playing");
    }
}

class cricketer extends player {
    void play() {
        System.out.println("Cricketer plays cricket");
    }
}

class footballer extends player {
    void play() {
        System.out.println("Footballer plays football");
    }
}

class Liskovsubstitutionprinciple {
    public static void main(String[] args) {

        player p1 = new cricketer();
        player p2 = new footballer();
        p1.play();
        p2.play();

    }
}