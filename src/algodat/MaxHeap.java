package algodat;

public class MaxHeap {
    private final int heapSize;

    private HeapElement[] heap;

    private int nextUnusedElement;

    public MaxHeap(int heapSize){
        if(heapSize > 0)
            this.heapSize = heapSize;
        else
            this.heapSize = 100;
        heap = new HeapElement[heapSize];
        nextUnusedElement = 1;
    }

    public void addHeapElement(HeapElement heapElement){
        heap[nextUnusedElement] = heapElement;
        nextUnusedElement++;
    }

    public HeapElement getNext(){
        HeapElement temp = heap[1];
        deleteMax();
        return temp;
    }

    private void deleteMax(){
        heap[1] = heap[findLastElement()];
        heap[findLastElement()] = null;
        nextUnusedElement--;
        sortMaxCorrect();
    }

    private void sortMaxCorrect(){
        int currentIndex = 1;
        int priorityOfCurrentMax = heap[currentIndex].getPriority();
        boolean fullySorted = false;
        int priorityLeftElement;
        int priorityRightElement;
        do{
            priorityLeftElement = heap[currentIndex*2].getPriority();
            priorityRightElement = heap[currentIndex*2 + 1].getPriority();
            if(priorityOfCurrentMax >= priorityLeftElement && priorityOfCurrentMax >= priorityRightElement)
                fullySorted = true;
            else{
                if (priorityOfCurrentMax < priorityLeftElement && priorityOfCurrentMax >= priorityRightElement){

                }else if(priorityOfCurrentMax >= priorityLeftElement && priorityOfCurrentMax < priorityRightElement){

                }else if(priorityOfCurrentMax < priorityLeftElement && priorityOfCurrentMax < priorityRightElement){
                    if(priorityOfCurrentMax > priorityLeftElement);
                }
            }
        }while (!fullySorted);
    }

    private int findLastElement(){
        return nextUnusedElement - 1;
    }

    public int getHeapSize() {
        return heapSize;
    }
}
