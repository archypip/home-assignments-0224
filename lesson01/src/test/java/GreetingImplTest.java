import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson01.GreetingImpl;

import java.util.Collection;
import java.util.List;

/**
 * Класс для теста класса GreetingImpl
 */
public class GreetingImplTest {
    GreetingImpl greetingImpl = new GreetingImpl();

    @Test
    public void getFirstName(){
        String firstName = greetingImpl.getFirstName();
        Assert.assertEquals("Артур", firstName);
    };

    @Test
    public void getLastName(){
        String lastName = greetingImpl.getLastName();
        Assert.assertEquals("Бахшиев", lastName);
    };

    @Test
    public void getBirthYear(){
        int birthYear = greetingImpl.getBirthYear();
        Assert.assertEquals(35, birthYear);
    };

    @Test
    public void getHobbies(){
        Collection<String> hobbies = greetingImpl.getHobbies();
        Assert.assertEquals(List.of(), hobbies);
    };

    @Test
    public void getRepoUrl(){
        String repoUrl = greetingImpl.getRepoUrl();
        Assert.assertEquals("https://github.com/archypip/home-assignments-0224", repoUrl);
    };

    @Test
    public void getPhone(){
        String phone = greetingImpl.getPhone();
        Assert.assertEquals("8(920)251-91-98", phone);
    };

    @Test
    public void getCourseExpectations(){
        Collection<String> courseExpectations = greetingImpl.getCourseExpectations();
        Assert.assertEquals(List.of("Понять, осознать", "Применять"), courseExpectations);
    };
}
