public class Wizard extends PlayerCharacter {
    public int power;

    public Wizard(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack() {
        System.out.println("Attacking with power: " + power);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "power=" + power +
                '}';
    }
}
