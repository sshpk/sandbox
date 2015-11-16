package pk.ciit.calc;

public class Demo {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int a = 2;
		int b = 5;
		int c = calc.add(a, b);
		System.out.println("result = "+c);
	}

}
