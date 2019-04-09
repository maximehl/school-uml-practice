public class Section {
    private Teacher teacher;
    private Student[] students;
    private String name;
    private int currentSize;

    public Section(String name){
        this.name = name;
        this.students = new Student[50];
        this.currentSize = 0;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudent(Student s){
        this.students[this.currentSize] = s;
        this.currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String returnS = "This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: ";
        for(int n = 0; n<currentSize; n++){
            returnS+=this.students[n].getName();
            if(n<currentSize-1){
                returnS+=", ";
            }
        }
        return returnS;
    }
}
