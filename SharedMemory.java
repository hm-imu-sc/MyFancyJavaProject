
import java.util.HashMap;
import java.util.Map;

public class SharedMemory {

    public static SharedMemory self_instance = null;

    private Map<Object, Object> memory;
    
    private SharedMemory () {
        this.memory = new HashMap<>();
    }

    public static SharedMemory getInstance() {
        if (SharedMemory.self_instance == null) {
            SharedMemory.self_instance = new SharedMemory();
        }
        return SharedMemory.self_instance;
    }

    public void write(Object address, Object value) {
        this.memory.put(address, value);
    }
}
