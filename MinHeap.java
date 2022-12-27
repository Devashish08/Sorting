import java.util.*;

class PriorityQueue {
    ArrayList<Integer> heap;

    PriorityQueue() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        if (heap.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    int size() {
        return heap.size();
    }

    int getMin() {
        if (isEmpty()) {
            return -1;
        }
        return heap.get(0);
    }

    void insert(int ele) {
        heap.add(ele);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() {
        if (isEmpty()) {
            return -1;
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int minIndex = 0;
        int index = 0;
        int leftchildIndex = 1;
        int rightchildIndex = 2;
        while (leftchildIndex < heap.size()) {
            if (heap.get(leftchildIndex) < heap.get(minIndex)) {
                minIndex = leftchildIndex;
            }
            if (rightchildIndex < heap.size() && heap.get(rightchildIndex) < heap.get(minIndex)) {
                minIndex = rightchildIndex;
            }
            if (minIndex == index) {
                break;
            } else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftchildIndex = 2 * index + 1;
                rightchildIndex = 2 * index + 1;
            }

        }
        return temp;
    }
}

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int arr[] = { 10, 50, 6, 29, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            pq.insert(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.removeMin());
        }
    }
}
