public class Cat implements Cloneable{
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret=(Cat)this.clone();
        return ret;
    }
}
