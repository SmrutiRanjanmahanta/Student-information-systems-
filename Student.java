public class Student {
    
        private String name;
        private int id;
        private Course course;
    
        public Student(String name, int id, Course course) {
            this.name = name;
            this.id = id;
            this.course = course;
        }
    
        public String getName() {
            return name;
        }
    
        public int getId() {
            return id;
        }
    
        public void displayStudentInfo() {
            System.out.println("\n*Student Information:*");
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Course name: " + this.course.getCourseName());
            System.out.println("Course code: " + this.course.getCourseCode());
            System.out.println();
        }
    }

