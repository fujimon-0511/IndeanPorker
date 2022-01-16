package Porkar;
import java.util.*;

/**
 * ポーカーを行うユーザとカードの設定を行います
 * 戻り値　Map<ユーザ名、カード番号>
 */
public class IndianPokerSet {
	
	public Map<String, Integer> IndianPokerSetting() {
		// ユーザ
		String[] users = {"A", "B", "C"};
		// ユーザをキーにカード番号をセットできるように設定
		Map<String, Integer> map = new HashMap<>();
		
		//持っているカードを設定
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++ ) {
			list.add(i);
		}
		
		//値をシャッフル
		Collections.shuffle(list);
		
		int userIndex = 0;
		for (String user: users) {
			// ユーザ名とカード番号をセット
			map.put(user, list.get(userIndex));
			userIndex++;
		}
		
		return map;
	}
}
