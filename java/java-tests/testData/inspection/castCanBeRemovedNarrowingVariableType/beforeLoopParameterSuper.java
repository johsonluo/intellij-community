// "Change type of 'e' to 'String' and remove cast" "false"
import java.util.*;

class Test {
  void test(List<? super String> list) {
    for(Object e : list) {
      System.out.println(((<caret>String)e).trim());
    }
  }
}