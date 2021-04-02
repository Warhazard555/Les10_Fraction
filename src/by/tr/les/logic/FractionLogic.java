package by.tr.les.logic;

import by.tr.les.entity.Fraction;

public class FractionLogic {
	public Fraction sum(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;

		newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getDenominator();
		newDen = f1.getDenominator() * f2.getDenominator();

		Fraction rezult = new Fraction(newNum, newDen);

		return rezult;
	}

	public Fraction reduce(Fraction f1) {

		int nod;

		if (f1.getNumerator() > f1.getDenominator()) {
			nod = f1.getDenominator();
		} else {
			nod = f1.getNumerator();
		}

		while (!((f1.getNumerator() % nod == 0) && (f1.getDenominator() % nod == 0))) {
			nod--;
		}

		Fraction rezult = new Fraction();
		rezult.setNumerator(f1.getNumerator() / nod);
		rezult.setDenominator(f1.getDenominator() / nod);
		return rezult;

	}

	public Fraction divide(Fraction f1, Fraction f2) {

		int newNumerator = f1.getNumerator() * f2.getDenominator();
		int newDenominator = f1.getDenominator() * f2.getNumerator();

		Fraction result = new Fraction();
		result.setDenominator(newDenominator);
		result.setNumerator(newNumerator);

		return result;
	}

	public Fraction minus(Fraction f1, Fraction f2) {
		int newNumerator = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() * f1.getDenominator();
		int newDenominator = f1.getDenominator() * f2.getDenominator();
		Fraction result = new Fraction();
		result.setDenominator(newDenominator);
		result.setNumerator(newNumerator);
		return result;
	}

	public Fraction multi(Fraction f1, Fraction f2) {
		int newNumerator = f1.getNumerator() * f2.getNumerator();
		int newDenominator = f1.getDenominator() * f2.getDenominator();
		Fraction result = new Fraction();
		result.setDenominator(newDenominator);
		result.setNumerator(newNumerator);
		return result;
	}

}
