import java.util.ArrayList;
import java.util.List;

public class Relation<V> {

    protected Tuple<V> attributes;
    protected V sortedAttr;
    protected ArrayList<Tuple<V>> values;

    public Relation() {
        System.out.println("created empty relation");
    }

    public Relation(List<V> attr) {
        attributes = new Tuple<V>(attr);
        System.out.println("created relation with attributes");
    }

    public Relation(List<V> attr, List<List<V>> vals) {
        attributes = new Tuple<V>(attr);
        for (List<V> l : vals) {
            Tuple<V> t = new Tuple<V>(l);
            addTuple(t);

        }
        System.out.println("created relation with attributes");
    }

    public void addTuple(Tuple<V> tuple) {
        values.add(tuple);
    }

    public List<Tuple<V>> getValues() {
        return this.values;
    }

}
