public abstract class Hogwarts {
   private final String name;
   private final int magicPower;
   private final int transgressionDistance;

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    private int getTotalPower() {
        return magicPower + transgressionDistance;
    }

    public void compareTo(Hogwarts other) {
        if (other.getTotalPower() < this.getTotalPower()) {
            System.out.println(this.getName()+ " обладает бОльшей мощностью магии, чем " + other.getName());
        } else if (other.getTotalPower() > this.getTotalPower()) {
            System.out.println(other.getName() +" обладает бОльшей мощностью магии, чем " + this.getName());
        } else {
            System.out.println("ученики равны по силе");
        }
    }
@Override
    public String toString() {
        return "name: " +name+ ", magic power: " +magicPower+ ", transgression: "+transgressionDistance;
    }
}
