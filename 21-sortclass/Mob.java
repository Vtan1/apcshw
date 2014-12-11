import java.util.*;
import java.io.*;

public class Mob implements Comparable{
	public int health;
	public String name;
	public int dexterity; //Damage redux
	public int strength; //Attack Damage
	public int speed; //Movement and attack speed
	public int level;
	public int experience;
	public int maxHealth;
	public String type;
/*
	public Mob(int h, String s, int l, int atkdmg, int dex, int spd){
		health = h;
		name = s;
		level = l;
		experience = 0;
		strength = atkdmg;
		dexterity = dex;
		speed = speed;


	}
*/

    public int compareTo(Object other) {
	Mob o = (Mob)other;
	return this.name.compareTo(o.name);
    }

    public String toString() {
	return name;
    }

    public static void main(String[] args) {
	Mob[] m = new Mob[3];
	for (int i = 0;i<m.length;i++) {
	    m[i] = new Mob();
	}
	m[0].name = "a";
	m[1].name = "c";
	m[2].name = "b";
	System.out.println(Arrays.toString(m));
	Arrays.sort(m);
	System.out.println(Arrays.toString(m));
	/*
	  If something extends this class, it will also have Comparable
	  implemented.
	  Order does matter in terms of extending and implementing.
	  Extend then implement.
	*/
    }
}
