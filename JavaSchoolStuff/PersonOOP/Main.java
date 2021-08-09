import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int height;
        String color;
        String language;
        String gender;
        Person person;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? Enter here -> ");
        name = scan.next();
        System.out.print("What is your height? Enter here -> ");
        height = scan.nextInt();
        System.out.print("What is your race? Enter here -> ");
        color = scan.next();
        System.out.print("What language do you speak? Enter here -> ");
        language = scan.next();
        System.out.print("What gender are you? Enter here -> ");
        gender = scan.next();
        person = new Person(name, color, height,language,gender);
        person.PrintPersonName();
        person.printPersonGender();
        person.printPersonRace();
        person.printPersonHeight();
        person.printPersonLanguage();

    }

}
