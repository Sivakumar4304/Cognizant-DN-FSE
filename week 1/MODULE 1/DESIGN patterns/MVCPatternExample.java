//mvc pattern is architectral pattern that divides applications into 3 parts as model,controller and viewer .
class Student {
    // id ,name,grade
    int id;
    String name;
    String grade;

    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}

class StudentView {
    void displayStudentDetails(Student student) {
        System.out.println("|| id || " + "" + " || name || " + "" + "|| grade ||");
        System.out.println(student.id + " : " + student.name + " : " + student.grade);
    }
}

class StudentController {
    Student model;
    StudentView view;

    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    void show() {
        System.out.println("displaying student details :");
        view.displayStudentDetails(model);
    }

}

class MVCPatternExample {
    public static void main(String[] args) {

        Student model = new Student(16, "Siva kumar", "A");
        StudentView view = new StudentView();

        StudentController sc = new StudentController(model, view);
        sc.show();

    }
}