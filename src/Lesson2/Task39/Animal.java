package Lesson2.Task39;

public class Animal {
    private static String planet = "Земля";

    public static String getPlanet() {
        return planet;
    }

    public static void setPlanet(String planet) {
        Animal.planet = planet;
    }

    public static void testStaticMethod() {
        System.out.println("Это статическое животное");
    }
}
