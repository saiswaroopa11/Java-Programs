public class StudentMarks2 {
    public static void main(String[] args) {

        int[] marks = {70, 45, 80, 35, 90};

        System.out.println("Student Marks: ");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int search = 80;
        int count = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 40) {
                count++;
            }
        }

        System.out.println("Number of students passed: " + count);

        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
    }
}
```
