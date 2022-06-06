public class BiggerValue {
    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    public int BiggerValue(int a, int b){
        if(a < Integer.MAX_VALUE && a > Integer.MIN_VALUE){
            if(b < Integer.MAX_VALUE && b > Integer.MIN_VALUE){
                if(a < b){

                    return a;
                }else{

                    return b;
                }
            }
            return Integer.MAX_VALUE;
        }

        return Integer.MIN_VALUE;
    }
}
