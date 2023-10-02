public class Singer extends Person {
    public int rating;

    public Singer(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }
    public void sing (String verse) {
        System.out.println("Ya poyu: " + verse);
    }

    @Override
    public void happyBirthday() {
        age++;
        System.out.println("singer: ya poyu tebe: S DRrrr");
    }
    @Override
    public String toString() {
        return "[" + rating + "]" + " (" + age + " лет)";
    }
}
