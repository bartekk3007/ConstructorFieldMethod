import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException
    {
        User u1 = new User("Bartek", "Kołakowski");
        Field age = User.class.getDeclaredField("age");
        age.setAccessible(true);
        age.setInt(u1, 30);
        System.out.println(u1);

        Constructor constructor1 = User.class.getConstructor(String.class, String.class);
        Object o1 = constructor1.newInstance("Jan", "Kowalski");
        User u2 = (User) o1;
        System.out.println(u2);

        Method method1 = User.class.getMethod("introduce");
        method1.invoke(u1);
    }
}