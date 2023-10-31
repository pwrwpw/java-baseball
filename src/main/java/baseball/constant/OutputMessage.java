package baseball.constant;

public enum OutputMessage {
    MESSAGE_GAME_START("숫자 야구 게임을 시작합니다."),
    MESSAGE_INPUT_NUMBER("숫자를 입력해주세요 : "),
    MESSAGE_GAME_END("3개의 숫자를 모두 맞히셨습니다! 게임 종료."),
    MESSAGE_GAME_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    MESSAGE_STRIKE("스트라이크"),
    MESSAGE_BALL("볼"),
    MESSAGE_NOTHING("낫싱");
    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
