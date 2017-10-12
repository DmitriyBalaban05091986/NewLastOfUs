package com.playstation.store;

public class Zombie {
	public void eatHuman(Human human) {
		System.out.printf("Human has been eaten:\n his Name was: %s | and his Weight was: %d\n", human.getName(),
				human.getWeight());
	}
}
