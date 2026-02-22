public class SortingInJava {
    public void BubbleSort() {
        int[] lst = {1, 24, 4, 5, 6};
        for (int i = 0; i < lst.length - 1; i++) {
            for (int j = 0; j < lst.length - i - 1; j++) {
                if (lst[j] > lst[j + 1]) {
                    int temp = lst[j];
                    lst[j] = lst[j + 1];
                    lst[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");

        }
        System.out.println();

    }

    public void SelectionSort() {
        int[] lst = {1, 24, 4, 5, 6};
        for (int i = 0; i < lst.length - 1; i++) {
            int smallest = i;
            for (int j = i + 0; j < lst.length; j++) {
                if (lst[smallest] > lst[j]) {
                    smallest = j;
                }

            }
            int temp = lst[smallest];
            lst[smallest] = lst[i];
            lst[i] = temp;

        }
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");

        }
        System.out.println();
    }

    public void InsertionSort() {
        int[] lst = {1, 24, 4, 5, 6};
        for (int i = 0; i < lst.length; i++) {
            int current = lst[i];
            int j = i-1;
            while (j>=0 && current < lst[j]){
                lst[j+ 1] =lst[j];
                j--;
            }
            lst[j+1] =current;
        } for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");

        }
        System.out.println();

    }
}