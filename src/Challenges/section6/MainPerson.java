package Challenges.section6;

public class MainPerson {
  public static void main(String[] args) {
    Person person = new Person();
    person.setFirstName("");   // firstName is set to empty string
    person.setLastName("");    // lastName is set to empty string
    person.setAge(10);
    System.out.println("fullName= " + person.getFullName());
    System.out.println("teen= " + person.isTeen());
    person.setFirstName("John");    // firstName is set to John
    System.out.println("Age : " + person.getAge());
    person.setAge(18);
    System.out.println("fullName= " + person.getFullName());
    System.out.println("teen= " + person.isTeen());
    person.setLastName("Smith");    // lastName is set to Smith
    System.out.println("fullName= " + person.getFullName());
    System.out.println("Age : " + person.getAge());
  }
}
