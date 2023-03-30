import java.util.ArrayList;
import java.util.Collections;

public class SecondTask {
    ArrayList<String> planets = new ArrayList<>();
    ArrayList<String> uniqPlanets = new ArrayList<>();

    public void addPlanets(){
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Нептун");
        planets.add("Земля");

        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < planets.size(); j++) {
                if (i != j && !planets.get(i).equals(planets.get(j)) && !uniqPlanets.contains(planets.get(i))) {
                    int count = Collections.frequency(planets, planets.get(i));
                    System.out.println(planets.get(i) + " " + count);
                    uniqPlanets.add(planets.get(i));
                }
            }
        }
        System.out.println(uniqPlanets);
    }
}

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.

Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */
