package ru.club;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Club {

    // продолжительность дискотеки в минутах
    public static final int PARTY_DURATION = 10;
    // время смены песни в секундах
    public static final int SONG_DURATION = 5;
    // вместимость клуба
    private static final int CLUB_LIMIT_PERSON = 10;

    // типы музыки
    public static final String POP_MUSIK = "Поп-музыка";
    public static final String ELECTROHOUSE = "Electrohuse";
    public static final String RNB = "Rnb";

    public static void main(String[] args) {
        DateTime startDate = new DateTime();
        DateTime endDate = startDate.plusMinutes(PARTY_DURATION);

        while (startDate.isBefore(endDate)) {
            int peopleCount = getRandomInt(CLUB_LIMIT_PERSON);
            System.out.println("На начало песни в клубе  " + peopleCount + " человек");

            String music = getRandomMusic();
            System.out.println("Играет музыка " + music);

            // люди танцуют
            List<Person> persons = personCame(music, peopleCount);
            for (Person person : persons) {
                new Dancing(person).dance();
            }

            // ждем следующей песни
            try {
                Thread.sleep(SONG_DURATION * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startDate = startDate.plusSeconds(SONG_DURATION);
        }
    }

    // получаем набор рандомных посетителей
    private static List<Person> personCame(String music, int people) {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < people; i++) {
            Person person;
            if (getRandomBoolean())
                person = new Boy(music);
            else person = new Girl(music);
            persons.add(person);
        }
        return persons;
    }

    public static int getRandomInt(int range) {
        return 1 + (int) (Math.random() * range);
    }

    public static boolean getRandomBoolean() {
        return new Random().nextBoolean();
    }

    public static String getRandomMusic() {
        String music;
        int type = getRandomInt(3);
        if (type == 1) {
            music = POP_MUSIK;
        } else if (type == 2) {
            music = ELECTROHOUSE;
        } else music = RNB;
        return music;
    }
}
