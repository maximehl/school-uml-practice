public class Teacher extends Person {
    private Section[] sections;
    private String subject;
    private int sectionCount;


    public Teacher(String name, int id, String subject){
        super(name, id);
        this.sections = new Section[10];
        this.subject = subject;
        this.sectionCount = 0;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section s){
        this.sections[this.sectionCount] = s;
        sectionCount++;
    }
}
