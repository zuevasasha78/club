package ru.club;

public class Person {
    protected String music;
    protected String name;
    protected boolean rnb;
    protected boolean electrodance;
    protected boolean hipHop;
    protected boolean popMusic;

    public Person(String music) {
        this.music = music;
    }

    public String getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public boolean isRnb() {
        return rnb;
    }

    public boolean isElectrodance() {
        return electrodance;
    }

    public boolean isHipHop() {
        return hipHop;
    }

    public boolean isPopMusic() {
        return popMusic;
    }
}
