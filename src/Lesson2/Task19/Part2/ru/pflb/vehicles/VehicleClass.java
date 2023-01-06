package Lesson2.Task19.Part2.ru.pflb.vehicles;

public enum VehicleClass {
    MINI("MINI"),
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    EXECUTIVE("EXECUTIVE"),
    LUXURY("LUXURY"),
    SPORT_UTILITY_CARS("SPORT_UTILITY_CARS"),
    MULTI_PURPOSE("MULTI_PURPOSE"),
    SPORTS_CAR("SPORTS_CAR");
    private String name;

    private VehicleClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
