public class Main {
  public static void main(String[] args){

    // Create 3 Students
    Student std1 = new Student();
    Student std2 = new Student("Jack");
    Student std3 = new Student("John", 9);

    std1.setName("Sam");

    std1.setRating(2);
    std2.setRating(6);

    // Average rating
    System.out.println(Students.getAverageRating());

    // Change the rating
    std3.changeRating(7);

    // Display Average rating again
    System.out.println(Students.getAverageRating());
  }
}
