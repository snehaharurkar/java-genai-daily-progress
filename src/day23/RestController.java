package day23;


    import java.util.ArrayList;
    import java.util.List;
    public @interface RestController {

    @RestController
    @RequestMapping("/students")
    public class StudentController {

        List<String> students = new ArrayList<>();

        // GET - fetch all students
        @GetMapping
        public List<String> getStudents() {
            return students;
        }

        // POST - add new student
        @PostMapping
        public String addStudent(@RequestBody String name) {
            students.add(name);
            return "Student added successfully!";
        }
    }
}
