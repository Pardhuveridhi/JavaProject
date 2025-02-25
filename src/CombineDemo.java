package src;

class CombineDemo {
    static int staticCount = 0;
    int instanceCount = 0;

    static void incrementCounts(CombineDemo obj) {
        staticCount++;
        obj.instanceCount++;
        System.out.println("Static Count: " + staticCount);
        System.out.println("Instance Count: " + obj.instanceCount);
    }

    public static void main(String[] args) {
        CombineDemo obj1 = new CombineDemo();
        CombineDemo obj2 = new CombineDemo();

        incrementCounts(obj1);
        incrementCounts(obj1);
        incrementCounts(obj2);
    }
}
