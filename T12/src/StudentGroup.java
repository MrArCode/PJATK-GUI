public class StudentGroup {
    public static void main(String[] args) {
        Student s1 = new Student("Kowalski", "Jan", 2000);
        Student s2 = new Student("Nowacka", "Janina", 2005);
        Student s3 = new Student("Omega", "Alfa", 2003);

        Group gr1 = new Group("Java", 15);
        Group gr2 = new Group("Smalltalk", 2);

        try {
            gr1.assign(s1);
            gr1.assign(s3);
            gr1.assign(s2);
            System.out.println(gr1);

            for (Student s : gr1.getStudents())
                System.out.println(s);

            gr2.assign(s1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            for (Student s : gr1.getStudents())
                gr1.remove(s);

            gr2.assign(s1);
            gr2.assign(s2);
            System.out.println(gr2);

            for (Student s : gr2.getStudents())
                System.out.println(s);

            gr2.assign(s3);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }

        try {
            gr2.remove(s3);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
