import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 入力した金額から紙幣と硬貨を何枚だせばよいかわかるプログラム
 * 
 * @author mochimamru
 *
 */
public class MoneyCalc {
	// 紙幣の枚数
	private static int[] billCounts = { 0, 0, 0 };
	// 紙幣の種類
	private static int[] billTypes = { 10000, 5000, 1000 };
	// 硬貨の枚数
	private static int[] coinCounts = { 0, 0, 0, 0, 0, 0 };
	// 硬貨の種類
	private static int[] coinTypes = { 500, 100, 50, 10, 5, 1 };

	public static void main(String args[]) throws NumberFormatException,
			IOException {
		int money;

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("金額を入力してください: ");
		money = Integer.parseInt(input.readLine());

		int coinMoney = billCalc(money);
		coinCalc(coinMoney);
		billDisplay();
		coinDisplay();
	}
	
	private static int billCalc(int money) {
		int totalCount = 0;

		for (int i = 0; i < billTypes.length; i++) {
			billCounts[i] = money / billTypes[i];
			money %= billTypes[i];
			totalCount += billCounts[i];
		}
		System.out.println("紙幣の数は合計で" + String.valueOf(totalCount) + "枚");
		
		return money;
	}

	private static void coinCalc(int money) {
		int totalCount = 0;

		for (int i = 0; i < coinTypes.length; i++) {
			coinCounts[i] = money / coinTypes[i];
			money %= coinTypes[i];
			totalCount += coinCounts[i];
		}
		System.out.println("硬貨の数は合計で" + String.valueOf(totalCount) + "枚");
	}

	private static void billDisplay() {
		System.out.println("紙幣の内訳");
		for (int i = 0; i < billTypes.length; i++) {
			System.out.println(billTypes[i] + "円\t" + billCounts[i] + "枚");
		}
	}
	
	private static void coinDisplay() {
		System.out.println("硬貨の内訳");
		for (int i = 0; i < coinTypes.length; i++) {
			System.out.println(coinTypes[i] + "円\t" + coinCounts[i] + "枚");
		}
	}
}
