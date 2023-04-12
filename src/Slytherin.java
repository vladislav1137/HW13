public class Slytherin extends Hogwarts {
   private int cunning;
   private int determination;
   private int ambition;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }
}
