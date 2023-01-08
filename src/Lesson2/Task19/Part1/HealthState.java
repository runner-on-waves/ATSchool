package Lesson2.Task19.Part1;

public enum HealthState {
    HEALTHY("Здоров"),
    UNHEALTHY("Нездоров");
    private  String nameCyrillic;

    HealthState(String nameCyrillic){
        this.nameCyrillic = nameCyrillic;
    }
    public  String getNameCyrillic() {
        return nameCyrillic;
    }
}
