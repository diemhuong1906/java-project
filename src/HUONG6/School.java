package HUONG6;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
    	for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Đã xóa sinh viên với id là " + id);
                break;
            }
        }
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}