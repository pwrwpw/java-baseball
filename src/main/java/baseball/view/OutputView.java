package baseball.view;

import static baseball.constant.OutputMessage.MESSAGE_BALL;
import static baseball.constant.OutputMessage.MESSAGE_GAME_END;
import static baseball.constant.OutputMessage.MESSAGE_GAME_RESTART;
import static baseball.constant.OutputMessage.MESSAGE_GAME_START;
import static baseball.constant.OutputMessage.MESSAGE_INPUT_NUMBER;
import static baseball.constant.OutputMessage.MESSAGE_NOTHING;
import static baseball.constant.OutputMessage.MESSAGE_STRIKE;

import java.text.MessageFormat;

public class OutputView {

	public void printGameStart() {
		System.out.println(MESSAGE_GAME_START.getMessage());
	}
	public void printRestart() {
		System.out.println(MESSAGE_GAME_RESTART.getMessage());
	}
	public void printGameEnd() {
		System.out.println(MESSAGE_GAME_END.getMessage());
	}
	public void printInputNumber() {
		System.out.print(MESSAGE_INPUT_NUMBER.getMessage());
	}
	public void printResult(int strike, int ball) {
		if(strike == 0 && ball == 0){
			System.out.println(MESSAGE_NOTHING.getMessage());
			return;
		}
		if(ball > 0){
			System.out.print(
				MessageFormat.format("{0}{1}", ball, MESSAGE_BALL.getMessage()));
		}
		if(strike > 0){
			System.out.print(
				MessageFormat.format(" {0}{1}", strike, MESSAGE_STRIKE.getMessage()));
		}
		System.out.println();
	}

}
