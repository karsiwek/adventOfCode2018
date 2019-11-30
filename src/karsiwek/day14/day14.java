package karsiwek.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day14 {

  private List<Integer> data;

  public day14() {

  }

  private void solveShit() {
    data = new ArrayList(Arrays.asList(3,7));
    int aIdx = 0;
    int bIdx = 1;
    int input =637061;
    while(data.size()<input+10){
      int newOne = data.get(aIdx) + data.get(bIdx);
      if(newOne>9) {
        data.add(newOne/10);
      }
      data.add(newOne%10);
      aIdx=(aIdx+data.get(aIdx)+1)%data.size();
      bIdx=(bIdx+data.get(bIdx)+1)%data.size();
    }

    System.out.println(data.subList(input, input+10));

  }

  public static void main(String[] args) {
    final long now = System.currentTimeMillis();
    new day14().solveShit();
    System.out.println(System.currentTimeMillis() - now);
  }
}
