public class Runner {
    public static void main(String args[]){
        School berkeley = new School("Berkeley High");
        Section math = new Section("Math");
        Section bio = new Section("Biology");
        Section compsci = new Section("Computer Science");
        Teacher albinson = new Teacher("Albinson", 1, "Computer Science");
        Teacher t2 = new Teacher("Teacher2", 2, "Substitution");
        Teacher t3 = new Teacher("Teacher2", 3, "Economics");
        Student s1 = new Student("Me", 4, 12);
        Student s2 = new Student("Friend1", 5, 10);
        Student s3 = new Student("Friend2", 6, 11);
        Student s4 = new Student("Friend4", 7, 10);
        Student s5 = new Student("Archenemy", 8, 9);
        Student s6 = new Student("Confused", 9, 4);

        berkeley.addSection(math);
        berkeley.addSection(bio);
        berkeley.addSection(compsci);
        math.setTeacher(t2);
        bio.setTeacher(t3);
        compsci.setTeacher(albinson);

        math.addStudent(s1);
        math.addStudent(s3);
        math.addStudent(s4);
        math.addStudent(s6);

        bio.addStudent(s2);
        bio.addStudent(s3);
        bio.addStudent(s6);

        compsci.addStudent(s1);
        compsci.addStudent(s4);
        compsci.addStudent(s5);

        System.out.println(math.toString());
    }
}
