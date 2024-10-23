package typeSearch;

public class BinarySearch {

    // Метод для бинарного поиска
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, находится ли элемент в середине
            if (array[mid] == target) {
                return mid;
            }

            // Если элемент меньше середины, ищем в левой половине
            if (array[mid] < target) {
                left = mid + 1;
            }
            // Если элемент больше середины, ищем в правой половине
            else {
                right = mid - 1;
            }
        }

        // Если элемент не найден, возвращаем -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 13;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден в массиве.");
        }
    }
}