package pairmatching.view;

import pairmatching.enums.Course;

import static pairmatching.enums.Course.BACK;
import static pairmatching.enums.Course.FRONT;
import static pairmatching.enums.Mission.*;

public class OutputView {

    private static final String UPPER_DIVIDE_LINE = "#############################################";
    private static final String LOWER_DIVIDE_LINE = "############################################";
    private static final String MIDDLE_DIVIDE_LINE = " | ";
    private static final String DASH_LINE = "  - ";
    private static final String LEVEL_1 = "레벨1: ";
    private static final String LEVEL_2 = "레벨2: ";
    private static final String LEVEL_3 = "레벨3: ";
    private static final String LEVEL_4 = "레벨4: ";
    private static final String LEVEL_5 = "레벨5: ";

    private static final String COURSE_MESSAGE = "과정: ";
    private static final String MISSION_MESSAGE = "미션:";
    private static final String COMMAND_MESSAGE = "기능을 선택하세요.";
    private static final String COMMAND_1 = "1. 페어 매칭";
    private static final String COMMAND_2 = "2. 페어 조회";
    private static final String COMMAND_3 = "3. 페어 초기화";
    private static final String COMMAND_4 = "Q. 종료";

    private static final String PAIR_MATCH_MESSAGE = "과정, 레벨, 미션을 선택하세요.";
    private static final String PAIR_MATCH_EXAMPLE_MESSAGE = "ex) 백엔드, 레벨1, 자동차경주";



    public OutputView() {
    }

    public void printChoiceCommandMessage() {
        System.out.println(COMMAND_MESSAGE);
        System.out.println(COMMAND_1);
        System.out.println(COMMAND_2);
        System.out.println(COMMAND_3);
        System.out.println(COMMAND_4);
    }

    public void printPairMatchMessage() {
        printUpperLineMessage();
        printCourseMessage();
        printMissionListMessage();
        printLowerLineMessage();
        printChoiceMatchMessage();
    }

    private void printChoiceMatchMessage() {
        System.out.println(PAIR_MATCH_MESSAGE);
        System.out.println(PAIR_MATCH_EXAMPLE_MESSAGE);
    }


    private void printMissionListMessage() {
        printMissionMessage();
        printLevel1Message();
        printLevel2Message();
        printLevel3Message();
        printLevel4Message();
        printLevel5Message();
    }

    private void printMissionMessage() {
        System.out.println(MISSION_MESSAGE);
    }

    private void printLevel1Message() {
        System.out.println(
                DASH_LINE +
                        LEVEL_1 +
                        RACING.getName() + MIDDLE_DIVIDE_LINE +
                        LOTTO.getName() + MIDDLE_DIVIDE_LINE +
                        BASEBALL
        );
    }

    private void printLevel2Message() {
        System.out.println(
                DASH_LINE +
                        LEVEL_2 +
                        BASKET.getName() + MIDDLE_DIVIDE_LINE +
                        PAY.getName() + MIDDLE_DIVIDE_LINE +
                        SUBWAY
        );
    }

    private void printLevel3Message() {
        System.out.println(
                DASH_LINE +
                        LEVEL_3
        );
    }

    private void printLevel4Message() {
        System.out.println(
                DASH_LINE +
                        LEVEL_4 +
                        PERFORMANCE.getName() + MIDDLE_DIVIDE_LINE +
                        DISTRIBUTION.getName()
        );
    }

    private void printLevel5Message() {
        System.out.println(
                DASH_LINE +
                        LEVEL_5
        );
    }

    private void printCourseMessage() {
        System.out.println(COURSE_MESSAGE + BACK.getName() + MIDDLE_DIVIDE_LINE + FRONT.getName());
    }

    private void printUpperLineMessage() {
        System.out.println(UPPER_DIVIDE_LINE);
    }

    private void printLowerLineMessage() {
        System.out.println(LOWER_DIVIDE_LINE);
    }
}
