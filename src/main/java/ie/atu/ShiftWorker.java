package ie.atu;

import java.util.Scanner;


public class ShiftWorker {
        private String name;
        private String gender;
        private String shift;
        private String age;

    public ShiftWorker(String name, String gender, String shift, String age) {
        this.name = name;
        this.gender = gender;
        this.shift = shift;
        this.age = age;
    }

    public ShiftWorker() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() +
            "ShiftWorker{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", shift='" + shift + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

    public void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name");
        System.out.println("the name you entered");
        System.out.println("Please enter your gender- male, female, non-binary");
        System.out.println("Please enter your shift(day shift is 1, night shift is 2");
        System.out.println("Please enter your age, must be over 18");
    }

}
