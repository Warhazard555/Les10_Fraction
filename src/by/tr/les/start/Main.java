package by.tr.les.start;

import by.tr.les.entity.Fraction;
import by.tr.les.logic.FractionLogic;
import by.tr.les.view.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);

		Fraction f3;

		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();

		f3 = logic.sum(f1, f2);

		view.printSum(f1, f2, f3);

		f3 = logic.reduce(f3);

		view.printReduce(f3);

		f3 = logic.divide(f1, f2);

		view.printDivide(f1, f2, f3);

		f3 = logic.minus(f1, f2);

		view.printMinus(f1, f2, f3);

		f3 = logic.multi(f1, f2);

		view.printMulti(f1, f2, f3);
	}

}
