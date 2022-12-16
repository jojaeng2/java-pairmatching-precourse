package pairmatching.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static pairmatching.enums.FileUrl.BACK;
import static pairmatching.enums.FileUrl.FRONT;

public class PairFileReaderImpl implements PairFileReader{


    public List<String> getFrontCrews() throws IOException {
        List<String> crews = new ArrayList<>();
        readFile(crews, FRONT.getUrl());
        return crews;
    }

    public List<String> getBackCrews() throws IOException {
        List<String> crews = new ArrayList<>();
        readFile(crews, BACK.getUrl());
        return crews;
    }

    private void readFile(List<String> crews, String fileDirectory) throws IOException {
        File file = new File(fileDirectory);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        readLine(crews, bufferedReader);
        bufferedReader.close();
    }

    private void readLine(List<String> crews, BufferedReader bufferedReader) throws IOException {
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            crews.add(line);
        }
    }
}
