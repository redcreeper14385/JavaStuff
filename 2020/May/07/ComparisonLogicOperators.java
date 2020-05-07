public class ComparisonLogicOperators {
	public static void main(String[] args) {
    // Comparison Operators
    int x = 5;
    int y = 3;
    System.out.println(x == y); // Prints "false" because x does not equal y
    System.out.println(x != y); // Prints "true" because x does not equal y
    System.out.println(x > y); // Prints "true" because x is greater than y
    System.out.println(x < y); // Prints "false" because x is not less than y
    System.out.println(x >= y); // Prints "true" because x is greater than or equal to y
    System.out.println(x <= y); // Prints "false" because x is not less than or equal to y
    // Logical Operators
    int z = 5;
    System.out.println(x > 3 && x < 10); // Prints "true" because both statements are true
    System.out.println(x > 3 || x < 4); // Prints "true" because at least one statement is true
    System.out.println(!(x > 3 && x < 10)); // Prints "false" because the result is reversed.
	}
}
