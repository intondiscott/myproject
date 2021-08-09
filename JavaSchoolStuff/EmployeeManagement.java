import java.util.ArrayList;
import java.util.Scanner;

public class LabProgram {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       final int MAX_ELEMENTS = 10;
       final char EXIT_CODE = 'X';
       final String PROMPT_ACTION = "Add, Delete, List, eXit (a,d,l,x): ";
       ArrayList<String> name = new ArrayList<String>(MAX_ELEMENTS);
       ArrayList<String> department = new ArrayList<String>(MAX_ELEMENTS);
       ArrayList<String> title = new ArrayList<String>(MAX_ELEMENTS);
       char userAction;

       // Loop til user enters the exit code
        userAction = getAction(PROMPT_ACTION);
        while (userAction != EXIT_CODE){
            if(userAction == 'A'){
                addEmployee(name, department, title);
            }
            else if(userAction == 'D'){
                deleteEmployee(name, department, title);
            }
            else if(userAction == 'L'){
                listEmployees(name, department, title);
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }
    // This is to add an entry
    public static void addEmployee(ArrayList<String> name, ArrayList<String> department, ArrayList<String> title){
        String theName;
        String theDept;
        String theTitle;

        System.out.println("\nEnter the name to add: ");
        theName = scan.nextLine();
        System.out.println("Enter " + theName + "'s department: ");
        theDept = scan.nextLine();
        System.out.println("Enter " + theName +"'s title: ");
        theTitle = scan.nextLine();

        name.add(theName);
        department.add(theDept);
        title.add(theTitle);

        System.out.println(theName + "'s information has been added.");
    }
    // This is delete an Entry
    public static void deleteEmployee(ArrayList<String> name, ArrayList<String> department,ArrayList<String> title){
        int nElements;
        int element;

        nElements = name.size();
        if (nElements > 0) {
            System.out.println("Enter # entry to delete 0-" + (nElements - 1) + ", or -1 to skip deletion: ");
            element = scan.nextInt();

            if (element >= 0) {
                name.remove(element);
            }
        }
    }
    // This is to list Entry
    public static void listEmployees(ArrayList<String> name, ArrayList<String> department, ArrayList<String> title){
        int nElements;
        int i;

        nElements = name.size();

        if(nElements > 0){
            System.out.println();
            for(i = 0; i < nElements; i++){
                System.out.println(i +".) Name: " + name.get(i) + ",\tDepartment: " + department.get(i) + "\tTitle: " + title.get(i));
            }
        }else{
            System.out.println("\nThere are no entries to list.");
        }
    }
    // This is how the menu will be interacted with
    public static char getAction(String prompt) {
        String answer;
        char firstChar;

        System.out.println();
        System.out.println(prompt);
        answer = scan.nextLine().toUpperCase() + " "; //ensures >= 1 character
        firstChar = answer.charAt(0);

        return firstChar;
    }
}
