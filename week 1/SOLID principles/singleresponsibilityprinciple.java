/* Each class should have one responsibility and only one reason to change */
class studentname {
    void displayname() {
        System.out.println("Student name is siva kumar");
        System.out.println("He is studying in 4th B.Tech in AIML BRANCH");

    }

}

class studentmentor {
    void displaymentor() {
        System.out.println("His mentor is Mr.Krishna Mohan");
    }
}

public class singleresponsibilityprinciple {
    public static void main(String[] args) {
        studentname s1 = new studentname();
        s1.displayname();
        studentmentor s2 = new studentmentor();
        s2.displaymentor();
    }
}
