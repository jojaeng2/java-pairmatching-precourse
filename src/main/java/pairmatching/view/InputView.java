package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.util.InputValidator;

import java.util.List;

public class InputView {

    private InputValidator validator;

    public InputView() {
        this.validator = new InputValidator();
    }

    public String inputCommand() {
        while (true) {
            try {
                return validator.isValidCommand(Console.readLine());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<String> inputSelectedMatch() {
        while (true) {
            try {
                return validator.isValidSelectedForMatch(Console.readLine());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
