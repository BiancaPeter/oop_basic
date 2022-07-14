public class Game {
    public static void main(String[] args) {
//        PlayerCharacter player1 = new PlayerCharacter("Bianca", 31);
//        player1.speak();
//        System.out.println(player1.getName());
//        player1.setName("Olimpiu");
//        System.out.println(player1.getName());

        Archer archer1 = new Archer("John",34,12);
        archer1.speak();

        Wizard wizard1 = new Wizard("Ela",50,89);
        wizard1.speak();

        System.out.println(wizard1 instanceof PlayerCharacter);
        System.out.println(wizard1 instanceof Wizard);
        System.out.println(wizard1 instanceof Object);

//        archer1.attack();
//        wizard1.attack();

        playerAttack(wizard1);
        playerAttack(archer1);

        System.out.println(wizard1.toString());

    }

    public static void playerAttack(PlayerCharacter playerCharacter){
        playerCharacter.attack();
    }

}
