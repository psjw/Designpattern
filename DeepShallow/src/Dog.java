public class Dog implements Cloneable{
    private String name;
    private Age age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public Dog copy() throws CloneNotSupportedException {
        Dog ret=(Dog)this.clone();
        return ret;
    }


    public Dog deepCopy() throws CloneNotSupportedException {
        Dog ret=(Dog)this.clone();
        //깊은복사를 위해 변경
        ret.setAge(new Age(this.getAge().getYear(), this.getAge().getValue()));
        return ret;
    }
}
