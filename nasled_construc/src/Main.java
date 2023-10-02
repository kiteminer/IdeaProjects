public class Main {
    public static void main(String[] args) {
        Person person = new Person("Petya person", 19);
        person.setAge(40);
        person.setAge(-40);
        System.out.println(person.getAge());
        person.happyBirthday();

        Singer singer = new Singer("Tanya singer", 18, 1);
        singer.sing("Good morning!");
        singer.happyBirthday();
    }
}