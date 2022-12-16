package pairmatching;

import pairmatching.controller.PairMatchController;
import pairmatching.controller.PairMatchControllerImpl;

public class Application {
    public static void main(String[] args) {
        PairMatchController controller = new PairMatchControllerImpl();
        controller.execute();
    }


}
