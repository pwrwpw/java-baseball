package baseball.constant;

public enum ExceptionMessage {
    WRONG_INPUT_LENGTH_MESSAGE("세 자리만 입력 가능합니다."),
    WRONG_INPUT_RANGE_MESSAGE("1~9 사이의 숫자만 입력 가능합니다."),
    WRONG_INPUT_DUPLICATE_MESSAGE("서로 다른 세자리 숫자만 입력 가능합니다."),
    WRONG_INPUT_RESTART_MESSAGE("1 또는 2만 입력 가능합니다.");
    private final String exceptionMessage;

    ExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String throwException() {
        throw new IllegalArgumentException(exceptionMessage);
    }
}
