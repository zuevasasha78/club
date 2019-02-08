package ru.club;

import static ru.club.Club.getRandomBoolean;

public class Boy extends Person {

    public Boy(String music) {
        super(music);
        super.name = "Парень  " + Club.getRandomInt(50);
        super.rnb = getRandomBoolean();
        super.electrodance = getRandomBoolean();
        super.hipHop = getRandomBoolean();
        super.popMusic = getRandomBoolean();
    }

    @Override
    public String toString() {
        return "rnb= " + rnb + " electrodence=" + electrodance + " hipHop=" + hipHop + " popMusic=" + popMusic;
    }
}
