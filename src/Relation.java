import java.util.ArrayList;
import java.util.List;

public class Relation<V>{
    
    protected Tuple<V> attributes;
    protected V sortedAttr;
    protected ArrayList<Tuple<V>> values;

    public Relation(){
        System.out.println("created empty relation");
    }

    public Relation(List<V> attr){
        attributes = new Tuple<V>(attr);
        System.out.println("created relation with attributes");
    }

    public Relation(List<V> attr, List<V> val) {
        attributes = new Tuple<V>(attr);
        for (V v : val) {
            values.add(new Tuple<V>(v));

        }
        System.out.println("created relation with attributes");
    }


}
