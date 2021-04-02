package by.tr.les.view;

import by.tr.les.entity.Fraction;

public class FractionView {
	public void printSum(Fraction f1, Fraction f2, Fraction f3) {

		System.out.println(f1 + " + " + f2 + " = " + f3);
	}

	public void printReduce(Fraction f) {

		System.out.println(f);
	}

	public void printDivide(Fraction f1, Fraction f2, Fraction f3) {

		System.out.println(f1 + " / " + f2 + " = " + f3);
	}

	public void printMinus(Fraction f1, Fraction f2, Fraction f3) {

		System.out.println(f1 + " - " + f2 + " = " + f3);
	}

	public void printMulti(Fraction f1, Fraction f2, Fraction f3) {

		System.out.println(f1 + " * " + f2 + " = " + f3);
	}

}
