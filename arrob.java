class Student {
    String name;
    int age;
    int rollno;

    void display() {
        System.out.println("Name: " + name + 
                           " Age: " + age + 
                           " Roll No: " + rollno);
    }
}

public class arrob {
    public static void main(String[] args) {

        Student[] s1 = new Student[3];   // array of objects

        // Creating objects
        s1[0] = new Student();
        s1[0].name = "Srujana";
        s1[0].age = 20;
        s1[0].rollno = 77;

        s1[1] = new Student();
        s1[1].name = "shiv";
        s1[1].age = 21;
        s1[1].rollno = 78;

        s1[2] = new Student();
        s1[2].name = "krish";
        s1[2].age = 19;
        s1[2].rollno = 79;

        // Display details
        for (int i = 0; i < s1.length; i++) {
            s1[i].display();
        }
    }
}