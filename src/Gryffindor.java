public class Gryffindor extends Hogwarts {
 private int nobility;
 private int honor;
 private int bravery;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    private int getGryffindorTotalPower() {
        return nobility+honor+bravery;
    }
    public void gryffindorComareTo(Gryffindor other) {
        if (other.getGryffindorTotalPower() < this.getGryffindorTotalPower()) {
            System.out.println(this.getName()+ " лучший Гриффиндорец, чем " + other.getName());
        } else if (other.getGryffindorTotalPower() > this.getGryffindorTotalPower()) {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("ученики равны по силе");
        }
    }
@Override
    public String toString() {
       return super.toString()+", nobility: " +nobility+ ", honor: " +honor+ ", bravery: "+bravery;
}
}
