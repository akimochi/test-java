import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangleArea {

	public static void main(String args[]) throws NumberFormatException, IOException {
		double a, b, c, s, sq, S;
		
		BufferedReader input =
	            new BufferedReader (new InputStreamReader (System.in));	
		
		System.out.println("aを入力してください: ");
		a = Double.parseDouble(input.readLine());
		System.out.println("bを入力してください: ");
		b = Double.parseDouble(input.readLine());
		System.out.println("cを入力してください: ");
		c = Double.parseDouble(input.readLine());
		
		// 1番長い辺が、他の２辺を足した値より小さい
		s = (a + b + c) / 2;
		sq = s * (s - a) * (s - b) * (s - c);
		
		if (sq <= 0) {
			System.out.print("三角形になりません\n");
		} else {
			S = Math.sqrt(sq);
			System.out.printf("面積は%fです\n", S);
		}
	}
}
