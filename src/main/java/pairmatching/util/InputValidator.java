package pairmatching.util;

import pairmatching.enums.Mission;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static pairmatching.enums.Course.BACK;
import static pairmatching.enums.Course.FRONT;
import static pairmatching.enums.ExceptionMessage.COMMAND_EXCEPTION;
import static pairmatching.enums.ExceptionMessage.MATCH_INPUT_EXCEPTION;

public class InputValidator {

    public static final String COMMAND_ONE = "1";
    public static final String COMMAND_TWO = "2";
    public static final String COMMAND_THREE = "3";
    public static final String COMMAND_QUIT = "Q";

    private static final Integer VALID_LENGTH = 3;


    public String isValidCommand(String command) {
        if (isOne(command) || isTwo(command) || isThree(command) || isQuit(command)) {
            return command;
        }
        throw new IllegalArgumentException(COMMAND_EXCEPTION.getMessage());
    }

    public List<String> isValidSelectedForMatch(String selected) {
        List<String> array = Arrays.asList(selected.split(","));
        if (isNotValidArray(array) || isNotValidCourse(array.get(0)) || isNotValidMission(array.get(1), array.get(2))) {
            throw new IllegalArgumentException(MATCH_INPUT_EXCEPTION.getMessage());
        }
        return array;
    }

    private boolean isNotValidCourse(String course) {
        return !course.equals(FRONT.getName()) || !course.equals(BACK.getName());
    }

    private boolean isNotValidMission(String level, String name) {
        Mission[] missions = Mission.values();
        for (Mission mission : missions) {
            if (isEqualLevel(level, mission) && isEqualName(name, mission)) {
                return false;
            }
        }
        return true;
    }

    private boolean isEqualLevel(String level, Mission mission) {
        return Objects.equals(mission.getLevel().getType(), level);
    }

    private boolean isEqualName(String name, Mission mission) {
        return Objects.equals(mission.getName(), name);
    }

    private boolean isNotValidArray(List<String> array) {
        return array.size() != VALID_LENGTH;
    }

    private boolean isOne(String command) {
        return  command.equals(COMMAND_ONE);
    }

    private boolean isTwo(String command) {
        return  command.equals(COMMAND_TWO);
    }

    private boolean isThree(String command) {
        return  command.equals(COMMAND_THREE);
    }

    private boolean isQuit(String command) {
        return  command.equals(COMMAND_QUIT);
    }

}
