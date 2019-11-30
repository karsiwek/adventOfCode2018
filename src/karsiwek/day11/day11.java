package karsiwek.day11;

public class day11 {

  private int[][][] results;
  private int[][] levels;
  private static int TANK_SIZE = 300;
  private static int SERIAL = 9221;

  public day11() {
    results = new int[301][][];
    for (int i = 0; i <= TANK_SIZE; i++) {
      results[i] = new int[300][];
      for (int j = 0; j < TANK_SIZE; j++) {
        results[i][j] = new int[300];
      }
    }

    levels = new int[300][];
    for (int i = 0; i < TANK_SIZE; i++) {
      levels[i] = new int[300];
    }

    for (int x = 0; x < TANK_SIZE; x++) {
      for (int y = 0; y < TANK_SIZE; y++) {
        levels[x][y] = (((x + 10) * y + SERIAL) * (x + 10) / 100) % 10 - 5;
      }
    }

    results[1] = levels;
  }

  private void onlyBorderMethod() {
    int maxValue = 0;
    int maxValueSize = 0;
    int maxValueX = -1;
    int maxValueY = -1;
    for (int size = 2; size <= TANK_SIZE; size++) {
      for (int x = 0; x < TANK_SIZE - size; x++) {
        for (int y = 0; y < TANK_SIZE - size; y++) {
          int squareValue = results[size - 1][x][y] + levels[x + size - 1][y + size - 1];
          for (int i = 0; i < size - 1; i++) {
            squareValue += levels[x + size - 1][y + i] + levels[x + i][y + size - 1];
          }

          if (squareValue > maxValue) {
            maxValue = squareValue;
            maxValueSize = size;
            maxValueX = x;
            maxValueY = y;

            // System.out.println("borders: x" + String.valueOf(x) +" y:" + String.valueOf(y) + " size"+ String.valueOf(size)+ " value:" + String.valueOf(maxValue));

          }

          results[size][x][y] = squareValue;
        }
      }
    }
    System.out.println(maxValueX);
    System.out.println(maxValueY);
    System.out.println(maxValueSize);
  }

  private void hybridMethod() {
    int maxValue = 0;
    int maxValueSize = 0;
    int maxValueX = -1;
    int maxValueY = -1;
    for (int size = 2; size <= TANK_SIZE; size++) {
      int chunkSize = 0;
      for (int divider = 2; divider <= Math.sqrt(size); divider++) {
        if (size % divider == 0) {
          chunkSize = size / divider;
          break;
        }
      }
      if (chunkSize > 0) {
        int parts = size / chunkSize;

        for (int x = 0; x < TANK_SIZE - size; x++) {
          for (int y = 0; y < TANK_SIZE - size; y++) {
            int squareValue = 0;
            for (int i = 0; i < parts; i++) {
              for (int j = 0; j < parts; j++) {
                squareValue += results[chunkSize][x + i * chunkSize][y + j * chunkSize];
              }
            }
            if (squareValue > maxValue) {
              maxValue = squareValue;
              maxValueSize = size;
              maxValueX = x;
              maxValueY = y;

              // System.out.println("sub squares: x" + String.valueOf(x) +" y:" + String.valueOf(y) + " size"+ String.valueOf(size) + " value:" + String.valueOf(maxValue));
            }
            results[size][x][y] = squareValue;
          }
        }


      } else {
        for (int x = 0; x < TANK_SIZE - size; x++) {
          for (int y = 0; y < TANK_SIZE - size; y++) {
            int squareValue = results[size - 1][x][y] + levels[x + size - 1][y + size - 1];
            for (int i = 0; i < size - 1; i++) {
              squareValue += levels[x + size - 1][y + i] + levels[x + i][y + size - 1];
            }

            if (squareValue > maxValue) {
              maxValue = squareValue;
              maxValueSize = size;
              maxValueX = x;
              maxValueY = y;

              // System.out.println("borders: x" + String.valueOf(x) +" y:" + String.valueOf(y) + " size"+ String.valueOf(size)+ " value:" + String.valueOf(maxValue));
            }

            results[size][x][y] = squareValue;
          }
        }

      }
    }
    System.out.println(maxValueX);
    System.out.println(maxValueY);
    System.out.println(maxValueSize);
  }

  public static void main(String[] args) {
    final long now = System.currentTimeMillis();
    new day11().hybridMethod();
    //new day11().onlyBorderMethod()
    System.out.println(System.currentTimeMillis() - now);
  }
}
