package pairmatching.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static pairmatching.enums.ExceptionMessage.COURSE_NOT_EXIST_EXCEPTION;

public enum Course {
    FRONT("프론트엔드"),
    BACK("백엔드");



    private final String name;
    private static Map<String, Course> courseMap = new HashMap<>();


    static {
        Arrays.stream(Course.values())
                .forEach(it -> courseMap.put(it.name, it));
    }

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Course getCourse(String name) {
        if (courseMap.containsKey(name)) {
            return courseMap.get(name);
        }
        throw new IllegalArgumentException(COURSE_NOT_EXIST_EXCEPTION.getMessage());
    }



}
