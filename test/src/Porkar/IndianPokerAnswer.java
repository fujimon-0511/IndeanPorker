package Porkar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 回答が合っているのかの判定を行います
 * 戻り値　true,false
 */
public class IndianPokerAnswer {
	
	public boolean AnswerCheckResult(Map<String, Integer> info, String user, int answer) {
		
		// 回答の結果を返すフラグ
		boolean check = false;
		List<String> otherUserList = new ArrayList<>();
		
		if (user == "A") {
			otherUserList.add("B");
			otherUserList.add("C");
			check = AnswerCheck(info, user, otherUserList, answer);
		}
		if (user == "B") {
			otherUserList.add("A");
			otherUserList.add("C");
			check = AnswerCheck(info, user, otherUserList, answer);
		}
		if (user == "C") {
			otherUserList.add("A");
			otherUserList.add("B");
			check = AnswerCheck(info, user, otherUserList, answer);
		}
		return check;
	}
	
	public boolean AnswerCheck(Map<String, Integer> info, String user, List<String> otherUserList, int answer) {

		if (answer == 1) {
			if (info.get(user) > info.get(otherUserList.get(0)) && info.get(user) > info.get(otherUserList.get(1))) {
				return true;
			}
		}else if (answer == 2) {
			if (info.get(user) > info.get(otherUserList.get(0)) || info.get(user) > info.get(otherUserList.get(1))) {
				return true;
			}
		}else if (answer == 3) {
			if (info.get(user) < info.get(otherUserList.get(0)) && info.get(user) < info.get(otherUserList.get(1))) {
				return true;
			}
		}
		return false;
	}

}
