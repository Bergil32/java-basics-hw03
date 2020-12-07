public class Main {
  public static void main(String[] args){

    // Create 3 Students
    Student std1 = new Student();
    Student std2 = new Student("Jack");
    Student std3 = new Student("John");

    std1.setName("Sam");

    std1.setRating(2);
    std2.setRating(6);
    std3.setRating(8);

    // Average rating
    System.out.println(Student.getAvgRating());

    // Change the rating
    std3.changeRating(7);

    // Display Average rating again
    System.out.println(Student.getAvgRating());
  }
}
