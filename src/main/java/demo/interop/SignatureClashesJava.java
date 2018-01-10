package demo.interop;

import java.util.ArrayList;
import java.util.List;

public class SignatureClashesJava {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        List<Integer> filtered = SignatureClashes.filterValidInt(list);

    }

}
