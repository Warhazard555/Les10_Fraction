package by.tr.les.entity;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 1;
		denominator = 1;
	}

	public Fraction(int _numerator, int _denominator) {
		if (_denominator == 0) {
			_denominator = 1;
		}
		numerator = _numerator;
		denominator = _denominator;
	}

	public void setNumerator(int _numerator) {
		numerator = _numerator;
	}

	public void setDenominator(int _denominator) {
		denominator = _denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}

}
