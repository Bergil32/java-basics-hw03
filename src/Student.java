public class Student {
  private int rating;
  private String name;

  public Student() {
    Students.addStudent(this);
  }

  public Student(String name) {
    this();
    this.name = name;
  }

  public Student(String name, int rating) {
    this(name);
    this.rating = rating;
  }

  static double getAvgRating() {
    return Students.getAverageRating();
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getRating() {
    return rating;
  }

  void setRating(int rating) {
    this.rating = rating;
  }

  boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  void changeRating(int rating) {
    this.rating = rating;
  }

  static void removeStudent(Student student) {
    Students.removeStudent(student);
  }

  @Override
  public String toString() {
    return String.format("Name: %s, rating: %d", this.name, this.rating);
  }
}
