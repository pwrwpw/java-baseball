package baseball.utils;

import static baseball.constant.Constant.NUMBER_LENGTH;
import static baseball.constant.ExceptionMessage.WRONG_INPUT_DUPLICATE_MESSAGE;
import static baseball.constant.ExceptionMessage.WRONG_INPUT_LENGTH_MESSAGE;
import static baseball.constant.ExceptionMessage.WRONG_INPUT_RANGE_MESSAGE;
import static baseball.constant.ExceptionMessage.WRONG_INPUT_RESTART_MESSAGE;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InputValidation {

	public static List<Integer> validateAndConvertInputToIntegerList(String inputNumber){
		if(!hasExactLength(inputNumber)){
			WRONG_INPUT_LENGTH_MESSAGE.throwException();
		}
		if(!hasExactRange(inputNumber)){
			WRONG_INPUT_RANGE_MESSAGE.throwException();
		}
		if(!hasExactDuplicate(inputNumber)){
			WRONG_INPUT_DUPLICATE_MESSAGE.throwException();
		}
		return convertStringToInteger(inputNumber);
	}
	public static String validateRestartInput(String restartInput){
		if(!hasRestartInput(restartInput)){
			WRONG_INPUT_RESTART_MESSAGE.throwException();
		}
		return restartInput;
	}

	public static boolean hasExactLength(String inputNumber) {
		return inputNumber.length() == NUMBER_LENGTH.getValue();
	}
	public static boolean hasExactRange(String inputNumber) {
		return inputNumber.chars().allMatch(Character::isDigit);
	}
	public static boolean hasExactDuplicate(String inputNumber) {
		String[] inputNumbers = inputNumber.split("");
		Set<String> setNumbers = Arrays.stream(inputNumbers).collect(Collectors.toSet());

		return setNumbers.size() == NUMBER_LENGTH.getValue();
	}
	public static boolean hasRestartInput(String restartInput) {
		return restartInput.equals("1") || restartInput.equals("2");
	}
	public static List<Integer> convertStringToInteger(String input){
		return Arrays.stream(input.split(""))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
	}

}
