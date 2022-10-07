package Chapter3;

public class FarmAnimal {
    private String type;
    private String name;
    private String gender;
    private double weight;
    private int age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FarmAnimal(String type,String name, String gender, double weight, int age ){
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;

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
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String FeedingLoadingSchedule() {
        return "meow";

    }

    public String makeSound(){
        return "bark bark";

    }


    @Override
    public String toString(){
        return  type+ " "+ makeSound() +"[name="+ name + ", " + "gender=" +gender+", "+"weight="+weight+", "+
                "age= " +age+ "]" + "\n" + FeedingLoadingSchedule();
    }
}
