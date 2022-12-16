package pairmatching.controller;

import pairmatching.service.PairMatchService;
import pairmatching.service.PairMatchServiceImpl;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.List;
import java.util.Objects;

import static pairmatching.util.InputValidator.*;

public class PairMatchControllerImpl implements PairMatchController {

    private final InputView inputView;
    private final OutputView outputView;
    private final PairMatchService pairMatchService;

    public PairMatchControllerImpl() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.pairMatchService = new PairMatchServiceImpl();
    }

    public void execute() {
        String command;
        do {
            outputView.printChoiceCommandMessage();
            command = inputView.inputCommand();
            runCommand(command);
        } while (isExit(command));
    }

    private void runCommand(String command) {
        if (isCommandOne(command)) {
            match();
        }
        if (isCommandTwo(command)) {

        }
        if (isCommandThree(command)) {
            pairMatchService.clear();
        }
    }

    private void match() {
        outputView.printPairMatchMessage();
        List<String> matchInfo = inputView.inputSelectedMatch();
        if
        pairMatchService.match(matchInfo);
    }

    private boolean isExit(String command) {
        return Objects.equals(command, COMMAND_QUIT);
    }

    private boolean isCommandOne(String command) {
        return Objects.equals(command, COMMAND_ONE);
    }

    private boolean isCommandTwo(String command) {
        return Objects.equals(command, COMMAND_TWO);
    }

    private boolean isCommandThree(String command) {
        return Objects.equals(command, COMMAND_THREE);
    }
}
