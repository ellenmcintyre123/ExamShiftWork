package ie.atu;

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

    public String getAge(String s) {
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

}
