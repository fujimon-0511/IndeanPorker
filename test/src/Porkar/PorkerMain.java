package Porkar;

import java.util.Map;
import java.util.Scanner;

/**
 * メイン処理を行います
 * 回答の入力と結果を出力
 */
public class PorkerMain {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// ユーザ名とカード番号を取得
		IndianPokerSet set = new IndianPokerSet();
		Map<String, Integer> info = set.IndianPokerSetting();
		
		System.out.println("インディアンポーカーを開始します！");
		System.out.println(info);
		
		IndianPokerAnswer ans = new IndianPokerAnswer();
		int answer = 0;
		
		// 正解するまで繰り返す
		boolean ansResult = false;
		while(!ansResult) {
			for (String user: info.keySet()) {
				// 回答入力
				System.out.print(user + "さん回答をお願いします　(MAX:1 MID:2 MIN:3 UNKNOWN:4)：　");
				answer = new Scanner(System.in).nextInt();
				if (answer != 4) {
					// UNKNOWN意外に回答結果を判定
					ansResult = ans.AnswerCheckResult(info, user, answer);
					if (!ansResult) {
						System.out.println("不正解です。適当に回答しないで下さい");
					}
				}
				if (ansResult) {
					break;
				}
			}
			if (ansResult) {
				System.out.println("正解です！");
				System.out.println("インディアンポーカーを終了します");
				break;
			}
		}
	}
}
