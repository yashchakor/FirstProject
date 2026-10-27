package functionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicatePrograms {

	public static void main(String[] args) {

		Predicate<String> lengthGreaterThan5 = name -> name.length() > 5;

		System.out.println(lengthGreaterThan5.test("Prerna"));
		System.out.println(lengthGreaterThan5.test("yash"));

		if (lengthGreaterThan5.test("Prateek")) {
			System.out.println("Yes..");

		}

		else
			System.out.println("No..");

		System.out.println("-------------------------------------------");

		BiPredicate<Integer, Integer> maxNum = (num1, num2) -> num1 > num2;

		System.out.println(maxNum.test(10, 20));
		System.out.println(maxNum.test(30, 20));

		System.out.println("-------------------------------------------");

		IntPredicate numGreaterThan10 = num -> num > 10;

		System.out.println(numGreaterThan10.test(5));
		System.out.println(numGreaterThan10.test(15));

		System.out.println("-------------------------------------------");

		LongPredicate isLong = num -> num > 2147483647;

		System.out.println(isLong.test(3546542));
		System.out.println(isLong.test(6545585221L));
		System.out.println("-------------------------------------------");

		DoublePredicate numGreaterThan30 = num -> num > 30;

		System.out.println(numGreaterThan30.test(35.0));

	}

}
