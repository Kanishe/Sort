import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
  public static void main(String[] args) {
    int [] unsortedArray = { 2,1,3,4,5,10, 1002, 109};
    choiseSort(unsortedArray);
  }
  public static void choiseSort (int [] arrayToSort){
    int indexMin; // 6 тут будет храниться минимальный элемент 6
    for (int index = 0; index < arrayToSort.length - 1; index++){
      indexMin = index; // 7тот же самый индекс что и порядковый номер этого элемнта
       for ( int indexToScan = index; indexToScan <arrayToSort.length; indexToScan ++){
         if (arrayToSort[indexMin]>arrayToSort[indexToScan]){
           indexMin = indexToScan;
         }

       }
       int temp = arrayToSort [index];
       arrayToSort[index] = arrayToSort[indexMin];
       arrayToSort[indexMin]=temp;
    }
    System.out.println(Arrays.toString(arrayToSort));
  }
}
