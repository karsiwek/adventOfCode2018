package karsiwek.day14;

public class day14b_bytes {

  private byte[] data;

  private void solveShit() {
    data = new byte[300000000];
    int size =0;
    data[size++]=3;
    data[size++]=7;
    int aIdx = 0;
    int bIdx = 1;
    byte[] input = {7, 0, 4, 3, 2, 1};

    for (int i = 0; i < 10; i++) {
      byte newOne = (byte) (data[aIdx] + data[bIdx]);
      if (newOne > 9) {
        data[size++]=1;
      }
      data[size++]= (byte) (newOne % 10);
      aIdx = (aIdx + data[aIdx] + 1) % size;
      bIdx = (bIdx + data[bIdx] + 1) % size;

    }

    while (true) {
      int newOne = data[aIdx] + data[bIdx];
      if (newOne > 9) {
        data[size++]=1;
      }
      data[size++]= (byte) (newOne % 10);
      aIdx = (aIdx + data[aIdx] + 1) % size;
      bIdx = (bIdx + data[bIdx] + 1) % size;

        if (input[0] == data[size- 7]
            && input[1] == data[size - 6]
            && input[2] == data[size - 5]
            && input[3] == data[size - 4]
            && input[4] == data[size - 3]
            && input[5] == data[size - 2]) {
          System.out.println(size - 7);
          return;
        } else if (input[0] == data[size - 6]
            && input[1] == data[size - 5]
            && input[2] == data[size - 4]
            && input[3] == data[size - 3]
            && input[4] == data[size - 2]
            && input[5] == data[size - 1]){
          System.out.println(size - 6);
          return;
      }
    }


  }

  public static void main(String[] args) {
    final long now = System.currentTimeMillis();
    new day14b_bytes().solveShit();
    System.out.println(System.currentTimeMillis() - now);
  }
}
