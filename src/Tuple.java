import java.util.ArrayList;
import java.util.List;

public class Tuple<V> implements Comparable<V> {
    
    protected List<V> values;

    public Tuple(List<V> valueList){
        values = new ArrayList<>();
        values.addAll(valueList);
    }

    @Override
    public int compareTo(Tuple<V> o) {
        if(o.values.equals(this.values)){
            return 1;
        } else {
            return -1;
        }
        return 0;
    }
}
