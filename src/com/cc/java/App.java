package com.cc.java;

public class App {

	public static void main(String[] args) {
		Mitarbeiter Hans = new Mitarbeiter("Hans", "Wurst", "Fertigung", 2016);
		Mitarbeiter Max = new Mitarbeiter("Max", "Mustermann", "Vertrieb", 2019);
		Mitarbeiter Maxine = new Mitarbeiter("Maxine", "Wurst", "Verwaltung", 2007);
		output(Maxine.getInfo("Funktion"));
		output(Hans.getInfo("Nme"));
		output(Max.getInfo("Eintrittsjahr"));
	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
