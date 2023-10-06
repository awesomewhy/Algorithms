package Algorithms;

public class sfdewsfsef {
    public static void main(String[] args) {
        int[] array = {3, -5, 2, 8, -1, 4, -7, 6, 0, 9, -2, 1}; // твой массив

        int minPositiveElement = Integer.MAX_VALUE;
        int minPositiveElementIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < minPositiveElement) {
                minPositiveElement = array[i];
                minPositiveElementIndex = i;
            }
        }

        System.out.println("Наименьший положительный элемент: " + minPositiveElement);
        System.out.println("Индекс этого элемента в массиве: " + minPositiveElementIndex);
    }
}
