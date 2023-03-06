package HUONG6;

public class main {

    public static void main(String[] args) {
    	School school = new School();

    	school.addStudent(new Student(1, "Tran Van A", 16, "Ha Noi", "11A1"));
    	school.addStudent(new Student(2, "Nguyen Thi B", 17, "Hai Phong", "11A1"));
    	school.addStudent(new Student(3, "Nguyen Thi C", 18, "Da Nang", "12A1"));
    	school.addStudent(new Student(4, "Tran Van B", 20, "Da Nang", "12A1"));
    	school.addStudent(new Student(5, "Tran Van C", 20, "Quang Nam", "11A1"));
    	school.addStudent(new Student(6, "Tran Van T", 23, "Da Nang", "12A1"));
    	school.addStudent(new Student(7, "Tran Van R", 23, "Quang Nam", "11A1"));
    	school.addStudent(new Student(8, "Duong Thi Diem Huong", 23, "Hue", "Sun"));

    	System.out.println("Danh sach hoc sinh:");
    	school.printAllStudents();
    	
    	System.out.println("Danh sach hoc sinh 20 tuoi:");
    	for (Student student : school.getStudents()) {
            if (student.getAge() == 20) {
            	System.out.println(student);
            }
        }
    	
    	int countStudent = 0;
    	for (Student student : school.getStudents()) {
            if (student.getAge() == 23 && student.getHometown() == "Hue") {
            	System.out.println(student);
            	countStudent++;
            }
        }
    	System.out.println("Số lượng học sinh 23t quê ở Huế: " + countStudent);
    }

}