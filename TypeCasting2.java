public class TypeCasting2 {
	public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble;
    // Data types can also be narrowed, but this must be done manually with parentheses.
    System.out.println(myDouble); // Outputs 9.78
    System.out.println(myInt); // Outputs 9
	}
}
