public class StudentCourses {
    public static void main(String[] args) {
        String[] courses = { "Math", "Science", "English" };
        int[] marks = { 85, 90, 78 };

        System.out.println("Courses and Marks:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + " - " + marks[i]);
        }
    }
}
