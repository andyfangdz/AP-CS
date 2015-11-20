/**
 * Created by Andy on 3/2/2015.
 */
public class UnderGradStudent extends Student {

    private String underGradSchoolName;

    public UnderGradStudent() {
        this("John", 0, 100, "CMU");
    }

    public UnderGradStudent(String name, int stuID, int score, String underGradSchoolName) {
        super(name, stuID, score);
        setUnderGradSchoolName(underGradSchoolName);
    }

    public String getUnderGradSchoolName() {
        return underGradSchoolName;
    }

    public void setUnderGradSchoolName(String underGradSchoolName) {
        this.underGradSchoolName = underGradSchoolName;
    }

    public void printRecord() {
        System.out.println("GPA for " + getName() + " in " + underGradSchoolName + ": " + (double)getScore() / 100 * 4 );
    }
}
