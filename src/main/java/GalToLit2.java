public class GalToLit2 {
  public static void main(String[] args) {
    double galons, liters;
    int counter;

    counter = 0;

    for (galons = 1; galons <= 100; galons++){
      liters = galons * 3.7854;
      System.out.println( galons + "галонам оответствует" + liters + "литра");

      counter++;
      if (counter==10){
        System.out.println();
        counter = 0;
      }
    }


  }
}
