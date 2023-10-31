package baseball.utils;

import static baseball.constant.Constant.NUMBER_LENGTH;
import static baseball.constant.Constant.RANGE_MAX_NUMBER;
import static baseball.constant.Constant.RANGE_MIN_NUMBER;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomGenerator {

	public List<Integer> generateRandomNumbers() {
		Set<Integer> uniqueNumbers = new HashSet<>();

		while (uniqueNumbers.size() < NUMBER_LENGTH.getValue()) {
			int randomNumber = generateUniqueRandomNumber(uniqueNumbers);
			uniqueNumbers.add(randomNumber);
		}

		return new ArrayList<>(uniqueNumbers);
	}
	private int generateUniqueRandomNumber(Set<Integer> usedNumbers) {
		int randomNumber;
		do {
			randomNumber = Randoms.pickNumberInRange(RANGE_MIN_NUMBER.getValue(), RANGE_MAX_NUMBER.getValue());
		} while (usedNumbers.contains(randomNumber));
		return randomNumber;
	}
}
