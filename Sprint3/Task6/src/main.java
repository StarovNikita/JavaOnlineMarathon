import java.util.Iterator;

class AddressBook implements Iterable {
    private NameAddressPair[] addressBook;
    private int counter = 0;
    public int size(){
        return counter;
    }

    public boolean create(String firstName,String lastName,String address){
        
        return true;
    }


    public AddressBook(int capacity) {

    }

    public void sortedBy(SortOrder order){

    }

    public String read(String firstName, String lastName){
        return null;
    }
    public boolean update(String firstName,String lastName,String address){
        return true;
    }
    public boolean delete(String firstName, String lastName){
        return true;
    }






    @Override
    public Iterator iterator() {
        return new AddressBookIterator();
    }

   private static class NameAddressPair {
       private final Person person;
       private String address;

       private NameAddressPair(Person person, String address) {
           this.person = person;
           this.address = address;
       }


       private static class Person {
           private static String firstName;
           private static String lastName;

           private Person(String firstName, String lastname) {
               this.firstName = firstName;
               this.lastName = lastname;
           }

           @Override
           public boolean equals(Object o) {
               if (this == o) return true;
               if (o == null || getClass() != o.getClass()) return false;
               Person person = (Person) o;
               return firstName.equals(person.firstName) &&
                       lastName.equals(person.lastName);
           }

       }
   }
    private class AddressBookIterator implements Iterator {
        private int counter;

        public AddressBookIterator() {
        }

        @Override
        public boolean hasNext() {
            while (counter < addressBook.length) {
                if (addressBook[counter] != null) {
                    return true;
                } else
                    counter++;
            }
            return false;
        }


        @Override
        public Object next() {
            NameAddressPair index = addressBook[counter];
            counter++;
            return index;
        }
    }
}
enum SortOrder {
    ASC,
    DESC
}





public class main {
}
