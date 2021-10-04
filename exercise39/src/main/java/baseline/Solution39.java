package baseline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution39 {
    public ArrayList<Map<String, String>> employees = new ArrayList<Map<String, String>>();
    Solution39() {
//        populate the list of maps
        Map<String, String> emp1 = new HashMap<String, String>();
        emp1.put("First Name", "John");
        emp1.put("Last Name", "Johnson");
        emp1.put("Position", "Manager");
        emp1.put("Separation Date", "2016-12-31");
        employees.add(emp1);

        Map<String, String> emp2 = new HashMap<String, String>();
        emp2.put("First Name", "Tou");
        emp2.put("Last Name", "Xiong");
        emp2.put("Position", "Software Engineer");
        emp2.put("Separation Date", "2016-10-05");
        employees.add(emp2);

        Map<String, String> emp3 = new HashMap<String, String>();
        emp3.put("First Name", "Michaela");
        emp3.put("Last Name", "Michaelson");
        emp3.put("Position", "District Manager");
        emp3.put("Separation Date", "2015-12-19");
        employees.add(emp3);

        Map<String, String> emp4 = new HashMap<String, String>();
        emp4.put("First Name", "Jake");
        emp4.put("Last Name", "Jacobson");
        emp4.put("Position", "Programmer");
        emp4.put("Separation Date", "");
        employees.add(emp4);

        Map<String, String> emp5 = new HashMap<String, String>();
        emp5.put("First Name", "Jacquelyn");
        emp5.put("Last Name", "Jackson");
        emp5.put("Position", "DBA");
        emp5.put("Separation Date", "");
        employees.add(emp5);

        Map<String, String> emp6 = new HashMap<String, String>();
        emp6.put("First Name", "Sally");
        emp6.put("Last Name", "Webber");
        emp6.put("Position", "Web Developer");
        emp6.put("Separation Date", "2015-12-18");
        employees.add(emp6);
    }
    public static void main(String[] args) {
        Solution39 app = new Solution39();
//        call sort method
        app.sortArray();

        String output = String.format(" %-20s | %-20s | %-20s \n", "Name", "Position", "Separation Date");
        output += String.format(" %-20s|%-20s|%-20s \n", "---------------------", "----------------------", "---------------------");
//        loop through list and print rows
        for (int i = 0; i < app.employees.size(); i++) {
            output += app.getRowString(app.employees.get(i));
        }
        System.out.println(output);
    }

    public void sortArray() {
        // sort list by comparing last names
        employees.sort(Comparator.comparing(e -> e.get("Last Name")));
    }

    public String getRowString(Map<String, String> employee) {
//        return formatted string with employee info
        return String.format(" %-20s | %-20s | %-20s \n", employee.get("First Name") + " " + employee.get("Last Name"), employee.get("Position"), employee.get("Separation Date"));
    }
}
