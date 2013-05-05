import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MoneyCalc {
	// 紙幣、硬貨の数
	private static int[] counts = { 0, 0, 0, 0, 0, 0 };
	// お金の種類
	private static int[] moneytypes = { 500, 100, 50, 10, 5, 1 };

	public static void main(String args[]) throws NumberFormatException, IOException {
		int money;
		
		BufferedReader input =
	            new BufferedReader (new InputStreamReader (System.in));	
		
		System.out.println("金額を入力してください: ");
		money= Integer.parseInt(input.readLine());
		
		calc(money);
		
	}
	private static void calc(int m) {
		int totalCount = 0;

		for (int i = 0; i < moneytypes.length; i++) {
			counts[i] = m / moneytypes[i];
			m %= moneytypes[i];
			totalCount += counts[i];
		}
		System.out.println(String.valueOf(totalCount));
	}
}
