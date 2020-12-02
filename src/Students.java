import java.util.HashSet;
import java.util.Set;

public class Students {
  private static Set<Student> studentsCollection = new HashSet<>();

  private static Students ourInstance = new Students();

  public static Students getInstance() {
    return ourInstance;
  }

  private Students() {}

  static void addStudent(Student student) {
    studentsCollection.add(student);
  }

  static void removeStudent(Student student) {
    studentsCollection.remove(student);
  }

  static double getAverageRating(){
      return studentsCollection.stream().mapToDouble(Student::getRating).average().orElse(0.0);
  }
}
