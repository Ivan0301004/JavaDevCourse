package Challenges.section6;

public class Person {

  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String Fname) {
    this.firstName = Fname;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String Lname) {
    this.lastName = Lname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age <= 0 || age > 100) {
      age = 0;
    }
    this.age = age;
  }

  public String getFullName() {
    if (firstName.isEmpty() && lastName.isEmpty()) {
      return "";
    } else if (lastName.isEmpty()) {
      return getFirstName();
    } else if (firstName.isEmpty()) {
      return getLastName();
    } else {
      return getFirstName() + " " + getLastName();
    }

  }

  public boolean isTeen() {
    return this.age > 12 && this.age < 20;
  }


}
