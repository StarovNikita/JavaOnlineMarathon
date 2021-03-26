import java.util.Objects;

class Person {
    private String firstName , lastName, idCode;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public static Person  buildPerson(String firstName, String lastName, String idCode){
        Person person = new Person();
        return person;
    }

    @Override
    public String toString() {
        return firstName + lastName + ":" + idCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                idCode.equals(person.idCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, idCode);
    }
    class NameException extends RuntimeException{

    }
    class CodeException extends RuntimeException{

    }
}
