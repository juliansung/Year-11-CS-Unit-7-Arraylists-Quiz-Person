import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        int num;
        for(num = 0; num < allPersons.size()-1; num++){
            if(person.getLastName().compareTo((allPersons.get(num)).getLastName()) < 0){
                allPersons.add(num,person);
                break;
            }
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<>();
        for(int num=0;num<allPersons.size()-1;num++){
            if(allPersons.get(num).getAge()<18){
                under18.add(allPersons.get(num));
            }
        }
        return under18;
    }

    public boolean checkLastName(String lastName) {
        boolean checkLastName=false;
        for(int num=0;num<allPersons.size()-1;num++){
            if(lastName.compareTo(allPersons.get(num).getLastName())==0){
                checkLastName = true;
                break;
            }
        }
        return checkLastName;
    }
}
