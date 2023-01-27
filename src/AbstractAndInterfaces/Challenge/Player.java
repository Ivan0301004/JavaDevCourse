package AbstractAndInterfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String namePlayer;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String namePlayer, int hitPoints, int strength) {
        this.namePlayer = namePlayer;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Machine Gun";
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
            "namePlayer='" + namePlayer + '\'' +
            ", hitPoints=" + hitPoints +
            ", strength=" + strength +
            ", weapon='" + weapon + '\'' +
            '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.namePlayer);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            this.namePlayer = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }
}
