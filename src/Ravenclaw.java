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
}
