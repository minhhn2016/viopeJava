package viopeJava_chapter9_OOP_cont;

import java.util.ArrayList;

public class ObjectsPizzaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

		pizzaList.add(new Pizza("Diavolo", 8.75));
		pizzaList.add(new Pizza("Frutti al Mare", 9));
		pizzaList.add(new Pizza("Alla Pollo", 7.5));

		for (Pizza pizza : pizzaList) {
			System.out.println(pizza.toString());
		}

	}

}
