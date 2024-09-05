package chapter9;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(){
        System.out.println("In person default constructor");
    }

    public Person(String name){
        System.out.println("In person 2nd constructor");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
