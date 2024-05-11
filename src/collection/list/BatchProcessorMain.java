package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        BatchProcessor processor1 = new BatchProcessor(new MyArrayList<Integer>());
        processor1.logic(50_000);

        BatchProcessor processor2 = new BatchProcessor(new MyLinkedList<Integer>());
        processor2.logic(50_000);
    }
}
