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
    private int getSlytherinTotalPower() {
        return cunning+determination+ambition;
    }
    public void slytherinCompareTo(Slytherin other) {
        if (other.getSlytherinTotalPower() < this.getSlytherinTotalPower()) {
            System.out.println(this.getName()+ " лучший из Слизерин, чем " + other.getName());
        } else if (other.getSlytherinTotalPower() > this.getSlytherinTotalPower()) {
            System.out.println(other.getName() + " лучший из Слизерин, чем " + this.getName());
        } else {
            System.out.println("ученики равны по силе");
        }
    }
    @Override
    public String toString() {
        return super.toString()+", cunning: " +cunning+ ", determination: " +determination+ ", ambition: "+ambition;
    }
}
