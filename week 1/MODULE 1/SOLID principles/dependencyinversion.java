interface coder {
    void code();
}

class dsa implements coder {
    public void code() {
        System.out.println("DSA coding is important for better placement");
    }
}

class webdevelopment implements coder {
    public void code() {
        System.out.println("Strong grip and practice of web development ensures good projects");
    }
}

class coding {
    coder role;

    coding(coder role) {
        this.role = role;
    }

    void startCoding() {
        role.code();
    }
}

public class dependencyinversion {
    public static void main(String[] args) {

        coding c1 = new coding(new dsa());
        c1.startCoding();
        coding c2 = new coding(new webdevelopment());
        c2.startCoding();
    }
}