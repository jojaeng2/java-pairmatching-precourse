package pairmatching.enums;

import java.util.Objects;

import static pairmatching.enums.Level.*;

public enum Mission {
    RACING(LEVEL1, "자동차경주"),
    LOTTO(LEVEL1, "로또"),
    BASEBALL(LEVEL1, "숫자야구게임"),
    BASKET(LEVEL2, "장바구니"),
    PAY(LEVEL2, "결제"),
    SUBWAY(LEVEL2, "지하철노선도"),
    PERFORMANCE(LEVEL4, "성능개선"),
    DISTRIBUTION(LEVEL4, "배포");

    private final Level level;
    private final String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public boolean isEqualWithLevelAndName(Level level, String name) {
        return this.level == level && Objects.equals(this.name, name);
    }


}
