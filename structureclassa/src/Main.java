public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(40);
        person.setAge(-40);

        System.out.println(person.getAge());

    }
}