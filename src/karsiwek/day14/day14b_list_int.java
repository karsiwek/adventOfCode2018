package karsiwek.day14;

import java.util.ArrayList;
import java.util.List;

public class day14b_list_int {

  private List<Integer> data;

  private void solveShit() {
    data = new ArrayList(30000000);
    data.add(3);
    data.add(7);
    int aIdx = 0;
    int bIdx = 1;
    byte[] input = { 7, 0, 4, 3, 2, 1 };

    for (int i = 0; i < 10; i++) {
      int newOne = data.get(aIdx) + data.get(bIdx);
      if (newOne > 9) {
        data.add(1);
      }
      data.add((newOne % 10));
      aIdx = (aIdx + data.get(aIdx) + 1) % data.size();
      bIdx = (bIdx + data.get(bIdx) + 1) % data.size();

    }

    while (true) {
      int newOne = data.get(aIdx) + data.get(bIdx);
      if (newOne > 9) {
        data.add(1);
      }
      data.add((newOne % 10));
      int size = data.size();
      aIdx = (aIdx + data.get(aIdx) + 1) % size;
      bIdx = (bIdx + data.get(bIdx) + 1) % size;

      if (input[0] == data.get(size - 7)
          && input[1] == data.get(size - 6)
          && input[2] == data.get(size - 5)
          && input[3] == data.get(size - 4)
          && input[4] == data.get(size - 3)
          && input[5] == data.get(size - 2)) {
        System.out.println(size - 7);
        return;
      } else if (input[0] == data.get(size - 6)
          && input[1] == data.get(size - 5)
          && input[2] == data.get(size - 4)
          && input[3] == data.get(size - 3)
          && input[4] == data.get(size - 2)
          && input[5] == data.get(size - 1)) {
        System.out.println(size - 6);
        return;
      }
    }


  }

  public static void main(String[] args) {
    final long now = System.currentTimeMillis();
    new day14b_list_int().solveShit();
    System.out.println(System.currentTimeMillis() - now);
  }
}
