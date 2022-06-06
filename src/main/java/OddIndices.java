public class OddIndices {
    // 2. Написать алгоритм OddIndices, который принимает массив чисел,
    // и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int[] OddIndices(int[] array) {
        int oddNum = 0;
        if (array.length != 0) {  // проверка массива не равного нулю
            int[] arrayOfOddIndices = new int[array.length / 2]; // разделена длина на два (/ 2)
            for (int i = 0; i < arrayOfOddIndices.length; i++) {
                if (oddNum < arrayOfOddIndices.length) {
                    if (i % 2 != 0) {
                        arrayOfOddIndices[oddNum] = array[i];
                        oddNum++;
                    }
                }
            }

            return arrayOfOddIndices;
        }

        return new int[]{};
    }
}