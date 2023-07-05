package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {

        int count = 0;
        boolean change;
        int arrayLength = inputArray.length;
        do {
            change = false;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    change = true;
                }
                count++;
            }
            arrayLength = arrayLength - 1;

            if (!change) {
                break;
            }

        } while (arrayLength > 1);

        return count;
    }

}
