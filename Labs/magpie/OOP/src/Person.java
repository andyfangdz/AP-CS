import java.util.Date;

/**
 * Created by Andy on 3/2/2015.
 */
public class Person {

    //Attributes
    private String name;
    private Date birthday;
    private int id;

    public Person() {
        this.name = "John Doe";
        this.birthday = new Date(2000, 01, 01);
        this.id = 0;
    }

    public Person(String name) {
        this();
        setName(name);
    }

    public Person(String name, Date birthday, int id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    //Accessors and Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void greet() {
        System.out.println("Hi, I'm " + name);
    }
}
