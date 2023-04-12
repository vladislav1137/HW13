public class Hufflepuff extends Hogwarts{
    int hardworking;
    int loaylty;
    int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loaylty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loaylty = loaylty;
        this.honesty = honesty;
    }
    private int getHufflepuffTotalPower() {
        return hardworking+loaylty+honesty;
    }
    public void hufflepuffCompareTo(Hufflepuff other) {
        if (other.getHufflepuffTotalPower() < this.getHufflepuffTotalPower()) {
            System.out.println(this.getName()+ " лучший Пуфендуй, чем " + other.getName());
        } else if (other.getHufflepuffTotalPower() > this.getHufflepuffTotalPower()) {
            System.out.println(other.getName() + " лучший Пуфендуй, чем " + this.getName());
        } else {
            System.out.println("ученики равны по силе");
        }
    }
    @Override
    public String toString() {
        return super.toString()+", hardworking: " +hardworking+ ", loaylty: " +loaylty+ ", honesty: "+honesty;
    }
}
