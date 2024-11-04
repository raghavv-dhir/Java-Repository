package Arrays;

public class arrayADT {
    //insert, get, display, search, delete, reverse, sort, getSize, isEmpty, isFull.
    private int size;
    private int[] arr;
    public arrayADT(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void insert(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        arr[index] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void reverse() {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public static void main(String[] args) {
        arrayADT array = new arrayADT(5);
        array.insert(0, 10);
        array.insert(1, 20);
        array.insert(2, 30);
        array.insert(3, 40);
        array.insert(4, 50);

        array.display(); // Output: 10 20 30 40 50

        System.out.println("Search for 30: " + array.search(30)); // Output: 2

        array.delete(2);
        array.display(); // Output: 10 20 40 50

        array.reverse();
        array.display(); // Output: 50 40 20 10

        array.sort();
        array.display(); // Output: 10 20 40 50

        System.out.println("Array size: " + array.getSize()); // Output: 4
        System.out.println("Is array empty? " + array.isEmpty()); // Output: false
        System.out.println("Is array full? " + array.isFull()); // Output: false
        array.delete(1);
        array.display(); // Output: 10 40 50

        System.out.println("Array size: " + array.getSize()); // Output: 3
        System.out.println("Is array empty? " + array.isEmpty()); // Output: false
        System.out.println("Is array full? " + array.isFull()); // Output: false

        array.insert(1, 30);
        array.display(); // Output: 10 30 40 50

        System.out.println("Array size: " + array.getSize()); // Output: 4
        System.out.println("Is array empty? " + array.isEmpty()); // Output: false
        System.out.println("Is array full? " + array.isFull()); // Output: false

        array.delete(3);
        array.display(); // Output: 10 30 40

        System.out.println("Array size: " + array.getSize()); // Output: 3
        System.out.println("Is array empty? " + array.isEmpty()); // Output: false
        System.out.println("Is array full? " + array.isFull()); // Output: false
    }
}
