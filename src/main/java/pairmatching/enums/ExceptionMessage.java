package pairmatching.enums;

public enum ExceptionMessage {

    COMMAND_EXCEPTION("[ERROR] COMMAND는 1, 2, Q만 입력할 수 있습니다."),
    MATCH_INPUT_EXCEPTION("[ERROR] 과정, 레벨, 미션 순서로 입력을 해주세요."),
    COURSE_NOT_EXIST_EXCEPTION("[ERROR] 과정은 백엔드와 프론트엔드만 존재합니다."),
    LEVEL_NOT_EXIST_EXCEPTION("[ERROR] 레벨은 1~5 사이의 값만 입력해주세요."),
    MISSION_NOT_EXIST_EXCEPTION("[ERROR] 존재하지 않는 레벨과 미션 조합입니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
