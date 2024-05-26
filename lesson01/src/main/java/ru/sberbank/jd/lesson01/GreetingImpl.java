package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Класс для получения информации о конкретном человеке.
 */
public class GreetingImpl implements Greeting {

    /**
     * Получение имени.
     */
    @Override
    public String getFirstName() {
        return "Артур";
    }

    /**
     * Получение фамилии.
     */
    @Override
    public String getLastName() {
        return "Бахшиев";
    }

    /**
     * Получение года рождения.
     */
    @Override
    public int getBirthYear() {
        return 35;
    }

    /**
     * Получение набора хобби.
     */
    @Override
    public Collection<String> getHobbies() {
        return List.of();
    }

    /**
     * Получение имени репозитория.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/archypip/home-assignments-0224";
    }

    /**
     * Получение телефона.
     */
    @Override
    public String getPhone() {
        return "8(920)251-91-98";
    }

    /**
     * Получение набора ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Понять, осознать", "Применять");
    }
}
