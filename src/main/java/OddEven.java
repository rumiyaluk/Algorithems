public class OddEven {
    //Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”
    //2147483647 + 1 →  “Undefined”
    public String oddEvenNumbers(int num) {
        if (num > Integer.MAX_VALUE && num < Integer.MIN_VALUE) {
            if (num % 2 != 0) {

                return "Odd";
            } else if (num % 2 == 0) {

                return "Even";
            }
        }

        return "Undefined";
    }

}

