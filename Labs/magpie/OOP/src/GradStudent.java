/**
 * Created by Andy on 3/2/2015.
 */
public class GradStudent extends Student{

    private String gradSchoolName;

    public GradStudent() {
        this("John", 0, 100, "CMU");
    }

    public GradStudent(String name, int stuID, int score , String gradSchoolName) {
        super(name, stuID, score);
        setGradSchoolName(gradSchoolName);
    }

    public String getGradSchoolName() {
        return gradSchoolName;
    }

    public void setGradSchoolName(String gradSchoolName) {
        this.gradSchoolName = gradSchoolName;
    }

    public void printRecord() {
        System.out.println("GPA for " + getName() + " in " + gradSchoolName + ": " + (double)getScore() / 150 * 4 );
    }

}
