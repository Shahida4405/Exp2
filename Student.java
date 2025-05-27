public class Student {
    public static void main(String[] args) {
        String name = "Alice";
        String dob = "2004-06-15"; // YYYY-MM-DD

        int birthYear = Integer.parseInt(dob.substring(0, 4));
        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
