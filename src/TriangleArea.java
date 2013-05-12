import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 三角形の面積を求めるプログラム 
 * 
 * @author mochimamru
 *
 */
public class TriangleArea {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader input =
	            new BufferedReader (new InputStreamReader (System.in));	
		
		System.out.println("三角形の面積を求めるプログラム開始 ");
		System.out.println("1辺の長さを入力してください: ");
		String stringA = String.valueOf(input.readLine());
		checkNum(stringA);
		
		System.out.println("1辺の長さを入力してください: ");
		String stringB = String.valueOf(input.readLine());
		checkNum(stringB);
		
		System.out.println("1辺の長さを入力してください: ");
		String stringC = String.valueOf(input.readLine());
		checkNum(stringC);
		
		displayTriangleArea(stringA, stringB, stringC);
		
	}
	
	private static void checkNum(String num) {
		
		if (num == null || !num.matches("^[0-9¥.]+$")) {
			// 半角数字に一致しない場合、エラー
			System.out.println("数値でない値が入力されています");
		    System.exit(0);
		}
	}
	
	private static void displayTriangleArea(String stringA, String stringB, String stringC){
		
		double a = Double.parseDouble(stringA);
		double b = Double.parseDouble(stringB);
		double c = Double.parseDouble(stringC);
		
		// 1番長い辺が、他の２辺を足した値より小さい
		double s = (a + b + c) / 2;
		double sq = s * (s - a) * (s - b) * (s - c);
		
		if (sq <= 0) {
			System.out.print("三角形になりません\n");
		} else {
			double S = Math.sqrt(sq);
			System.out.printf("面積は%fです\n", S);
		}
	}
}
