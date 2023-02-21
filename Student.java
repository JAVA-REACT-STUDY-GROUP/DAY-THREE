
public class Student{
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private int classNumber;

    public Student(String firstName, String lastName, String email, Gender gender, int classNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.classNumber = classNumber;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }



    @Override
    public String toString(){
        return "FirstName = "+firstName+", lastName = "+lastName+", gender = "+gender+", classNumber = "+classNumber;
    }

}



