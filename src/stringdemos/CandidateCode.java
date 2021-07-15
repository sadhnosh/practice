package stringdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CandidateCode {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		recursive(result, new ArrayList<>(), candidates, target, 0, 0);
		return result;
	}

	private void recursive(List<List<Integer>> result, List<Integer> combination, int[] candidates, int target, int sum,
			int start) {
		if (sum == target) {
			result.add(new ArrayList<Integer>(combination));
			return;
		}
		if (sum > target)
			return;
		for (int i = start; i < candidates.length; i++) {
			combination.add(candidates[i]);
			recursive(result, combination, candidates, target, sum + candidates[i], i);
			combination.remove(combination.size() - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = Integer.parseInt(scanner.nextLine());
		List<List<Integer>> list = new CandidateCode().combinationSum(new int[] { 1, 2, 5 }, amount);
		 int count =0;

		for (List<Integer> list2 : list) {
			if (list2.contains(1) && list2.contains(2) & list2.contains(5)) {
				if (Collections.frequency(list2, 1) > Collections.frequency(list2, 2) 
						&& Collections.frequency(list2, 2) > Collections.frequency(list2, 5)) {
					count++;
				}
			
			}

		}
		String str = "1";
		Integer.parseInt(str);

		System.out.println(count);
	}
}