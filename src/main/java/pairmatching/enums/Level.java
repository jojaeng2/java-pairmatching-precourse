package pairmatching.enums;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import static pairmatching.enums.ExceptionMessage.LEVEL_NOT_EXIST_EXCEPTION;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private final String type;

    Level(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean isEqualWithType(String type) {
        return Objects.equals(this.type, type);
    }
}
