public class Person {
    private String name;
    private String race;
    private int height;
    private String language;
    private String gender;
    public Person() {

    }

    public Person(String name, String race, int height, String language, String gender) {
        this.name = name;
        this.race = race;
        this.height = height;
        this.language = language;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printPersonGender(){
        System.out.println(this.name + "'s gender is " + this.gender);
    }

    public void printPersonRace(){
        System.out.println(this.name + "'s race is " + this.race);
    }

    public void printPersonHeight(){
        System.out.println(this.name + "'s height is " + this.height);
    }
    public void printPersonLanguage(){
        System.out.println(this.name + "'s language spoken is " + this.language);
    }

    public void PrintPersonName(){
        System.out.println("This person's name is " + this.name);
    }
}
