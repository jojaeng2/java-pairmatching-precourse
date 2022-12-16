package pairmatching.repository;

import pairmatching.domain.CourseMission;
import pairmatching.domain.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PairRepositoryImpl implements PairRepository{

    private final Map<CourseMission, Set<Pair>> matches;

    public PairRepositoryImpl() {
        this.matches = new HashMap<>();
    }

    public Map<CourseMission, Set<Pair>> getMatches() {
        return matches;
    }

    public void clear() {
        this.matches.clear();
    }
}
