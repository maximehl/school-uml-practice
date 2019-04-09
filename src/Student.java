public class Student extends Person {
    private Section[] sections;
    private int grade;
    private int sectionCount;

    public Student(String name, int id, int grade){
        super(name, id);
        this.sections = new Section[10];
        this.grade = grade;
        this.sectionCount = 0;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section s){
        this.sections[this.sectionCount] = s;
        this.sectionCount++;
    }
}
