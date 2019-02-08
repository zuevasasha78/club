package ru.club;

import static ru.club.Club.*;

public class Girl extends Person {

    public Girl(String music) {
        super(music);
        super.name = "Девушка " + Club.getRandomInt(50);
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
