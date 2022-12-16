package pairmatching.repository;

import pairmatching.domain.CourseMission;
import pairmatching.domain.Pair;
import pairmatching.enums.Mission;

import java.util.Map;
import java.util.Set;

public interface PairRepository {

    Map<CourseMission, Set<Pair>> getMatches();

    void clear();
}
