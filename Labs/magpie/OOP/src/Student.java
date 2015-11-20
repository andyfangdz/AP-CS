/**
 * Created by Andy on 3/2/2015.
 */
public abstract class Student extends Person {

    private int stuID;
    private int score;

    public Student() {
        this("John", 0, 100);
    }

    public Student(String name, int stuID, int score) {
        super(name);
        this.stuID = stuID;
        this.score = score;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract void printRecord();

    public void greet() {
        super.greet();
        System.out.println("My score is " + score);
    }

}
