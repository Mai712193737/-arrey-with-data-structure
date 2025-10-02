public class Methods {
    private int[] array;
    private int sizeOfArr;
    private int numOfelement;

    public Methods(int size) {
        array = new int[size];
        numOfelement = 0;
        sizeOfArr = size;
    }

    public void addAt(int index, int val) {
        if (numOfelement >= array.length) {
            System.out.println("Array is full! Cannot add element.");
            return;
        }
        for (int i = numOfelement - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = val;
        numOfelement++;
        System.out.println("Element added at index " + index);
    }

    public void printArray() {
        for (int i = 0; i < numOfelement; i++) {
            System.out.println("Index " + i + " = " + array[i]);
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= numOfelement) {
            System.out.println("Index out of range...");
            return;
        }
        for (int i = index; i < numOfelement - 1; i++) {
            array[i] = array[i + 1];
        }
        array[numOfelement - 1] = 0;
        numOfelement--;
        System.out.println("Element deleted at index " + index);
    }

    public void search(int searchValue) {
        boolean found = false;
        for (int i = 0; i < numOfelement; i++) {
            if (array[i] == searchValue) {
                System.out.println("The element is found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The element is not found");
        }
    }

    public void checkIffull() {
        if (numOfelement == sizeOfArr) {
            System.out.println("Array is full!");
        } else {
            System.out.println("Array is not full. Free spaces: " + (sizeOfArr - numOfelement));
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSizeOfArr() {
        return sizeOfArr;
    }

    public void setSizeOfArr(int sizeOfArr) {
        this.sizeOfArr = sizeOfArr;
    }

    public int getNumOfelement() {
        return numOfelement;
    }

    public void setNumOfelement(int numOfelement) {
        this.numOfelement = numOfelement;
    }
}
