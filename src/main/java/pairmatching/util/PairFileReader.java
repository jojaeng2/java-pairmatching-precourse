package pairmatching.util;

import java.io.IOException;
import java.util.List;

public interface PairFileReader {

    List<String> getFrontCrews() throws IOException;

    List<String> getBackCrews() throws IOException;

}
