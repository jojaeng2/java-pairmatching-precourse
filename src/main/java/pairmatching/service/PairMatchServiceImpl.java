package pairmatching.service;

import pairmatching.domain.CourseMission;
import pairmatching.domain.Pair;
import pairmatching.enums.Course;
import pairmatching.enums.Level;
import pairmatching.enums.Mission;
import pairmatching.repository.PairRepository;
import pairmatching.repository.PairRepositoryImpl;
import pairmatching.util.PairFileReader;
import pairmatching.util.PairFileReaderImpl;

import java.util.*;

import static pairmatching.enums.ExceptionMessage.LEVEL_NOT_EXIST_EXCEPTION;
import static pairmatching.enums.ExceptionMessage.MISSION_NOT_EXIST_EXCEPTION;

public class PairMatchServiceImpl implements PairMatchService {

    private final PairRepository pairRepository;
    private final PairFileReader fileReader;

    public PairMatchServiceImpl() {
        this.pairRepository = new PairRepositoryImpl();
        fileReader = new PairFileReaderImpl();
    }

    @Override
    public void match(List<String> info) {
        Course course = Course.getCourse(info.get(0));
        Level level = getLevelByType(info.get(1));
        Mission mission = getMissionByLevelAndName(level, info.get(2));
        CourseMission courseMission = new CourseMission(course, mission);
    }


    public void clear() {
        pairRepository.clear();
    }


    private Level getLevelByType(String type) {
        return Arrays.stream(Level.values())
                .filter(it -> it.isEqualWithType(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(LEVEL_NOT_EXIST_EXCEPTION.getMessage()));
    }

    private Mission getMissionByLevelAndName(Level level, String name) {
        return Arrays.stream(Mission.values())
                .filter(it -> it.isEqualWithLevelAndName(level, name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MISSION_NOT_EXIST_EXCEPTION.getMessage()));
    }
}


