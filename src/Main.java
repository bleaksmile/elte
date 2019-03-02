import Model.Creature;
import Model.CreatureFactory;
import Model.CreatureType;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Creature> creatureList = new ArrayList<>();
        String weather = null;

        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNextLine()) {
                String creatureNumber = scanner.next();
                int creatures = Integer.parseInt(creatureNumber);
                for (int i = 0; i < creatures; i++) {
                    String name = scanner.next();
                    String type = scanner.next();
                    String water = scanner.next();
                    creatureList.add(CreatureFactory.createCreature(name, Integer.parseInt(water), CreatureType.valueOf(type)));
                }
                weather = scanner.next();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        race(creatureList, weather);

    }

    public static void race(List<Creature> creatureList, String weather) {
        for (Creature creature : creatureList) {
            for (int j = 0; j < weather.length(); j++) {
                char method = weather.charAt(j);
                switch (method) {
                    case 'n':
                        creature.napos();
                        break;
                    case 'f':
                        creature.felhos();
                        break;
                    case 'e':
                        creature.esos();
                        break;
                }

            }
        }

        List<Creature> stillAlive = creatureList.stream().filter(creature -> creature.getAlive() == true).collect(Collectors.toList());
        Creature winner = stillAlive.stream().max(Comparator.comparing(Creature::getDistance)).orElseThrow(NoSuchElementException::new);
        System.out.println(winner.getName());
    }

}

