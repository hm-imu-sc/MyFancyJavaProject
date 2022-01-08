
class Main {
    public static void main(String[] args) {
        SharedMemory x = SharedMemory.getInstance();
        SharedMemory y = SharedMemory.getInstance();
        x.write("address", "value");
    }
}