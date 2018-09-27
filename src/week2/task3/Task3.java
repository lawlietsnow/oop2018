package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class YourFriend{
    int age;
    String name;
    String sex;
    float height;
    float weight;
    int iq;

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public int getIq() {
        return iq;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void boddyMassIndex(){
        float bmi=weight/(height*height);
        if(bmi<18.5) System.out.println("Skinny"); //nguồn wikipedia
        else if(bmi>=18.5&&bmi<=25)System.out.println("Normal");
        else System.out.println("Fat");
    }
    public void intelligence(){
        if(iq<85) System.out.println("IQ Low");
        else if(iq>=85&&iq<=115) System.out.println("IQ Normal");
        else System.out.println("IQ Hight");
    }
    public boolean sameGender(){
        return (sex.equals("Male")); 
    }
    
}
class Movie{
    String name;
    int releaseDate;
    String director;
    int budget;

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void oscarWinner(){
        String oscar[]={"Best picture","Best director"};
        System.out.println("Award: ");
        for(int i=0;i<oscar.length;i++){
            System.out.println((i+1)+": "+oscar[i]);
        }
    }
    public void cast(){
        String actor[]={"Bard Pitt","Keanu Reeves","Matt Damon","Robin Turney","Simon Baker"};
        System.out.println("Cast: ");
        for(int i=0;i<actor.length;i++){
            System.out.println((i+1)+": "+actor[i]);
        }
    }
    public void deTail(){
        System.out.println("Country: Viet Nam");
        System.out.println("Languae: Vietnamese");
        System.out.println("Release day: "+releaseDate);
        System.out.println("Budget: "+budget);
    }
}
class FootBallClub{
    String name;
    String home;
    int numberOfFans;
    int Age;

    public int getAge() {
        return Age;
    }

    public String getHome() {
        return home;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
    }
    public void award(){
        String champion[]={"QPL-1983-1987-1989","F.A-2000","Champion League-1999"};
        System.out.println("Award: ");
        for (String champion1 : champion) {
            System.out.println(champion1);
        }
    }
    public void legend(){
        String player[]={"Stven Gerrard","Ian Rush","Kenny Dalgligsh"};
        for (String player1 : player) {
            System.out.println(player1);
        }
    }
    public void competitor(FootBallClub fc){
        System.out.println("Competitor: "+fc.name);
        System.out.println("Home: "+fc.home);
        fc.award();
    }
    
}
