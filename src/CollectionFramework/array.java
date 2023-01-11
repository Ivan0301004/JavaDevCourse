package CollectionFramework;

import java.util.*;

public class array {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    ArrayList<String> let = new ArrayList<String>();


    for(int i = 0; i < 6; i++){
      String in = user.nextLine();
      let.add(in);
    }

    System.out.println("Elements of array list : " + let);

  }

}
