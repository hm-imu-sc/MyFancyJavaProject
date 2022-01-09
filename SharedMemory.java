
import java.util.HashMap;
import java.util.Map;

public class SharedMemory {

    private Map<Object, Object> memory;
    
    SharedMemory () {
        this.memory = new HashMap<>();
    }

    public void write(Object address, Object value) {
        this.memory.put(address, value);
    }

    public Object read(Object address) {
        return this.memory.get(address);
    }
}
