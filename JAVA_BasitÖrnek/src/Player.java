public abstract class Player {

    String name ;
    int age;
    String nationalTeam;


    public Player(String name , int age , String nationalTeam){
         this.name = name;
         this.age = age;
         this.nationalTeam = nationalTeam;

    }

    abstract public   void playerInformation();


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationalTeam() {
        return nationalTeam;
    }
}
