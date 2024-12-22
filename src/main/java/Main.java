

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<DataRegister> registerList = new ArrayList<>();
        DataReader reader = new DataReader(registerList);
        reader.RegisterList_completioner();
        DataProcesor procesor = new DataProcesor();
        System.out.println(procesor.average_rating_histogram_builder(reader));

    }
}
