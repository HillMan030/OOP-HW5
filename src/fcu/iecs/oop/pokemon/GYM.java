package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {



	public static void fight(Pokemon p1, Pokemon p2) {
		Random ran = new Random();
		if ((ran.nextInt(100) + 1) % 2 != 0) {
			System.out.printf(p1.name);
		} else
		{
			System.out.printf(p1.name);

	}

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("aaa",100);
		Pokemon p2 = new Pokemon("bbb",100);
		fight(p1, p2);

	}

}
