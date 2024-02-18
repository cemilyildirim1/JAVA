public class Main {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("cemil",21,"beşiktaş");


        FootballCoach footballCoach = new FootballCoach("ahmet" , 40 , "beşiktaş");


        System.out.println(footballer.name);
        System.out.println(footballer.getAge());
        System.out.println(footballer.getNationalTeam());
        System.out.println(footballer.mevki);
        System.out.println(footballCoach.age);
        System.out.println(footballCoach.calistirilanTakim);
        System.out.println(footballCoach.name);
        footballCoach.managedTeam("Galatasaray");
        System.out.println(footballCoach.calistirilanTakim);



    }
}