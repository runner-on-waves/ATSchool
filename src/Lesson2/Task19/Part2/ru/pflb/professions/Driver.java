package Lesson2.Task19.Part2.ru.pflb.professions;

import Lesson2.Task19.Part2.ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience;
    int licenseId;

    public Driver(String name, int age, int drivingExperience, int licenseId) {
        super(name, age);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    @Override
    public String toString() {
        return String.format("<%s> - возраст: <%s лет> \n  - стаж: <%s>\n  - номер водительского удостоверения: <%s> ", this.name, this.age, drivingExperience, licenseId);
    }
}
