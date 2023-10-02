public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(40);
        person.setAge(-40);
        System.out.println(person.getAge());

        }
}

//Инкапсуляция - это сокрытие каких-то данных и предоставление специальных методов для работы с этими дланными