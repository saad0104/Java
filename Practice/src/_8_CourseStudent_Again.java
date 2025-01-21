import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _8_CourseStudent_Again {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, List<String>> courseData = new HashMap<>();

        FileReader fr = new FileReader("src\\course.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String courseCode = parts[0];
                    String[] students = parts[1].split(",");
                    List<String> stdlist = new ArrayList<>();
                    for (String std : students) {
                        stdlist.add(std.trim());
                    }
                    courseData.put(courseCode, stdlist);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // System.out.println(courseData.get("CSE111"));

        for(String s : courseData.keySet())
        {
            // System.out.println(courseData.get(s));
            System.out.println("Course Name: " + s);
            int count = 0;
            System.out.print("Students in this course : ");
            for(String stt : courseData.get(s))
            {
                System.out.print(" " + stt);
                count++;
            }
            System.out.println();
            System.out.println("Total = " + count);
        }

    }
}
