public class Ravenclaw extends Hogwarts{
  private int smart;
  private int wise;
  private int witty;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }
    private int getRavenclawTotalPower() {
        return smart+wise+witty;
    }
    public void ravenclawCompareTo(Ravenclaw other) {
        if (other.getRavenclawTotalPower() < this.getRavenclawTotalPower()) {
            System.out.println(this.getName()+ " лучший Когтевран, чем " + other.getName());
        } else if (other.getRavenclawTotalPower() > this.getRavenclawTotalPower()) {
            System.out.println(other.getName() + " лучший Когтевран, чем " + this.getName());
        } else {
            System.out.println("ученики равны по силе");
        }
    }
    @Override
    public String toString() {
        return super.toString()+", smart: " +smart+ ", wise: " +wise+ ", witty: "+witty;
    }
}
