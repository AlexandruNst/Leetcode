package Array.Easy._15_1656_Desig_an_Ordered_Stream;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    String[] stream;
    int index;

    public OrderedStream(int n) {
        this.stream = new String[n];
        this.index = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> chunk = new ArrayList<>();
        stream[idKey-1] = value;
        while(index < stream.length && stream[index] != null){
            chunk.add(this.stream[index]);
            index++;
        }
        return chunk;
    }

}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
