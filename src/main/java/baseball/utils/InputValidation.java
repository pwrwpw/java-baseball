package baseball.utils;

import static baseball.model.Constant.NUMBER_LENGTH;
import static baseball.model.Constant.WRONG_INPUT_DUPLICATE_MESSAGE;
import static baseball.model.Constant.WRONG_INPUT_LENGTH_MESSAGE;
import static baseball.model.Constant.WRONG_INPUT_RANGE_MESSAGE;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InputValidation {

	public static List<Integer> validate(String inputNumber){
		if(!hasExactLength(inputNumber)){
			throw new IllegalArgumentException(WRONG_INPUT_LENGTH_MESSAGE);
		}
		if(!hasExactRange(inputNumber)){
			throw new IllegalArgumentException(WRONG_INPUT_RANGE_MESSAGE);
		}
		if(!hasExactDuplicate(inputNumber)){
			throw new IllegalArgumentException(WRONG_INPUT_DUPLICATE_MESSAGE);
		}
		return convertStringToInteger(inputNumber);
	}

	public static boolean hasExactLength(String inputNumber) {
		return inputNumber.length() == NUMBER_LENGTH;
	}
	public static boolean hasExactRange(String inputNumber) {
		return inputNumber.chars().allMatch(Character::isDigit);
	}
	public static boolean hasExactDuplicate(String inputNumber) {
		String[] inputNumbers = inputNumber.split("");
		Set<String> setNumbers = Arrays.stream(inputNumbers).collect(Collectors.toSet());

		return setNumbers.size() == NUMBER_LENGTH;
	}
	public static List<Integer> convertStringToInteger(String input){
		return Arrays.stream(input.split(""))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
	}
}
