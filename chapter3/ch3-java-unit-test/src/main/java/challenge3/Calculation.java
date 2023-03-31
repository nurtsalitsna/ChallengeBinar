package challenge3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface Calculation {
    double getMean();

    String getModus();

    String getMedian();

    default List<String> sortAsNumbers(Collection<String> collection) {
        return collection
                .stream()
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}
