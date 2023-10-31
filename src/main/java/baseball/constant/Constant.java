package baseball.constant;

public enum Constant {
	NUMBER_LENGTH(3),
	RANGE_MIN_NUMBER(1),
	RANGE_MAX_NUMBER(9);

	private final int value;

	Constant(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
