package com.steventk.springinaction.springidol;

public class Guitarist implements Performer{

	private Instrument guitar;
	
	public void perform() {
		System.out.format("Guitarist is playing guitar%n");
		guitar.play();
	}

	public Instrument getGuitar() {
		return guitar;
	}

	public void setGuitar(Instrument guitar) {
		this.guitar = guitar;
	}
	
	
}
