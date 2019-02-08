package ru.club;

import static ru.club.Club.*;

public class Dancing {

    private Person person;

    public Dancing(Person person) {
        this.person = person;
    }

    protected void dance() {
        String bar = person.getName() + ", я не танцую. Пойду пить водку в бар";
        String dancing = person.getName() + ", я танцую " + person.getMusic();
        String behavior;
        if (person.getMusic().equals(POP_MUSIK) & person.isPopMusic()) {
            behavior = dancing;
        } else if (person.getMusic().equals(ELECTROHOUSE) & person.isElectrodance()) {
            behavior = dancing;
        } else if (person.getMusic().equals(RNB) & (person.isHipHop() || person.isRnb())) {
            behavior = dancing;
        } else behavior = bar;
        System.out.println(behavior);
    }
}
