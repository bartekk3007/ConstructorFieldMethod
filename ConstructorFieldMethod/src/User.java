public class User
{
    private String name;
    private String surname;
    private int age;

    public User()
    {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    public User(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.age = 0;
    }

    public User(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void introduce()
    {
        System.out.println("My name is " + name + " " + surname + " and I am " + age);
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}