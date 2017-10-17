package viopeJava_chapter9_OOP_cont;

import java.util.ArrayList;

public class Crew {
	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {
		super();
	}

	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}

	@Override
	public String toString() {
		String crewMember = "";
		for (Sailor sailor : sailorList) {
			crewMember += sailor.getName() + " (" + sailor.getEmail() + ")\n";
		}
		return crewMember;
	}

}
