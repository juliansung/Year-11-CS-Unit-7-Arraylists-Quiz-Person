public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setlastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        String output = "First name: " + firstName + ", Last name:" + lastName + ", Age: " + age;
        return output;
    }

}
