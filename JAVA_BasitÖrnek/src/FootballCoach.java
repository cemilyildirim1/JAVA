public class FootballCoach extends Player{

    String calistirilanTakim = "Beşiktaş";
    public FootballCoach (String name, int age, String nationalTeam) {
        super(name = "Sergen yalçın", age, nationalTeam);

    }

    @Override
    public void playerInformation() {

    }

    public void managedTeam(String yenitakim){
        calistirilanTakim = yenitakim;
    }
}
