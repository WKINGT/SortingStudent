import java.io.Serializable;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 16:37
 * @Description:
 */
public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(int id, String name, int age, int score) {
        this.id = id;
        this.name= name;
        this.age = age;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return "id:" + id + "\tname:" + name + "\tage:" + age +"\tscore:" + score;
    }
}
