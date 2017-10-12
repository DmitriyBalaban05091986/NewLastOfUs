package com.playstation.store;

public class Human {
	private String name;
	private int weight;

	public Human() {
	}
	// thi is for new commit git task
	public Human(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", weight=" + weight + "]";
	}

}
