package studentrecordsystem;

import java.util.HashMap;

public class StudentHashMap {

    private HashMap<Integer, Student> map = new HashMap<>();

    public void addStudent(Student student) {
        map.put(student.getStudentId(), student);
    }

    public Student searchStudent(int id) {
        return map.get(id);
    }

    public boolean removeStudent(int id) {
        return map.remove(id) != null;
    }
}
