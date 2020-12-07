public class Student {
  private int rating;
  private String name;
  private static double totalRating;
  private static int counter;

  public Student() {
    counter++;
  }

  public Student(String name) {
    this();
    this.name = name;
  }

  public static double getAvgRating() {
    if (counter == 0) return 0;
    return totalRating / counter;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating += rating;
  }

  public int getRating() {
    return rating;
  }

  public boolean betterStudent(Student student) {
    return rating >= student.getRating();
  }

  public void changeRating(int rating) {
    totalRating -= this.rating;
    this.rating = rating;
    totalRating += rating;
  }

  public static void removeStudent(Student student) {
    counter--;
    totalRating -= student.getRating();
  }

  @Override
  public String toString() {
    return String.format("Name: %s, rating: %d", this.name, this.rating);
  }
}
