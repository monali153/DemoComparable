public class Student implements Comparable<Student>{

    private String name;
    private int rollNo;
    private String firstName;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {

        if(this.rollNo == o.rollNo) {
            return 0;
        }
        if(this.rollNo < o.rollNo){
            return -1;
        }
        return 1;
    }

   /* if(this.lastName.compareTo(o.lastName) == 0){
        return this.firstName.compareTo((o.firstName));
    }
    */

    public Student(String name, int rollNo, String firstName, String lastName) {
        this.name = name;
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
