public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 15, 20, 14, 10, 7);
        Gryffindor hermionaGranger = new Gryffindor("Hermiona Granger ", 13, 2, 11, 8, 10);
        Gryffindor ronWesley = new Gryffindor("Ron Wesley", 12, 14, 3, 9, 1);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",11,8,13,9,11);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith ",15,5,12,6,10);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley ",11,8,13,9,11);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 13, 12, 16, 17, 13);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 9, 7, 6, 8, 10);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 5, 15, 6, 10, 13);
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 16, 11, 12, 16, 17);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 10, 19, 6, 9, 12);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 14, 7, 8, 10, 9);
        harryPotter.compareTo(cedricDiggory);
        harryPotter.gryffindorComareTo(ronWesley);
        justinFinchFletchley.compareTo(dracoMalfoy);
        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(justinFinchFletchley);
    }
}