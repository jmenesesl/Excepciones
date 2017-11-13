import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author iaw26068632
 *
 */
public class Principal {

	public static double divide(double a, double b) {
		if (b == 0) {
			throw new RuntimeException("b no puede ser 0"); // Se lanza pero no se obliga a capturarla

		}
		double res = a / b;

		return res;
	}

	public static void methodB() {
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public static void methodA() throws IOException {
	// BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	// String data = stdin.readLine();
	// }
	public static void methodA() throws FileNotFoundException {
		File file = new File("algo.txt");
		BufferedReader stdin = new BufferedReader(new FileReader(file));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * si salta un null pointer exception se trata con try catch
		 */
		// String n = null;
		// System.out.println(n);

		Scanner scan = new Scanner(System.in);
		double num = 0;
		double div = 0;
		boolean correcto = false;
		
		File file = new File("algo.txt");
		
		
		
		
		while (!correcto) {
//			try {
				System.out.println("Introduce un numero: ");
				num = scan.nextDouble();
				System.out.println("Introduce un numero divisor: ");
				div = scan.nextDouble();
				
				divide(num, div);
//				double res = num / div;
//				System.out.println("resultado " + res);
//
//				// Tratamos nuestras propias exceptions
//				// para tratarlas nosotros mismos utilizamos el try, catch
//
//				if (Double.isInfinite(res))
////					throw new Exception("Infinito");
//					throw new MiExcepcion("infinito");
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			} finally {
//				
//				// Por aqui siempre pasará, haya o no haya errores
//				System.out.println("pasa por aqui siempre (en finally)");
//			}
			
			correcto = true;
		}
	}

}
