package L10_Exams.Retake_Exam.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount(){
        return students.size();
    }

    public String registerStudent(Student student){
        if (capacity > getStudentCount() && !students.contains(student)){
            students.add(student);
            return String.format("Added student %s %s", student.getFirstName(), student.getLastName());
        }

        else if (students.contains(student))
            return "Student is already in the university";


        else
            return "No seats in the university";
    }

    public String dismissStudent(Student student){
        if (students.contains(student)) {
            students.remove(student);
            return "Removed student " + student.getFirstName() + " " + student.getLastName();
        }

        return "Student not found";
    }

    public Student getStudent(String firstName, String lastName){
        return students.stream().filter(s -> s.getFirstName().equals(firstName) &&
                s.getLastName().equals(lastName)).findFirst().orElse(null);
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();

        for (Student student : getStudents()) {
            sb.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s%n",
                    student.getFirstName(), student.getLastName(), student.getBestSubject()));
        }

        return sb.toString();
    }
}
