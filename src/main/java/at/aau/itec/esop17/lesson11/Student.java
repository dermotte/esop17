package at.aau.itec.esop17.lesson11;

public class Student implements  Comparable{
    String firstName, lastName;
    int id;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ": " + lastName + ", " + firstName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student)) {
            throw new UnsupportedOperationException("This is not comparable! o is not a student.");
        }
        Student s = (Student) o;
        //return (getLastName()+getFirstName()).compareTo(s.getLastName()+s.getFirstName());
        return -(id - s.getId());
    }
}
