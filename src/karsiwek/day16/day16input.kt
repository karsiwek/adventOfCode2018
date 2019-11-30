package karsiwek.day16


var input: String =
        """Before: [3, 1, 0, 1]
9 3 3 2
After:  [3, 1, 0, 1]

Before: [1, 0, 3, 1]
4 2 3 2
After:  [1, 0, 0, 1]

Before: [3, 3, 3, 3]
4 3 0 0
After:  [1, 3, 3, 3]

Before: [1, 2, 2, 2]
11 2 3 2
After:  [1, 2, 2, 2]

Before: [2, 1, 0, 0]
13 0 3 3
After:  [2, 1, 0, 1]

Before: [3, 1, 2, 3]
10 1 3 0
After:  [0, 1, 2, 3]

Before: [2, 1, 1, 1]
8 3 1 1
After:  [2, 0, 1, 1]

Before: [3, 0, 0, 3]
4 3 0 1
After:  [3, 1, 0, 3]

Before: [2, 1, 2, 0]
13 0 3 1
After:  [2, 1, 2, 0]

Before: [0, 3, 0, 0]
0 0 1 1
After:  [0, 0, 0, 0]

Before: [3, 1, 2, 2]
15 1 3 1
After:  [3, 0, 2, 2]

Before: [2, 1, 1, 1]
2 2 1 2
After:  [2, 1, 2, 1]

Before: [3, 2, 2, 3]
10 1 3 2
After:  [3, 2, 0, 3]

Before: [0, 2, 2, 3]
10 2 3 3
After:  [0, 2, 2, 0]

Before: [0, 2, 3, 1]
7 0 0 1
After:  [0, 0, 3, 1]

Before: [0, 2, 2, 1]
6 3 2 3
After:  [0, 2, 2, 1]

Before: [3, 2, 2, 1]
6 3 2 1
After:  [3, 1, 2, 1]

Before: [0, 1, 3, 0]
12 1 3 3
After:  [0, 1, 3, 1]

Before: [2, 1, 3, 1]
8 2 0 1
After:  [2, 1, 3, 1]

Before: [1, 1, 2, 3]
3 0 2 1
After:  [1, 0, 2, 3]

Before: [2, 0, 3, 0]
8 2 0 2
After:  [2, 0, 1, 0]

Before: [1, 3, 2, 2]
11 2 3 0
After:  [2, 3, 2, 2]

Before: [1, 2, 0, 1]
9 3 3 0
After:  [0, 2, 0, 1]

Before: [3, 1, 0, 3]
4 3 0 3
After:  [3, 1, 0, 1]

Before: [2, 2, 3, 3]
10 1 3 0
After:  [0, 2, 3, 3]

Before: [3, 1, 3, 3]
10 1 3 3
After:  [3, 1, 3, 0]

Before: [2, 1, 0, 3]
10 1 3 1
After:  [2, 0, 0, 3]

Before: [1, 2, 2, 1]
3 0 2 3
After:  [1, 2, 2, 0]

Before: [1, 2, 2, 3]
3 0 2 0
After:  [0, 2, 2, 3]

Before: [0, 1, 2, 1]
6 3 2 0
After:  [1, 1, 2, 1]

Before: [1, 0, 3, 0]
5 3 2 2
After:  [1, 0, 1, 0]

Before: [2, 0, 3, 2]
8 0 1 3
After:  [2, 0, 3, 1]

Before: [1, 1, 2, 2]
1 1 2 3
After:  [1, 1, 2, 0]

Before: [2, 1, 3, 0]
13 0 3 2
After:  [2, 1, 1, 0]

Before: [2, 3, 2, 2]
9 3 3 2
After:  [2, 3, 0, 2]

Before: [0, 1, 2, 2]
11 2 3 2
After:  [0, 1, 2, 2]

Before: [2, 0, 2, 0]
13 0 3 3
After:  [2, 0, 2, 1]

Before: [1, 3, 2, 1]
3 0 2 3
After:  [1, 3, 2, 0]

Before: [0, 1, 1, 2]
2 2 1 2
After:  [0, 1, 2, 2]

Before: [3, 0, 2, 2]
8 3 2 3
After:  [3, 0, 2, 0]

Before: [2, 1, 2, 2]
15 1 3 2
After:  [2, 1, 0, 2]

Before: [1, 0, 3, 2]
9 3 3 2
After:  [1, 0, 0, 2]

Before: [3, 1, 1, 1]
14 1 3 0
After:  [1, 1, 1, 1]

Before: [0, 1, 0, 2]
0 0 2 2
After:  [0, 1, 0, 2]

Before: [3, 1, 1, 2]
15 1 3 1
After:  [3, 0, 1, 2]

Before: [3, 1, 2, 1]
1 1 2 0
After:  [0, 1, 2, 1]

Before: [3, 3, 2, 2]
9 3 3 1
After:  [3, 0, 2, 2]

Before: [1, 1, 2, 0]
1 1 2 0
After:  [0, 1, 2, 0]

Before: [0, 2, 2, 2]
11 2 3 0
After:  [2, 2, 2, 2]

Before: [1, 2, 2, 0]
3 0 2 2
After:  [1, 2, 0, 0]

Before: [2, 0, 1, 3]
8 0 1 1
After:  [2, 1, 1, 3]

Before: [2, 2, 2, 0]
4 2 0 3
After:  [2, 2, 2, 1]

Before: [3, 3, 1, 1]
9 2 3 1
After:  [3, 0, 1, 1]

Before: [1, 0, 3, 0]
5 3 2 1
After:  [1, 1, 3, 0]

Before: [0, 1, 3, 2]
15 1 3 0
After:  [0, 1, 3, 2]

Before: [2, 2, 0, 3]
10 1 3 0
After:  [0, 2, 0, 3]

Before: [3, 1, 2, 2]
1 1 2 3
After:  [3, 1, 2, 0]

Before: [1, 3, 2, 2]
11 2 3 2
After:  [1, 3, 2, 2]

Before: [3, 0, 3, 0]
5 3 2 2
After:  [3, 0, 1, 0]

Before: [1, 1, 0, 0]
14 0 2 1
After:  [1, 0, 0, 0]

Before: [0, 0, 2, 1]
0 0 1 3
After:  [0, 0, 2, 0]

Before: [2, 1, 2, 0]
1 1 2 0
After:  [0, 1, 2, 0]

Before: [1, 1, 2, 3]
3 0 2 3
After:  [1, 1, 2, 0]

Before: [3, 1, 2, 2]
1 1 2 2
After:  [3, 1, 0, 2]

Before: [2, 2, 3, 2]
8 2 0 2
After:  [2, 2, 1, 2]

Before: [3, 3, 0, 0]
8 0 2 0
After:  [1, 3, 0, 0]

Before: [0, 2, 2, 2]
0 0 3 2
After:  [0, 2, 0, 2]

Before: [1, 3, 0, 1]
9 3 3 0
After:  [0, 3, 0, 1]

Before: [3, 3, 2, 2]
11 2 3 0
After:  [2, 3, 2, 2]

Before: [3, 1, 2, 2]
11 2 3 2
After:  [3, 1, 2, 2]

Before: [3, 2, 3, 0]
5 3 2 3
After:  [3, 2, 3, 1]

Before: [1, 1, 2, 1]
1 1 2 3
After:  [1, 1, 2, 0]

Before: [0, 2, 1, 3]
10 1 3 1
After:  [0, 0, 1, 3]

Before: [1, 1, 2, 1]
3 0 2 1
After:  [1, 0, 2, 1]

Before: [1, 0, 3, 0]
5 3 2 3
After:  [1, 0, 3, 1]

Before: [3, 0, 1, 3]
10 2 3 1
After:  [3, 0, 1, 3]

Before: [1, 1, 2, 3]
1 1 2 0
After:  [0, 1, 2, 3]

Before: [0, 0, 3, 1]
4 2 3 0
After:  [0, 0, 3, 1]

Before: [0, 2, 1, 1]
7 0 0 0
After:  [0, 2, 1, 1]

Before: [0, 3, 0, 1]
9 3 3 2
After:  [0, 3, 0, 1]

Before: [1, 2, 0, 1]
14 0 2 0
After:  [0, 2, 0, 1]

Before: [1, 1, 1, 1]
2 2 1 2
After:  [1, 1, 2, 1]

Before: [2, 2, 2, 0]
4 2 1 1
After:  [2, 1, 2, 0]

Before: [2, 2, 2, 2]
11 2 3 2
After:  [2, 2, 2, 2]

Before: [1, 2, 1, 3]
10 2 3 1
After:  [1, 0, 1, 3]

Before: [3, 1, 1, 0]
2 2 1 0
After:  [2, 1, 1, 0]

Before: [0, 3, 3, 0]
7 0 0 1
After:  [0, 0, 3, 0]

Before: [3, 3, 2, 2]
8 3 2 0
After:  [0, 3, 2, 2]

Before: [0, 0, 3, 0]
5 3 2 2
After:  [0, 0, 1, 0]

Before: [3, 1, 0, 2]
15 1 3 2
After:  [3, 1, 0, 2]

Before: [2, 3, 3, 1]
4 2 3 1
After:  [2, 0, 3, 1]

Before: [2, 0, 0, 0]
13 0 3 2
After:  [2, 0, 1, 0]

Before: [1, 1, 2, 2]
15 1 3 0
After:  [0, 1, 2, 2]

Before: [0, 1, 3, 3]
4 3 2 1
After:  [0, 1, 3, 3]

Before: [0, 0, 2, 3]
10 2 3 2
After:  [0, 0, 0, 3]

Before: [0, 1, 0, 3]
7 0 0 2
After:  [0, 1, 0, 3]

Before: [1, 0, 1, 3]
10 2 3 2
After:  [1, 0, 0, 3]

Before: [0, 0, 1, 1]
7 0 0 1
After:  [0, 0, 1, 1]

Before: [3, 1, 3, 0]
12 1 3 1
After:  [3, 1, 3, 0]

Before: [0, 3, 2, 1]
6 3 2 3
After:  [0, 3, 2, 1]

Before: [2, 1, 3, 0]
13 0 3 3
After:  [2, 1, 3, 1]

Before: [2, 1, 2, 3]
1 1 2 2
After:  [2, 1, 0, 3]

Before: [1, 1, 0, 0]
12 1 3 0
After:  [1, 1, 0, 0]

Before: [2, 1, 2, 2]
1 1 2 2
After:  [2, 1, 0, 2]

Before: [2, 0, 2, 0]
13 0 3 2
After:  [2, 0, 1, 0]

Before: [2, 1, 3, 1]
8 2 0 0
After:  [1, 1, 3, 1]

Before: [0, 0, 2, 2]
11 2 3 0
After:  [2, 0, 2, 2]

Before: [1, 1, 3, 2]
15 1 3 1
After:  [1, 0, 3, 2]

Before: [0, 1, 2, 2]
1 1 2 1
After:  [0, 0, 2, 2]

Before: [0, 1, 1, 2]
15 1 3 3
After:  [0, 1, 1, 0]

Before: [1, 1, 1, 0]
12 1 3 2
After:  [1, 1, 1, 0]

Before: [3, 1, 0, 1]
14 1 3 3
After:  [3, 1, 0, 1]

Before: [3, 1, 0, 1]
8 3 1 2
After:  [3, 1, 0, 1]

Before: [1, 3, 2, 1]
3 0 2 0
After:  [0, 3, 2, 1]

Before: [0, 1, 2, 1]
6 3 2 1
After:  [0, 1, 2, 1]

Before: [2, 1, 1, 0]
2 2 1 1
After:  [2, 2, 1, 0]

Before: [0, 1, 2, 1]
1 1 2 1
After:  [0, 0, 2, 1]

Before: [1, 1, 2, 2]
15 1 3 2
After:  [1, 1, 0, 2]

Before: [2, 1, 1, 0]
2 2 1 0
After:  [2, 1, 1, 0]

Before: [1, 0, 2, 1]
6 3 2 1
After:  [1, 1, 2, 1]

Before: [0, 2, 1, 0]
0 0 2 3
After:  [0, 2, 1, 0]

Before: [1, 3, 2, 3]
3 0 2 2
After:  [1, 3, 0, 3]

Before: [2, 1, 2, 2]
15 1 3 3
After:  [2, 1, 2, 0]

Before: [1, 1, 3, 1]
14 1 3 3
After:  [1, 1, 3, 1]

Before: [3, 1, 1, 2]
2 2 1 0
After:  [2, 1, 1, 2]

Before: [0, 1, 2, 3]
1 1 2 2
After:  [0, 1, 0, 3]

Before: [2, 1, 0, 0]
12 1 3 1
After:  [2, 1, 0, 0]

Before: [1, 1, 2, 0]
3 0 2 1
After:  [1, 0, 2, 0]

Before: [1, 3, 3, 0]
5 3 2 0
After:  [1, 3, 3, 0]

Before: [3, 1, 2, 1]
6 3 2 1
After:  [3, 1, 2, 1]

Before: [1, 1, 2, 2]
3 0 2 2
After:  [1, 1, 0, 2]

Before: [3, 1, 0, 0]
8 0 2 1
After:  [3, 1, 0, 0]

Before: [1, 0, 2, 2]
11 2 3 0
After:  [2, 0, 2, 2]

Before: [0, 1, 3, 2]
7 0 0 3
After:  [0, 1, 3, 0]

Before: [0, 1, 1, 1]
2 2 1 1
After:  [0, 2, 1, 1]

Before: [0, 2, 0, 1]
0 0 2 3
After:  [0, 2, 0, 0]

Before: [0, 1, 2, 2]
15 1 3 3
After:  [0, 1, 2, 0]

Before: [0, 0, 3, 2]
0 0 3 2
After:  [0, 0, 0, 2]

Before: [1, 2, 0, 3]
14 0 2 2
After:  [1, 2, 0, 3]

Before: [2, 1, 2, 0]
12 1 3 2
After:  [2, 1, 1, 0]

Before: [0, 3, 0, 2]
5 2 3 1
After:  [0, 1, 0, 2]

Before: [2, 1, 1, 1]
14 1 3 0
After:  [1, 1, 1, 1]

Before: [0, 3, 3, 1]
0 0 3 3
After:  [0, 3, 3, 0]

Before: [2, 1, 2, 1]
14 1 3 1
After:  [2, 1, 2, 1]

Before: [0, 3, 3, 0]
7 0 0 0
After:  [0, 3, 3, 0]

Before: [0, 0, 0, 2]
7 0 0 3
After:  [0, 0, 0, 0]

Before: [1, 0, 2, 1]
3 0 2 1
After:  [1, 0, 2, 1]

Before: [2, 0, 2, 3]
4 2 0 1
After:  [2, 1, 2, 3]

Before: [2, 2, 1, 1]
9 2 3 1
After:  [2, 0, 1, 1]

Before: [2, 0, 1, 0]
13 0 3 2
After:  [2, 0, 1, 0]

Before: [1, 2, 2, 3]
10 2 3 0
After:  [0, 2, 2, 3]

Before: [0, 2, 3, 3]
0 0 3 2
After:  [0, 2, 0, 3]

Before: [3, 2, 2, 1]
6 3 2 2
After:  [3, 2, 1, 1]

Before: [0, 1, 2, 1]
1 1 2 3
After:  [0, 1, 2, 0]

Before: [1, 1, 1, 0]
2 2 1 1
After:  [1, 2, 1, 0]

Before: [1, 1, 1, 3]
2 2 1 0
After:  [2, 1, 1, 3]

Before: [2, 1, 3, 0]
13 0 3 0
After:  [1, 1, 3, 0]

Before: [1, 0, 0, 3]
14 0 2 0
After:  [0, 0, 0, 3]

Before: [2, 2, 0, 0]
13 0 3 1
After:  [2, 1, 0, 0]

Before: [1, 3, 2, 1]
3 0 2 2
After:  [1, 3, 0, 1]

Before: [2, 0, 1, 3]
8 0 1 0
After:  [1, 0, 1, 3]

Before: [0, 0, 2, 1]
6 3 2 1
After:  [0, 1, 2, 1]

Before: [1, 1, 2, 1]
8 3 1 1
After:  [1, 0, 2, 1]

Before: [1, 1, 3, 2]
15 1 3 0
After:  [0, 1, 3, 2]

Before: [3, 1, 1, 3]
10 2 3 2
After:  [3, 1, 0, 3]

Before: [3, 3, 2, 1]
6 3 2 2
After:  [3, 3, 1, 1]

Before: [0, 0, 1, 3]
10 2 3 0
After:  [0, 0, 1, 3]

Before: [3, 0, 3, 0]
5 3 2 0
After:  [1, 0, 3, 0]

Before: [3, 2, 0, 3]
10 1 3 3
After:  [3, 2, 0, 0]

Before: [3, 2, 0, 1]
9 3 3 1
After:  [3, 0, 0, 1]

Before: [2, 1, 3, 3]
10 1 3 0
After:  [0, 1, 3, 3]

Before: [0, 2, 1, 1]
0 0 3 2
After:  [0, 2, 0, 1]

Before: [0, 1, 0, 0]
7 0 0 2
After:  [0, 1, 0, 0]

Before: [3, 1, 2, 0]
1 1 2 3
After:  [3, 1, 2, 0]

Before: [0, 2, 2, 1]
6 3 2 0
After:  [1, 2, 2, 1]

Before: [3, 3, 3, 1]
4 2 3 3
After:  [3, 3, 3, 0]

Before: [1, 3, 2, 2]
11 2 3 1
After:  [1, 2, 2, 2]

Before: [2, 2, 1, 0]
13 0 3 2
After:  [2, 2, 1, 0]

Before: [3, 2, 2, 1]
6 3 2 3
After:  [3, 2, 2, 1]

Before: [1, 3, 2, 2]
11 2 3 3
After:  [1, 3, 2, 2]

Before: [1, 3, 3, 0]
5 3 2 3
After:  [1, 3, 3, 1]

Before: [2, 1, 2, 0]
12 1 3 0
After:  [1, 1, 2, 0]

Before: [0, 1, 1, 2]
2 2 1 0
After:  [2, 1, 1, 2]

Before: [3, 2, 0, 3]
8 0 2 0
After:  [1, 2, 0, 3]

Before: [1, 1, 1, 3]
2 2 1 3
After:  [1, 1, 1, 2]

Before: [1, 0, 2, 1]
6 3 2 2
After:  [1, 0, 1, 1]

Before: [0, 1, 2, 2]
0 0 3 0
After:  [0, 1, 2, 2]

Before: [3, 1, 1, 0]
2 2 1 2
After:  [3, 1, 2, 0]

Before: [2, 1, 2, 1]
1 1 2 1
After:  [2, 0, 2, 1]

Before: [0, 1, 1, 1]
2 2 1 3
After:  [0, 1, 1, 2]

Before: [1, 1, 2, 3]
1 1 2 2
After:  [1, 1, 0, 3]

Before: [2, 2, 2, 0]
4 2 1 3
After:  [2, 2, 2, 1]

Before: [3, 1, 0, 0]
12 1 3 2
After:  [3, 1, 1, 0]

Before: [3, 1, 3, 2]
15 1 3 3
After:  [3, 1, 3, 0]

Before: [3, 3, 0, 2]
5 2 3 3
After:  [3, 3, 0, 1]

Before: [0, 3, 2, 0]
0 0 3 0
After:  [0, 3, 2, 0]

Before: [1, 0, 2, 0]
3 0 2 2
After:  [1, 0, 0, 0]

Before: [2, 3, 2, 2]
8 3 2 0
After:  [0, 3, 2, 2]

Before: [1, 1, 3, 2]
15 1 3 2
After:  [1, 1, 0, 2]

Before: [1, 1, 2, 0]
3 0 2 2
After:  [1, 1, 0, 0]

Before: [0, 0, 2, 2]
7 0 0 1
After:  [0, 0, 2, 2]

Before: [1, 3, 0, 1]
14 0 2 2
After:  [1, 3, 0, 1]

Before: [0, 1, 2, 3]
1 1 2 0
After:  [0, 1, 2, 3]

Before: [3, 1, 0, 0]
12 1 3 0
After:  [1, 1, 0, 0]

Before: [1, 3, 2, 3]
10 2 3 0
After:  [0, 3, 2, 3]

Before: [1, 3, 2, 0]
3 0 2 1
After:  [1, 0, 2, 0]

Before: [3, 0, 2, 2]
11 2 3 1
After:  [3, 2, 2, 2]

Before: [3, 1, 2, 2]
15 1 3 3
After:  [3, 1, 2, 0]

Before: [1, 0, 2, 3]
3 0 2 1
After:  [1, 0, 2, 3]

Before: [0, 3, 2, 2]
11 2 3 3
After:  [0, 3, 2, 2]

Before: [2, 1, 2, 2]
11 2 3 1
After:  [2, 2, 2, 2]

Before: [3, 1, 1, 3]
2 2 1 1
After:  [3, 2, 1, 3]

Before: [0, 1, 0, 1]
14 1 3 0
After:  [1, 1, 0, 1]

Before: [1, 1, 2, 1]
14 1 3 2
After:  [1, 1, 1, 1]

Before: [1, 2, 2, 2]
3 0 2 3
After:  [1, 2, 2, 0]

Before: [2, 0, 2, 2]
11 2 3 2
After:  [2, 0, 2, 2]

Before: [0, 0, 3, 0]
5 3 2 1
After:  [0, 1, 3, 0]

Before: [0, 1, 1, 2]
15 1 3 0
After:  [0, 1, 1, 2]

Before: [0, 3, 1, 2]
0 0 1 0
After:  [0, 3, 1, 2]

Before: [0, 1, 3, 1]
0 0 2 1
After:  [0, 0, 3, 1]

Before: [3, 1, 1, 0]
12 1 3 3
After:  [3, 1, 1, 1]

Before: [0, 3, 2, 1]
6 3 2 1
After:  [0, 1, 2, 1]

Before: [0, 1, 0, 0]
12 1 3 0
After:  [1, 1, 0, 0]

Before: [2, 1, 2, 3]
1 1 2 3
After:  [2, 1, 2, 0]

Before: [3, 3, 0, 1]
9 3 3 0
After:  [0, 3, 0, 1]

Before: [0, 3, 2, 2]
8 3 2 1
After:  [0, 0, 2, 2]

Before: [0, 1, 2, 3]
10 1 3 0
After:  [0, 1, 2, 3]

Before: [2, 1, 1, 0]
2 2 1 2
After:  [2, 1, 2, 0]

Before: [3, 1, 1, 1]
8 3 1 0
After:  [0, 1, 1, 1]

Before: [1, 1, 0, 1]
9 3 3 3
After:  [1, 1, 0, 0]

Before: [2, 0, 2, 1]
6 3 2 1
After:  [2, 1, 2, 1]

Before: [3, 1, 0, 1]
8 3 1 0
After:  [0, 1, 0, 1]

Before: [0, 0, 0, 1]
7 0 0 0
After:  [0, 0, 0, 1]

Before: [3, 1, 1, 3]
4 3 0 1
After:  [3, 1, 1, 3]

Before: [2, 0, 0, 2]
9 3 3 1
After:  [2, 0, 0, 2]

Before: [2, 1, 3, 2]
15 1 3 0
After:  [0, 1, 3, 2]

Before: [2, 0, 1, 1]
9 3 3 2
After:  [2, 0, 0, 1]

Before: [3, 2, 2, 1]
4 2 1 0
After:  [1, 2, 2, 1]

Before: [3, 1, 3, 2]
15 1 3 2
After:  [3, 1, 0, 2]

Before: [0, 2, 3, 0]
0 0 2 2
After:  [0, 2, 0, 0]

Before: [0, 3, 3, 0]
0 0 3 2
After:  [0, 3, 0, 0]

Before: [3, 1, 3, 1]
9 3 3 2
After:  [3, 1, 0, 1]

Before: [0, 0, 2, 0]
0 0 3 3
After:  [0, 0, 2, 0]

Before: [2, 1, 2, 0]
4 2 0 2
After:  [2, 1, 1, 0]

Before: [2, 1, 1, 2]
15 1 3 0
After:  [0, 1, 1, 2]

Before: [1, 2, 2, 2]
11 2 3 1
After:  [1, 2, 2, 2]

Before: [1, 1, 2, 3]
3 0 2 2
After:  [1, 1, 0, 3]

Before: [0, 1, 1, 0]
12 1 3 3
After:  [0, 1, 1, 1]

Before: [0, 1, 2, 2]
15 1 3 2
After:  [0, 1, 0, 2]

Before: [1, 0, 2, 3]
3 0 2 2
After:  [1, 0, 0, 3]

Before: [3, 0, 2, 1]
6 3 2 2
After:  [3, 0, 1, 1]

Before: [3, 0, 0, 2]
5 2 3 2
After:  [3, 0, 1, 2]

Before: [0, 1, 1, 1]
7 0 0 1
After:  [0, 0, 1, 1]

Before: [0, 2, 2, 2]
4 2 1 1
After:  [0, 1, 2, 2]

Before: [1, 1, 0, 2]
14 0 2 1
After:  [1, 0, 0, 2]

Before: [0, 2, 1, 1]
0 0 3 0
After:  [0, 2, 1, 1]

Before: [0, 3, 3, 3]
0 0 3 3
After:  [0, 3, 3, 0]

Before: [0, 2, 2, 2]
0 0 2 1
After:  [0, 0, 2, 2]

Before: [1, 0, 0, 0]
14 0 2 2
After:  [1, 0, 0, 0]

Before: [1, 3, 2, 0]
3 0 2 2
After:  [1, 3, 0, 0]

Before: [2, 3, 1, 0]
13 0 3 0
After:  [1, 3, 1, 0]

Before: [2, 0, 2, 0]
4 2 0 1
After:  [2, 1, 2, 0]

Before: [3, 1, 2, 0]
12 1 3 0
After:  [1, 1, 2, 0]

Before: [2, 1, 3, 1]
14 1 3 0
After:  [1, 1, 3, 1]

Before: [1, 3, 3, 3]
4 3 2 0
After:  [1, 3, 3, 3]

Before: [0, 3, 1, 3]
10 2 3 3
After:  [0, 3, 1, 0]

Before: [0, 1, 3, 1]
7 0 0 2
After:  [0, 1, 0, 1]

Before: [3, 1, 2, 0]
12 1 3 2
After:  [3, 1, 1, 0]

Before: [1, 2, 3, 3]
10 1 3 0
After:  [0, 2, 3, 3]

Before: [2, 2, 3, 3]
8 2 0 3
After:  [2, 2, 3, 1]

Before: [0, 1, 2, 0]
1 1 2 3
After:  [0, 1, 2, 0]

Before: [1, 3, 2, 3]
3 0 2 1
After:  [1, 0, 2, 3]

Before: [0, 1, 1, 0]
2 2 1 3
After:  [0, 1, 1, 2]

Before: [0, 3, 0, 2]
7 0 0 1
After:  [0, 0, 0, 2]

Before: [2, 2, 2, 0]
13 0 3 3
After:  [2, 2, 2, 1]

Before: [2, 1, 2, 0]
1 1 2 1
After:  [2, 0, 2, 0]

Before: [2, 1, 0, 1]
14 1 3 1
After:  [2, 1, 0, 1]

Before: [0, 1, 2, 0]
12 1 3 1
After:  [0, 1, 2, 0]

Before: [1, 2, 1, 3]
10 1 3 3
After:  [1, 2, 1, 0]

Before: [2, 3, 2, 3]
10 2 3 2
After:  [2, 3, 0, 3]

Before: [1, 2, 2, 2]
3 0 2 2
After:  [1, 2, 0, 2]

Before: [0, 0, 3, 1]
0 0 2 3
After:  [0, 0, 3, 0]

Before: [3, 2, 1, 3]
10 2 3 1
After:  [3, 0, 1, 3]

Before: [1, 2, 2, 2]
3 0 2 1
After:  [1, 0, 2, 2]

Before: [0, 0, 3, 0]
5 3 2 0
After:  [1, 0, 3, 0]

Before: [3, 3, 2, 2]
11 2 3 1
After:  [3, 2, 2, 2]

Before: [1, 3, 3, 1]
4 2 3 3
After:  [1, 3, 3, 0]

Before: [0, 0, 3, 1]
7 0 0 2
After:  [0, 0, 0, 1]

Before: [2, 1, 1, 0]
12 1 3 0
After:  [1, 1, 1, 0]

Before: [0, 1, 1, 0]
7 0 0 1
After:  [0, 0, 1, 0]

Before: [0, 3, 1, 1]
0 0 1 2
After:  [0, 3, 0, 1]

Before: [0, 1, 2, 1]
0 0 1 0
After:  [0, 1, 2, 1]

Before: [2, 2, 2, 0]
13 0 3 2
After:  [2, 2, 1, 0]

Before: [0, 3, 2, 2]
7 0 0 2
After:  [0, 3, 0, 2]

Before: [1, 2, 2, 1]
4 2 1 0
After:  [1, 2, 2, 1]

Before: [1, 1, 3, 1]
14 1 3 2
After:  [1, 1, 1, 1]

Before: [1, 1, 3, 1]
14 1 3 1
After:  [1, 1, 3, 1]

Before: [2, 1, 3, 2]
15 1 3 2
After:  [2, 1, 0, 2]

Before: [2, 1, 1, 2]
2 2 1 1
After:  [2, 2, 1, 2]

Before: [1, 0, 2, 2]
11 2 3 1
After:  [1, 2, 2, 2]

Before: [1, 0, 2, 0]
3 0 2 0
After:  [0, 0, 2, 0]

Before: [0, 3, 1, 1]
0 0 2 0
After:  [0, 3, 1, 1]

Before: [1, 0, 2, 3]
3 0 2 0
After:  [0, 0, 2, 3]

Before: [3, 1, 3, 2]
15 1 3 1
After:  [3, 0, 3, 2]

Before: [3, 2, 0, 2]
5 2 3 3
After:  [3, 2, 0, 1]

Before: [2, 1, 1, 3]
2 2 1 0
After:  [2, 1, 1, 3]

Before: [2, 1, 2, 0]
1 1 2 3
After:  [2, 1, 2, 0]

Before: [0, 1, 0, 2]
5 2 3 1
After:  [0, 1, 0, 2]

Before: [2, 1, 3, 2]
15 1 3 1
After:  [2, 0, 3, 2]

Before: [1, 2, 2, 0]
3 0 2 1
After:  [1, 0, 2, 0]

Before: [0, 2, 2, 0]
7 0 0 3
After:  [0, 2, 2, 0]

Before: [3, 1, 1, 0]
2 2 1 3
After:  [3, 1, 1, 2]

Before: [2, 3, 1, 0]
13 0 3 1
After:  [2, 1, 1, 0]

Before: [0, 1, 2, 2]
0 0 1 1
After:  [0, 0, 2, 2]

Before: [2, 0, 2, 2]
11 2 3 3
After:  [2, 0, 2, 2]

Before: [0, 3, 0, 1]
9 3 3 3
After:  [0, 3, 0, 0]

Before: [0, 3, 1, 2]
0 0 3 0
After:  [0, 3, 1, 2]

Before: [3, 1, 1, 2]
2 2 1 3
After:  [3, 1, 1, 2]

Before: [2, 0, 2, 2]
11 2 3 1
After:  [2, 2, 2, 2]

Before: [2, 3, 2, 0]
13 0 3 0
After:  [1, 3, 2, 0]

Before: [1, 1, 0, 2]
5 2 3 1
After:  [1, 1, 0, 2]

Before: [1, 2, 2, 1]
3 0 2 0
After:  [0, 2, 2, 1]

Before: [3, 1, 2, 2]
11 2 3 1
After:  [3, 2, 2, 2]

Before: [0, 0, 0, 3]
7 0 0 2
After:  [0, 0, 0, 3]

Before: [2, 1, 0, 0]
13 0 3 1
After:  [2, 1, 0, 0]

Before: [1, 0, 0, 0]
14 0 2 0
After:  [0, 0, 0, 0]

Before: [3, 1, 2, 3]
1 1 2 2
After:  [3, 1, 0, 3]

Before: [0, 1, 1, 2]
0 0 2 1
After:  [0, 0, 1, 2]

Before: [2, 2, 2, 3]
4 2 0 3
After:  [2, 2, 2, 1]

Before: [1, 1, 2, 2]
3 0 2 0
After:  [0, 1, 2, 2]

Before: [3, 1, 2, 1]
14 1 3 2
After:  [3, 1, 1, 1]

Before: [0, 1, 1, 1]
2 2 1 2
After:  [0, 1, 2, 1]

Before: [0, 1, 2, 2]
11 2 3 3
After:  [0, 1, 2, 2]

Before: [1, 1, 2, 0]
1 1 2 2
After:  [1, 1, 0, 0]

Before: [1, 0, 2, 1]
3 0 2 0
After:  [0, 0, 2, 1]

Before: [2, 0, 1, 0]
13 0 3 0
After:  [1, 0, 1, 0]

Before: [2, 2, 2, 3]
10 2 3 0
After:  [0, 2, 2, 3]

Before: [0, 2, 0, 2]
7 0 0 0
After:  [0, 2, 0, 2]

Before: [1, 2, 2, 3]
3 0 2 2
After:  [1, 2, 0, 3]

Before: [2, 1, 2, 3]
1 1 2 0
After:  [0, 1, 2, 3]

Before: [2, 3, 3, 1]
8 2 0 3
After:  [2, 3, 3, 1]

Before: [0, 3, 2, 2]
11 2 3 1
After:  [0, 2, 2, 2]

Before: [1, 2, 0, 3]
14 0 2 3
After:  [1, 2, 0, 0]

Before: [0, 2, 2, 1]
6 3 2 2
After:  [0, 2, 1, 1]

Before: [1, 1, 1, 1]
9 3 3 0
After:  [0, 1, 1, 1]

Before: [1, 2, 2, 2]
3 0 2 0
After:  [0, 2, 2, 2]

Before: [0, 2, 3, 0]
7 0 0 3
After:  [0, 2, 3, 0]

Before: [1, 3, 2, 2]
3 0 2 2
After:  [1, 3, 0, 2]

Before: [3, 2, 1, 3]
10 1 3 2
After:  [3, 2, 0, 3]

Before: [1, 0, 2, 3]
3 0 2 3
After:  [1, 0, 2, 0]

Before: [3, 1, 2, 1]
6 3 2 3
After:  [3, 1, 2, 1]

Before: [2, 1, 0, 2]
5 2 3 3
After:  [2, 1, 0, 1]

Before: [1, 0, 1, 2]
9 3 3 1
After:  [1, 0, 1, 2]

Before: [3, 1, 1, 3]
2 2 1 3
After:  [3, 1, 1, 2]

Before: [2, 1, 2, 2]
15 1 3 1
After:  [2, 0, 2, 2]

Before: [1, 0, 1, 1]
9 3 3 1
After:  [1, 0, 1, 1]

Before: [1, 1, 2, 2]
8 3 2 1
After:  [1, 0, 2, 2]

Before: [0, 1, 0, 0]
12 1 3 3
After:  [0, 1, 0, 1]

Before: [2, 0, 0, 2]
8 0 1 3
After:  [2, 0, 0, 1]

Before: [1, 0, 2, 2]
3 0 2 3
After:  [1, 0, 2, 0]

Before: [0, 3, 2, 2]
7 0 0 0
After:  [0, 3, 2, 2]

Before: [3, 1, 0, 3]
10 1 3 1
After:  [3, 0, 0, 3]

Before: [2, 2, 0, 0]
13 0 3 3
After:  [2, 2, 0, 1]

Before: [0, 1, 1, 1]
2 2 1 0
After:  [2, 1, 1, 1]

Before: [1, 1, 2, 0]
1 1 2 1
After:  [1, 0, 2, 0]

Before: [0, 2, 1, 3]
0 0 2 1
After:  [0, 0, 1, 3]

Before: [0, 1, 2, 2]
11 2 3 1
After:  [0, 2, 2, 2]

Before: [0, 1, 1, 3]
2 2 1 2
After:  [0, 1, 2, 3]

Before: [0, 2, 3, 1]
4 2 3 2
After:  [0, 2, 0, 1]

Before: [2, 3, 3, 0]
5 3 2 3
After:  [2, 3, 3, 1]

Before: [3, 1, 2, 2]
1 1 2 1
After:  [3, 0, 2, 2]

Before: [2, 2, 2, 1]
6 3 2 0
After:  [1, 2, 2, 1]

Before: [0, 1, 1, 3]
2 2 1 0
After:  [2, 1, 1, 3]

Before: [3, 1, 3, 0]
5 3 2 2
After:  [3, 1, 1, 0]

Before: [3, 1, 2, 1]
6 3 2 2
After:  [3, 1, 1, 1]

Before: [1, 1, 0, 3]
14 0 2 3
After:  [1, 1, 0, 0]

Before: [2, 1, 1, 2]
15 1 3 1
After:  [2, 0, 1, 2]

Before: [3, 0, 3, 0]
5 3 2 1
After:  [3, 1, 3, 0]

Before: [2, 0, 2, 2]
8 0 1 3
After:  [2, 0, 2, 1]

Before: [0, 0, 2, 2]
11 2 3 1
After:  [0, 2, 2, 2]

Before: [1, 1, 2, 1]
3 0 2 0
After:  [0, 1, 2, 1]

Before: [3, 1, 2, 2]
1 1 2 0
After:  [0, 1, 2, 2]

Before: [1, 0, 2, 3]
10 2 3 0
After:  [0, 0, 2, 3]

Before: [3, 1, 1, 1]
2 2 1 1
After:  [3, 2, 1, 1]

Before: [3, 1, 0, 2]
15 1 3 0
After:  [0, 1, 0, 2]

Before: [1, 3, 1, 1]
9 2 3 0
After:  [0, 3, 1, 1]

Before: [3, 1, 2, 2]
11 2 3 3
After:  [3, 1, 2, 2]

Before: [0, 3, 0, 1]
7 0 0 2
After:  [0, 3, 0, 1]

Before: [1, 2, 0, 2]
14 0 2 2
After:  [1, 2, 0, 2]

Before: [1, 3, 2, 1]
6 3 2 2
After:  [1, 3, 1, 1]

Before: [2, 3, 3, 3]
8 2 0 1
After:  [2, 1, 3, 3]

Before: [1, 2, 2, 3]
3 0 2 3
After:  [1, 2, 2, 0]

Before: [0, 1, 3, 0]
12 1 3 0
After:  [1, 1, 3, 0]

Before: [3, 1, 0, 2]
5 2 3 3
After:  [3, 1, 0, 1]

Before: [0, 2, 2, 0]
4 2 1 1
After:  [0, 1, 2, 0]

Before: [2, 2, 1, 0]
13 0 3 3
After:  [2, 2, 1, 1]

Before: [0, 1, 0, 1]
9 3 3 2
After:  [0, 1, 0, 1]

Before: [0, 1, 2, 1]
6 3 2 3
After:  [0, 1, 2, 1]

Before: [1, 3, 2, 0]
3 0 2 0
After:  [0, 3, 2, 0]

Before: [0, 1, 0, 2]
15 1 3 3
After:  [0, 1, 0, 0]

Before: [0, 3, 3, 1]
7 0 0 3
After:  [0, 3, 3, 0]

Before: [0, 1, 2, 1]
7 0 0 2
After:  [0, 1, 0, 1]

Before: [1, 2, 0, 3]
14 0 2 1
After:  [1, 0, 0, 3]

Before: [2, 1, 1, 2]
2 2 1 2
After:  [2, 1, 2, 2]

Before: [1, 0, 2, 2]
11 2 3 3
After:  [1, 0, 2, 2]

Before: [3, 1, 1, 2]
2 2 1 1
After:  [3, 2, 1, 2]

Before: [2, 1, 1, 1]
2 2 1 0
After:  [2, 1, 1, 1]

Before: [0, 0, 3, 0]
0 0 2 1
After:  [0, 0, 3, 0]

Before: [3, 1, 2, 1]
1 1 2 2
After:  [3, 1, 0, 1]

Before: [2, 2, 2, 1]
6 3 2 3
After:  [2, 2, 2, 1]

Before: [0, 1, 3, 1]
4 2 3 0
After:  [0, 1, 3, 1]

Before: [2, 2, 3, 3]
8 2 0 1
After:  [2, 1, 3, 3]

Before: [0, 3, 0, 2]
7 0 0 0
After:  [0, 3, 0, 2]

Before: [1, 1, 3, 0]
5 3 2 1
After:  [1, 1, 3, 0]

Before: [3, 1, 1, 3]
10 2 3 1
After:  [3, 0, 1, 3]

Before: [0, 1, 2, 1]
1 1 2 2
After:  [0, 1, 0, 1]

Before: [3, 2, 3, 3]
4 3 0 2
After:  [3, 2, 1, 3]

Before: [1, 2, 2, 2]
11 2 3 3
After:  [1, 2, 2, 2]

Before: [1, 1, 2, 2]
11 2 3 1
After:  [1, 2, 2, 2]

Before: [1, 1, 1, 2]
15 1 3 3
After:  [1, 1, 1, 0]

Before: [0, 1, 3, 0]
5 3 2 3
After:  [0, 1, 3, 1]

Before: [2, 1, 3, 1]
4 2 3 1
After:  [2, 0, 3, 1]

Before: [3, 0, 2, 2]
11 2 3 3
After:  [3, 0, 2, 2]

Before: [0, 3, 0, 3]
7 0 0 3
After:  [0, 3, 0, 0]

Before: [0, 0, 2, 3]
7 0 0 3
After:  [0, 0, 2, 0]

Before: [0, 1, 3, 2]
9 3 3 3
After:  [0, 1, 3, 0]

Before: [2, 1, 1, 3]
2 2 1 2
After:  [2, 1, 2, 3]

Before: [2, 1, 2, 2]
4 2 0 1
After:  [2, 1, 2, 2]

Before: [3, 1, 3, 0]
5 3 2 0
After:  [1, 1, 3, 0]

Before: [1, 0, 0, 2]
5 2 3 2
After:  [1, 0, 1, 2]

Before: [2, 0, 3, 0]
13 0 3 0
After:  [1, 0, 3, 0]

Before: [2, 1, 1, 1]
8 3 1 2
After:  [2, 1, 0, 1]

Before: [0, 1, 1, 2]
15 1 3 2
After:  [0, 1, 0, 2]

Before: [1, 3, 0, 3]
14 0 2 3
After:  [1, 3, 0, 0]

Before: [0, 1, 2, 3]
0 0 1 1
After:  [0, 0, 2, 3]

Before: [2, 1, 2, 2]
1 1 2 1
After:  [2, 0, 2, 2]

Before: [2, 2, 3, 0]
8 2 0 3
After:  [2, 2, 3, 1]

Before: [1, 1, 2, 2]
1 1 2 1
After:  [1, 0, 2, 2]

Before: [0, 1, 3, 2]
15 1 3 2
After:  [0, 1, 0, 2]

Before: [3, 1, 0, 2]
15 1 3 3
After:  [3, 1, 0, 0]

Before: [1, 0, 1, 3]
10 2 3 1
After:  [1, 0, 1, 3]

Before: [3, 2, 0, 0]
8 0 2 0
After:  [1, 2, 0, 0]

Before: [1, 0, 3, 0]
5 3 2 0
After:  [1, 0, 3, 0]

Before: [0, 0, 0, 3]
7 0 0 0
After:  [0, 0, 0, 3]

Before: [1, 3, 3, 1]
4 2 3 0
After:  [0, 3, 3, 1]

Before: [2, 1, 0, 1]
8 3 1 2
After:  [2, 1, 0, 1]

Before: [2, 0, 2, 2]
9 3 3 1
After:  [2, 0, 2, 2]

Before: [2, 1, 2, 0]
13 0 3 3
After:  [2, 1, 2, 1]

Before: [1, 1, 0, 2]
15 1 3 2
After:  [1, 1, 0, 2]

Before: [3, 1, 2, 2]
11 2 3 0
After:  [2, 1, 2, 2]

Before: [2, 0, 0, 0]
13 0 3 3
After:  [2, 0, 0, 1]

Before: [3, 2, 3, 1]
9 3 3 3
After:  [3, 2, 3, 0]

Before: [1, 0, 2, 2]
11 2 3 2
After:  [1, 0, 2, 2]

Before: [3, 1, 1, 0]
8 2 1 0
After:  [0, 1, 1, 0]

Before: [0, 3, 3, 1]
9 3 3 2
After:  [0, 3, 0, 1]

Before: [2, 0, 1, 0]
13 0 3 1
After:  [2, 1, 1, 0]

Before: [2, 2, 0, 0]
13 0 3 0
After:  [1, 2, 0, 0]

Before: [1, 3, 2, 2]
3 0 2 1
After:  [1, 0, 2, 2]

Before: [3, 2, 0, 3]
10 1 3 2
After:  [3, 2, 0, 3]

Before: [3, 1, 2, 2]
15 1 3 0
After:  [0, 1, 2, 2]

Before: [3, 1, 1, 3]
8 2 1 0
After:  [0, 1, 1, 3]

Before: [0, 2, 3, 0]
5 3 2 3
After:  [0, 2, 3, 1]

Before: [0, 3, 3, 3]
4 3 2 3
After:  [0, 3, 3, 1]

Before: [1, 3, 3, 1]
9 3 3 3
After:  [1, 3, 3, 0]

Before: [0, 3, 2, 2]
11 2 3 2
After:  [0, 3, 2, 2]

Before: [1, 2, 2, 2]
11 2 3 0
After:  [2, 2, 2, 2]

Before: [2, 1, 2, 1]
8 3 1 3
After:  [2, 1, 2, 0]

Before: [0, 0, 2, 2]
11 2 3 3
After:  [0, 0, 2, 2]

Before: [0, 1, 0, 2]
15 1 3 2
After:  [0, 1, 0, 2]

Before: [0, 3, 2, 3]
0 0 2 2
After:  [0, 3, 0, 3]

Before: [0, 1, 3, 3]
0 0 1 2
After:  [0, 1, 0, 3]

Before: [2, 2, 1, 0]
13 0 3 0
After:  [1, 2, 1, 0]

Before: [3, 1, 1, 2]
15 1 3 0
After:  [0, 1, 1, 2]

Before: [2, 3, 2, 1]
6 3 2 3
After:  [2, 3, 2, 1]

Before: [1, 0, 0, 3]
14 0 2 3
After:  [1, 0, 0, 0]

Before: [1, 2, 0, 2]
5 2 3 0
After:  [1, 2, 0, 2]

Before: [3, 0, 2, 3]
4 3 0 2
After:  [3, 0, 1, 3]

Before: [1, 3, 2, 0]
3 0 2 3
After:  [1, 3, 2, 0]

Before: [3, 1, 2, 0]
1 1 2 0
After:  [0, 1, 2, 0]

Before: [3, 1, 2, 0]
12 1 3 3
After:  [3, 1, 2, 1]

Before: [1, 3, 2, 1]
6 3 2 1
After:  [1, 1, 2, 1]

Before: [0, 0, 2, 3]
10 2 3 1
After:  [0, 0, 2, 3]

Before: [1, 2, 0, 0]
14 0 2 0
After:  [0, 2, 0, 0]

Before: [2, 0, 1, 0]
13 0 3 3
After:  [2, 0, 1, 1]

Before: [0, 2, 2, 2]
11 2 3 2
After:  [0, 2, 2, 2]

Before: [2, 0, 2, 1]
6 3 2 0
After:  [1, 0, 2, 1]

Before: [1, 1, 2, 2]
11 2 3 3
After:  [1, 1, 2, 2]

Before: [0, 3, 0, 2]
0 0 1 3
After:  [0, 3, 0, 0]

Before: [0, 0, 2, 2]
7 0 0 0
After:  [0, 0, 2, 2]

Before: [1, 0, 2, 1]
6 3 2 3
After:  [1, 0, 2, 1]

Before: [2, 3, 2, 3]
4 2 0 0
After:  [1, 3, 2, 3]

Before: [1, 1, 2, 2]
15 1 3 3
After:  [1, 1, 2, 0]

Before: [2, 0, 1, 3]
10 2 3 3
After:  [2, 0, 1, 0]

Before: [0, 2, 2, 1]
0 0 2 3
After:  [0, 2, 2, 0]

Before: [2, 3, 3, 3]
4 3 2 3
After:  [2, 3, 3, 1]

Before: [1, 2, 2, 3]
10 2 3 1
After:  [1, 0, 2, 3]

Before: [0, 2, 3, 0]
7 0 0 0
After:  [0, 2, 3, 0]

Before: [1, 0, 0, 3]
14 0 2 2
After:  [1, 0, 0, 3]

Before: [3, 3, 2, 2]
8 3 2 2
After:  [3, 3, 0, 2]

Before: [0, 2, 2, 2]
11 2 3 3
After:  [0, 2, 2, 2]

Before: [3, 1, 3, 0]
12 1 3 0
After:  [1, 1, 3, 0]

Before: [3, 3, 0, 3]
8 0 2 3
After:  [3, 3, 0, 1]

Before: [2, 1, 0, 0]
13 0 3 2
After:  [2, 1, 1, 0]

Before: [2, 1, 1, 2]
2 2 1 3
After:  [2, 1, 1, 2]

Before: [2, 1, 3, 1]
8 3 1 1
After:  [2, 0, 3, 1]

Before: [0, 3, 1, 3]
0 0 1 2
After:  [0, 3, 0, 3]

Before: [2, 0, 3, 0]
13 0 3 3
After:  [2, 0, 3, 1]

Before: [3, 3, 0, 2]
5 2 3 2
After:  [3, 3, 1, 2]

Before: [1, 0, 2, 0]
3 0 2 3
After:  [1, 0, 2, 0]

Before: [1, 1, 2, 1]
6 3 2 3
After:  [1, 1, 2, 1]

Before: [2, 1, 2, 1]
6 3 2 1
After:  [2, 1, 2, 1]

Before: [3, 1, 1, 1]
8 2 1 0
After:  [0, 1, 1, 1]

Before: [1, 0, 2, 2]
3 0 2 0
After:  [0, 0, 2, 2]

Before: [3, 1, 2, 3]
1 1 2 0
After:  [0, 1, 2, 3]

Before: [1, 1, 2, 1]
6 3 2 1
After:  [1, 1, 2, 1]

Before: [0, 2, 1, 3]
10 1 3 2
After:  [0, 2, 0, 3]

Before: [2, 1, 2, 2]
1 1 2 3
After:  [2, 1, 2, 0]

Before: [0, 0, 0, 0]
7 0 0 3
After:  [0, 0, 0, 0]

Before: [2, 3, 0, 0]
13 0 3 3
After:  [2, 3, 0, 1]

Before: [0, 0, 2, 3]
10 2 3 0
After:  [0, 0, 2, 3]

Before: [0, 3, 2, 3]
0 0 2 1
After:  [0, 0, 2, 3]

Before: [0, 2, 3, 3]
7 0 0 0
After:  [0, 2, 3, 3]

Before: [1, 0, 1, 3]
10 2 3 3
After:  [1, 0, 1, 0]

Before: [0, 1, 1, 0]
12 1 3 1
After:  [0, 1, 1, 0]

Before: [1, 1, 1, 1]
9 2 3 3
After:  [1, 1, 1, 0]

Before: [1, 2, 0, 1]
14 0 2 3
After:  [1, 2, 0, 0]

Before: [0, 1, 2, 2]
8 3 2 3
After:  [0, 1, 2, 0]

Before: [1, 1, 1, 2]
15 1 3 2
After:  [1, 1, 0, 2]

Before: [0, 2, 2, 2]
0 0 3 3
After:  [0, 2, 2, 0]

Before: [0, 1, 1, 1]
14 1 3 0
After:  [1, 1, 1, 1]

Before: [1, 3, 0, 2]
5 2 3 2
After:  [1, 3, 1, 2]

Before: [0, 3, 0, 1]
7 0 0 3
After:  [0, 3, 0, 0]

Before: [2, 1, 0, 1]
14 1 3 0
After:  [1, 1, 0, 1]

Before: [1, 0, 2, 0]
3 0 2 1
After:  [1, 0, 2, 0]

Before: [2, 0, 0, 2]
5 2 3 2
After:  [2, 0, 1, 2]

Before: [3, 1, 1, 2]
9 3 3 3
After:  [3, 1, 1, 0]

Before: [2, 1, 2, 2]
11 2 3 0
After:  [2, 1, 2, 2]

Before: [0, 3, 0, 3]
0 0 2 3
After:  [0, 3, 0, 0]

Before: [1, 1, 2, 1]
3 0 2 2
After:  [1, 1, 0, 1]

Before: [0, 1, 1, 0]
12 1 3 0
After:  [1, 1, 1, 0]

Before: [3, 1, 1, 1]
8 3 1 2
After:  [3, 1, 0, 1]

Before: [2, 0, 2, 0]
13 0 3 1
After:  [2, 1, 2, 0]

Before: [3, 0, 3, 2]
9 3 3 1
After:  [3, 0, 3, 2]

Before: [1, 0, 0, 0]
14 0 2 3
After:  [1, 0, 0, 0]

Before: [3, 1, 3, 1]
4 2 3 3
After:  [3, 1, 3, 0]

Before: [1, 1, 1, 0]
2 2 1 0
After:  [2, 1, 1, 0]

Before: [2, 1, 1, 0]
12 1 3 1
After:  [2, 1, 1, 0]

Before: [2, 2, 2, 3]
4 2 0 2
After:  [2, 2, 1, 3]

Before: [1, 1, 1, 1]
2 2 1 3
After:  [1, 1, 1, 2]

Before: [2, 1, 2, 1]
1 1 2 0
After:  [0, 1, 2, 1]

Before: [0, 1, 2, 3]
1 1 2 3
After:  [0, 1, 2, 0]

Before: [3, 1, 1, 3]
4 3 0 0
After:  [1, 1, 1, 3]

Before: [3, 0, 2, 1]
9 3 3 2
After:  [3, 0, 0, 1]

Before: [3, 1, 0, 2]
8 0 2 0
After:  [1, 1, 0, 2]

Before: [0, 2, 2, 1]
7 0 0 0
After:  [0, 2, 2, 1]

Before: [0, 1, 3, 1]
14 1 3 0
After:  [1, 1, 3, 1]

Before: [0, 1, 2, 2]
1 1 2 3
After:  [0, 1, 2, 0]

Before: [2, 1, 0, 1]
8 3 1 1
After:  [2, 0, 0, 1]

Before: [2, 3, 3, 0]
13 0 3 1
After:  [2, 1, 3, 0]

Before: [3, 1, 2, 0]
12 1 3 1
After:  [3, 1, 2, 0]

Before: [0, 3, 2, 1]
7 0 0 1
After:  [0, 0, 2, 1]

Before: [2, 3, 2, 2]
11 2 3 0
After:  [2, 3, 2, 2]

Before: [0, 1, 1, 3]
2 2 1 1
After:  [0, 2, 1, 3]

Before: [0, 2, 2, 3]
10 2 3 1
After:  [0, 0, 2, 3]

Before: [2, 3, 3, 1]
9 3 3 3
After:  [2, 3, 3, 0]

Before: [2, 1, 0, 2]
15 1 3 0
After:  [0, 1, 0, 2]

Before: [0, 0, 2, 1]
6 3 2 3
After:  [0, 0, 2, 1]

Before: [2, 1, 0, 2]
15 1 3 2
After:  [2, 1, 0, 2]

Before: [1, 1, 1, 3]
2 2 1 1
After:  [1, 2, 1, 3]

Before: [0, 0, 1, 0]
7 0 0 2
After:  [0, 0, 0, 0]

Before: [3, 1, 3, 2]
15 1 3 0
After:  [0, 1, 3, 2]

Before: [1, 1, 3, 0]
12 1 3 0
After:  [1, 1, 3, 0]

Before: [0, 1, 3, 3]
7 0 0 1
After:  [0, 0, 3, 3]

Before: [1, 1, 3, 3]
10 1 3 1
After:  [1, 0, 3, 3]

Before: [0, 2, 3, 3]
10 1 3 3
After:  [0, 2, 3, 0]

Before: [1, 1, 1, 1]
8 2 1 3
After:  [1, 1, 1, 0]

Before: [1, 1, 1, 0]
2 2 1 3
After:  [1, 1, 1, 2]

Before: [2, 3, 3, 0]
13 0 3 3
After:  [2, 3, 3, 1]

Before: [3, 1, 0, 0]
12 1 3 3
After:  [3, 1, 0, 1]

Before: [1, 3, 0, 2]
5 2 3 1
After:  [1, 1, 0, 2]

Before: [2, 2, 3, 3]
10 1 3 3
After:  [2, 2, 3, 0]

Before: [2, 1, 2, 1]
6 3 2 0
After:  [1, 1, 2, 1]

Before: [0, 1, 3, 0]
12 1 3 1
After:  [0, 1, 3, 0]

Before: [3, 2, 2, 3]
10 2 3 2
After:  [3, 2, 0, 3]

Before: [0, 3, 1, 3]
10 2 3 1
After:  [0, 0, 1, 3]

Before: [3, 0, 0, 1]
9 3 3 0
After:  [0, 0, 0, 1]

Before: [2, 1, 0, 0]
13 0 3 0
After:  [1, 1, 0, 0]

Before: [3, 0, 2, 2]
11 2 3 0
After:  [2, 0, 2, 2]

Before: [3, 0, 0, 3]
8 0 2 2
After:  [3, 0, 1, 3]

Before: [0, 0, 0, 2]
7 0 0 0
After:  [0, 0, 0, 2]

Before: [0, 0, 2, 1]
6 3 2 0
After:  [1, 0, 2, 1]

Before: [1, 1, 1, 2]
2 2 1 3
After:  [1, 1, 1, 2]

Before: [2, 3, 3, 1]
4 2 3 3
After:  [2, 3, 3, 0]

Before: [0, 1, 1, 2]
15 1 3 1
After:  [0, 0, 1, 2]

Before: [0, 3, 3, 0]
0 0 2 0
After:  [0, 3, 3, 0]

Before: [2, 2, 3, 3]
4 3 2 1
After:  [2, 1, 3, 3]

Before: [1, 2, 2, 0]
3 0 2 0
After:  [0, 2, 2, 0]

Before: [1, 0, 2, 1]
3 0 2 2
After:  [1, 0, 0, 1]

Before: [0, 1, 3, 0]
5 3 2 1
After:  [0, 1, 3, 0]

Before: [0, 2, 2, 3]
10 2 3 0
After:  [0, 2, 2, 3]

Before: [2, 3, 1, 1]
9 2 3 2
After:  [2, 3, 0, 1]

Before: [3, 2, 0, 3]
10 1 3 0
After:  [0, 2, 0, 3]

Before: [0, 0, 1, 3]
7 0 0 1
After:  [0, 0, 1, 3]

Before: [3, 1, 2, 1]
6 3 2 0
After:  [1, 1, 2, 1]

Before: [1, 0, 3, 1]
4 2 3 3
After:  [1, 0, 3, 0]

Before: [0, 1, 2, 0]
1 1 2 1
After:  [0, 0, 2, 0]

Before: [2, 3, 2, 1]
6 3 2 1
After:  [2, 1, 2, 1]

Before: [3, 1, 1, 1]
2 2 1 2
After:  [3, 1, 2, 1]

Before: [3, 1, 2, 3]
1 1 2 3
After:  [3, 1, 2, 0]

Before: [3, 0, 2, 3]
4 3 0 1
After:  [3, 1, 2, 3]

Before: [1, 2, 2, 1]
3 0 2 1
After:  [1, 0, 2, 1]

Before: [1, 2, 2, 1]
6 3 2 2
After:  [1, 2, 1, 1]

Before: [0, 1, 2, 0]
1 1 2 2
After:  [0, 1, 0, 0]

Before: [3, 1, 1, 1]
9 3 3 2
After:  [3, 1, 0, 1]

Before: [1, 2, 0, 2]
14 0 2 3
After:  [1, 2, 0, 0]

Before: [2, 3, 2, 2]
11 2 3 2
After:  [2, 3, 2, 2]

Before: [1, 0, 0, 2]
14 0 2 3
After:  [1, 0, 0, 0]

Before: [3, 3, 1, 2]
9 3 3 0
After:  [0, 3, 1, 2]

Before: [2, 2, 2, 2]
4 2 1 2
After:  [2, 2, 1, 2]

Before: [1, 1, 2, 1]
3 0 2 3
After:  [1, 1, 2, 0]

Before: [2, 3, 3, 1]
9 3 3 2
After:  [2, 3, 0, 1]

Before: [2, 1, 2, 0]
13 0 3 0
After:  [1, 1, 2, 0]

Before: [0, 1, 3, 3]
10 1 3 3
After:  [0, 1, 3, 0]

Before: [2, 2, 2, 2]
11 2 3 1
After:  [2, 2, 2, 2]

Before: [3, 2, 0, 0]
8 0 2 3
After:  [3, 2, 0, 1]

Before: [2, 3, 3, 0]
5 3 2 2
After:  [2, 3, 1, 0]

Before: [2, 0, 2, 0]
13 0 3 0
After:  [1, 0, 2, 0]

Before: [0, 1, 0, 2]
7 0 0 0
After:  [0, 1, 0, 2]

Before: [0, 3, 0, 1]
9 3 3 0
After:  [0, 3, 0, 1]

Before: [0, 3, 2, 1]
6 3 2 0
After:  [1, 3, 2, 1]

Before: [0, 1, 0, 3]
7 0 0 1
After:  [0, 0, 0, 3]

Before: [1, 2, 0, 2]
14 0 2 1
After:  [1, 0, 0, 2]

Before: [3, 0, 1, 1]
9 3 3 2
After:  [3, 0, 0, 1]

Before: [1, 3, 2, 3]
3 0 2 3
After:  [1, 3, 2, 0]

Before: [1, 2, 3, 0]
5 3 2 1
After:  [1, 1, 3, 0]

Before: [3, 1, 0, 2]
15 1 3 1
After:  [3, 0, 0, 2]

Before: [0, 1, 2, 2]
1 1 2 0
After:  [0, 1, 2, 2]

Before: [3, 1, 1, 3]
10 2 3 3
After:  [3, 1, 1, 0]

Before: [2, 2, 3, 0]
5 3 2 3
After:  [2, 2, 3, 1]

Before: [1, 1, 2, 0]
3 0 2 0
After:  [0, 1, 2, 0]

Before: [0, 1, 1, 2]
2 2 1 3
After:  [0, 1, 1, 2]

Before: [3, 1, 2, 2]
15 1 3 2
After:  [3, 1, 0, 2]

Before: [0, 1, 0, 1]
7 0 0 1
After:  [0, 0, 0, 1]

Before: [1, 1, 1, 2]
2 2 1 0
After:  [2, 1, 1, 2]

Before: [3, 3, 0, 2]
5 2 3 0
After:  [1, 3, 0, 2]

Before: [1, 1, 2, 2]
8 3 2 0
After:  [0, 1, 2, 2]

Before: [0, 1, 2, 2]
15 1 3 0
After:  [0, 1, 2, 2]

Before: [0, 3, 2, 0]
0 0 2 2
After:  [0, 3, 0, 0]

Before: [1, 1, 2, 1]
6 3 2 2
After:  [1, 1, 1, 1]

Before: [1, 1, 1, 2]
2 2 1 1
After:  [1, 2, 1, 2]

Before: [2, 3, 2, 1]
6 3 2 2
After:  [2, 3, 1, 1]

Before: [0, 1, 1, 0]
2 2 1 2
After:  [0, 1, 2, 0]

Before: [0, 3, 2, 3]
7 0 0 2
After:  [0, 3, 0, 3]

Before: [0, 2, 2, 2]
11 2 3 1
After:  [0, 2, 2, 2]

Before: [0, 1, 3, 0]
5 3 2 2
After:  [0, 1, 1, 0]

Before: [1, 3, 0, 1]
14 0 2 0
After:  [0, 3, 0, 1]

Before: [2, 3, 2, 0]
13 0 3 3
After:  [2, 3, 2, 1]

Before: [3, 3, 3, 0]
5 3 2 1
After:  [3, 1, 3, 0]

Before: [3, 2, 2, 2]
11 2 3 0
After:  [2, 2, 2, 2]

Before: [3, 3, 2, 2]
11 2 3 2
After:  [3, 3, 2, 2]

Before: [1, 2, 3, 0]
5 3 2 3
After:  [1, 2, 3, 1]

Before: [0, 0, 2, 2]
11 2 3 2
After:  [0, 0, 2, 2]

Before: [3, 1, 1, 2]
15 1 3 3
After:  [3, 1, 1, 0]

Before: [1, 2, 2, 0]
3 0 2 3
After:  [1, 2, 2, 0]

Before: [3, 3, 2, 3]
10 2 3 3
After:  [3, 3, 2, 0]

Before: [0, 0, 3, 0]
5 3 2 3
After:  [0, 0, 3, 1]

Before: [1, 1, 2, 0]
3 0 2 3
After:  [1, 1, 2, 0]

Before: [3, 1, 2, 3]
1 1 2 1
After:  [3, 0, 2, 3]

Before: [3, 1, 2, 0]
1 1 2 2
After:  [3, 1, 0, 0]

Before: [2, 0, 2, 1]
6 3 2 3
After:  [2, 0, 2, 1]

Before: [0, 2, 2, 1]
0 0 2 0
After:  [0, 2, 2, 1]

Before: [2, 0, 2, 2]
11 2 3 0
After:  [2, 0, 2, 2]

Before: [1, 1, 0, 0]
14 0 2 0
After:  [0, 1, 0, 0]

Before: [0, 0, 1, 3]
0 0 2 2
After:  [0, 0, 0, 3]

Before: [0, 1, 3, 2]
15 1 3 3
After:  [0, 1, 3, 0]

Before: [1, 0, 2, 1]
3 0 2 3
After:  [1, 0, 2, 0]

Before: [0, 0, 0, 2]
5 2 3 1
After:  [0, 1, 0, 2]

Before: [2, 1, 3, 0]
12 1 3 2
After:  [2, 1, 1, 0]

Before: [0, 1, 2, 2]
11 2 3 0
After:  [2, 1, 2, 2]

Before: [3, 0, 2, 3]
10 2 3 2
After:  [3, 0, 0, 3]

Before: [2, 0, 1, 3]
10 2 3 2
After:  [2, 0, 0, 3]

Before: [0, 2, 1, 3]
7 0 0 3
After:  [0, 2, 1, 0]

Before: [2, 1, 3, 0]
12 1 3 3
After:  [2, 1, 3, 1]

Before: [3, 2, 2, 2]
11 2 3 2
After:  [3, 2, 2, 2]

Before: [1, 1, 0, 2]
5 2 3 0
After:  [1, 1, 0, 2]

Before: [0, 3, 1, 2]
7 0 0 3
After:  [0, 3, 1, 0]

Before: [0, 0, 3, 2]
0 0 1 1
After:  [0, 0, 3, 2]

Before: [2, 1, 2, 2]
11 2 3 3
After:  [2, 1, 2, 2]

Before: [2, 0, 0, 0]
13 0 3 1
After:  [2, 1, 0, 0]

Before: [1, 3, 2, 3]
3 0 2 0
After:  [0, 3, 2, 3]

Before: [3, 1, 1, 0]
12 1 3 1
After:  [3, 1, 1, 0]

Before: [1, 1, 3, 0]
12 1 3 3
After:  [1, 1, 3, 1]

Before: [1, 3, 2, 1]
3 0 2 1
After:  [1, 0, 2, 1]

Before: [2, 1, 1, 3]
2 2 1 3
After:  [2, 1, 1, 2]

Before: [3, 1, 1, 2]
8 2 1 3
After:  [3, 1, 1, 0]

Before: [1, 2, 0, 2]
14 0 2 0
After:  [0, 2, 0, 2]

Before: [2, 1, 1, 0]
12 1 3 2
After:  [2, 1, 1, 0]

Before: [3, 3, 0, 2]
8 0 2 3
After:  [3, 3, 0, 1]

Before: [1, 1, 3, 3]
10 1 3 0
After:  [0, 1, 3, 3]

Before: [2, 1, 3, 2]
15 1 3 3
After:  [2, 1, 3, 0]

Before: [3, 1, 1, 0]
12 1 3 0
After:  [1, 1, 1, 0]

Before: [0, 1, 2, 1]
0 0 3 2
After:  [0, 1, 0, 1]

Before: [1, 1, 1, 0]
2 2 1 2
After:  [1, 1, 2, 0]

Before: [0, 2, 1, 3]
10 1 3 3
After:  [0, 2, 1, 0]

Before: [2, 1, 3, 0]
12 1 3 1
After:  [2, 1, 3, 0]

Before: [2, 2, 3, 0]
5 3 2 2
After:  [2, 2, 1, 0]

Before: [2, 0, 2, 1]
6 3 2 2
After:  [2, 0, 1, 1]

Before: [2, 0, 2, 3]
10 2 3 2
After:  [2, 0, 0, 3]

Before: [2, 2, 1, 2]
9 3 3 3
After:  [2, 2, 1, 0]

Before: [2, 2, 3, 2]
9 3 3 1
After:  [2, 0, 3, 2]

Before: [3, 3, 2, 1]
6 3 2 0
After:  [1, 3, 2, 1]

Before: [2, 3, 2, 2]
11 2 3 3
After:  [2, 3, 2, 2]

Before: [0, 1, 3, 0]
12 1 3 2
After:  [0, 1, 1, 0]

Before: [3, 2, 2, 2]
8 3 2 1
After:  [3, 0, 2, 2]

Before: [1, 1, 2, 2]
11 2 3 2
After:  [1, 1, 2, 2]

Before: [2, 1, 2, 1]
14 1 3 0
After:  [1, 1, 2, 1]

Before: [1, 1, 2, 3]
1 1 2 3
After:  [1, 1, 2, 0]

Before: [0, 2, 0, 1]
7 0 0 3
After:  [0, 2, 0, 0]

Before: [1, 0, 2, 2]
3 0 2 2
After:  [1, 0, 0, 2]

Before: [2, 1, 3, 0]
5 3 2 1
After:  [2, 1, 3, 0]

Before: [2, 3, 2, 3]
10 2 3 0
After:  [0, 3, 2, 3]

Before: [1, 1, 3, 0]
5 3 2 0
After:  [1, 1, 3, 0]

Before: [2, 1, 1, 0]
13 0 3 1
After:  [2, 1, 1, 0]

Before: [2, 1, 2, 0]
12 1 3 1
After:  [2, 1, 2, 0]

Before: [0, 3, 2, 2]
11 2 3 0
After:  [2, 3, 2, 2]

Before: [3, 2, 1, 2]
9 3 3 3
After:  [3, 2, 1, 0]

Before: [2, 3, 2, 0]
13 0 3 2
After:  [2, 3, 1, 0]

Before: [3, 1, 3, 3]
10 1 3 0
After:  [0, 1, 3, 3]

Before: [3, 0, 2, 1]
6 3 2 1
After:  [3, 1, 2, 1]

Before: [2, 2, 3, 0]
13 0 3 2
After:  [2, 2, 1, 0]

Before: [3, 1, 3, 0]
5 3 2 1
After:  [3, 1, 3, 0]

Before: [0, 2, 2, 2]
7 0 0 3
After:  [0, 2, 2, 0]

Before: [1, 0, 2, 1]
6 3 2 0
After:  [1, 0, 2, 1]

Before: [0, 1, 2, 1]
6 3 2 2
After:  [0, 1, 1, 1]

Before: [2, 2, 1, 3]
10 1 3 3
After:  [2, 2, 1, 0]

Before: [0, 1, 0, 2]
15 1 3 1
After:  [0, 0, 0, 2]

Before: [2, 2, 2, 3]
10 2 3 1
After:  [2, 0, 2, 3]

Before: [3, 1, 1, 1]
14 1 3 1
After:  [3, 1, 1, 1]

Before: [2, 1, 2, 3]
1 1 2 1
After:  [2, 0, 2, 3]

Before: [3, 1, 2, 1]
1 1 2 3
After:  [3, 1, 2, 0]

Before: [0, 0, 3, 0]
0 0 3 1
After:  [0, 0, 3, 0]

Before: [1, 1, 1, 0]
12 1 3 0
After:  [1, 1, 1, 0]

Before: [2, 2, 2, 2]
11 2 3 3
After:  [2, 2, 2, 2]

Before: [1, 1, 2, 2]
11 2 3 0
After:  [2, 1, 2, 2]

Before: [2, 1, 0, 0]
12 1 3 0
After:  [1, 1, 0, 0]

Before: [2, 1, 2, 2]
8 3 2 0
After:  [0, 1, 2, 2]

Before: [2, 2, 0, 0]
13 0 3 2
After:  [2, 2, 1, 0]

Before: [3, 2, 3, 3]
4 3 2 1
After:  [3, 1, 3, 3]

Before: [0, 1, 1, 0]
2 2 1 1
After:  [0, 2, 1, 0]

Before: [3, 2, 0, 3]
4 3 0 1
After:  [3, 1, 0, 3]

Before: [3, 3, 3, 3]
4 3 0 2
After:  [3, 3, 1, 3]

Before: [3, 1, 0, 2]
8 0 2 1
After:  [3, 1, 0, 2]

Before: [2, 1, 0, 0]
12 1 3 3
After:  [2, 1, 0, 1]

Before: [0, 3, 2, 0]
7 0 0 2
After:  [0, 3, 0, 0]

Before: [3, 0, 2, 2]
11 2 3 2
After:  [3, 0, 2, 2]

Before: [1, 2, 2, 1]
6 3 2 1
After:  [1, 1, 2, 1]

Before: [1, 1, 1, 0]
12 1 3 3
After:  [1, 1, 1, 1]

Before: [3, 2, 2, 2]
11 2 3 3
After:  [3, 2, 2, 2]

Before: [0, 1, 2, 2]
7 0 0 0
After:  [0, 1, 2, 2]

Before: [0, 1, 2, 2]
7 0 0 1
After:  [0, 0, 2, 2]

Before: [0, 1, 2, 0]
12 1 3 3
After:  [0, 1, 2, 1]

Before: [2, 0, 3, 0]
5 3 2 3
After:  [2, 0, 3, 1]

Before: [1, 1, 2, 2]
1 1 2 0
After:  [0, 1, 2, 2]

Before: [1, 1, 2, 2]
3 0 2 1
After:  [1, 0, 2, 2]

Before: [3, 0, 3, 3]
4 3 0 1
After:  [3, 1, 3, 3]

Before: [2, 1, 3, 3]
10 1 3 3
After:  [2, 1, 3, 0]

Before: [1, 3, 2, 2]
3 0 2 0
After:  [0, 3, 2, 2]

Before: [3, 2, 2, 1]
6 3 2 0
After:  [1, 2, 2, 1]

Before: [3, 0, 1, 3]
10 2 3 3
After:  [3, 0, 1, 0]

Before: [3, 1, 2, 1]
9 3 3 2
After:  [3, 1, 0, 1]

Before: [2, 2, 3, 3]
4 3 2 0
After:  [1, 2, 3, 3]

Before: [3, 3, 0, 0]
8 0 2 2
After:  [3, 3, 1, 0]

Before: [2, 3, 3, 0]
13 0 3 0
After:  [1, 3, 3, 0]

Before: [1, 2, 2, 3]
3 0 2 1
After:  [1, 0, 2, 3]

Before: [3, 0, 1, 3]
4 3 0 0
After:  [1, 0, 1, 3]

Before: [2, 2, 3, 0]
13 0 3 3
After:  [2, 2, 3, 1]

Before: [2, 3, 0, 2]
5 2 3 2
After:  [2, 3, 1, 2]

Before: [2, 0, 3, 0]
13 0 3 1
After:  [2, 1, 3, 0]
        """.trimIndent()


var part2 = """3 3 0 1
0 2 0 3
2 3 3 3
3 2 3 2
8 2 1 3
0 3 1 3
12 3 0 0
6 0 2 3
3 3 1 2
3 1 1 0
1 1 2 2
0 2 1 2
12 3 2 3
3 3 2 2
0 1 0 0
2 0 2 0
11 0 2 1
0 1 2 1
12 3 1 3
6 3 0 1
3 3 2 3
3 1 0 2
1 3 2 2
0 2 2 2
12 2 1 1
6 1 0 0
3 3 1 2
3 2 0 1
3 0 3 3
7 1 3 3
0 3 2 3
12 3 0 0
6 0 2 1
3 2 3 2
3 2 1 3
3 2 2 0
4 0 3 2
0 2 2 2
12 1 2 1
6 1 3 3
3 3 0 1
3 3 3 2
8 0 1 0
0 0 3 0
12 0 3 3
6 3 1 2
3 2 1 3
0 3 0 0
2 0 2 0
3 0 0 1
4 0 3 1
0 1 2 1
0 1 3 1
12 1 2 2
6 2 0 3
3 3 2 2
0 3 0 0
2 0 1 0
3 2 2 1
12 0 0 1
0 1 3 1
12 1 3 3
3 0 1 1
3 2 2 2
12 0 0 1
0 1 2 1
0 1 3 1
12 3 1 3
3 3 2 0
0 1 0 1
2 1 1 1
11 2 0 1
0 1 1 1
0 1 3 1
12 1 3 3
3 3 0 1
3 3 1 2
1 0 2 1
0 1 3 1
0 1 1 1
12 1 3 3
6 3 1 1
3 2 2 2
3 1 0 0
3 2 1 3
6 0 2 0
0 0 1 0
12 0 1 1
6 1 0 0
3 3 1 2
3 1 0 1
3 3 1 3
0 1 2 1
0 1 3 1
12 1 0 0
6 0 1 1
3 0 2 3
3 2 1 2
3 3 0 0
10 3 2 0
0 0 3 0
12 1 0 1
3 2 3 0
10 3 2 0
0 0 3 0
12 1 0 1
3 2 1 0
0 1 0 3
2 3 2 3
3 0 1 2
5 2 3 2
0 2 2 2
12 1 2 1
6 1 1 3
0 0 0 2
2 2 1 2
3 2 1 1
0 3 0 0
2 0 3 0
11 1 0 1
0 1 1 1
12 3 1 3
6 3 0 1
3 1 3 3
3 2 1 0
14 3 0 3
0 3 1 3
12 1 3 1
6 1 2 2
3 2 2 1
3 3 2 3
0 0 0 0
2 0 3 0
11 1 0 3
0 3 1 3
0 3 3 3
12 3 2 2
6 2 1 3
3 3 1 1
3 1 3 2
1 0 2 1
0 1 1 1
12 1 3 3
6 3 2 1
3 3 2 2
0 0 0 3
2 3 1 3
3 1 0 0
12 0 0 3
0 3 1 3
12 1 3 1
6 1 2 2
3 0 3 0
3 3 3 1
3 1 1 3
2 3 1 3
0 3 2 3
12 2 3 2
6 2 0 3
3 3 2 2
3 2 0 1
3 2 0 0
9 0 2 2
0 2 2 2
0 2 3 2
12 3 2 3
3 1 2 2
3 3 2 1
8 0 1 0
0 0 1 0
0 0 2 0
12 3 0 3
3 0 0 1
0 0 0 0
2 0 1 0
3 0 2 2
12 0 0 0
0 0 2 0
12 3 0 3
3 3 2 1
3 3 2 0
9 2 0 2
0 2 2 2
12 3 2 3
6 3 0 2
0 0 0 0
2 0 0 0
3 2 2 3
3 1 2 1
14 1 3 3
0 3 1 3
0 3 3 3
12 3 2 2
6 2 1 1
3 2 1 0
3 2 3 3
3 1 3 2
4 0 3 0
0 0 2 0
12 0 1 1
6 1 2 0
0 0 0 3
2 3 3 3
3 2 2 1
0 2 0 2
2 2 2 2
15 3 1 2
0 2 3 2
12 0 2 0
3 0 3 2
0 0 0 3
2 3 0 3
7 1 3 1
0 1 1 1
12 0 1 0
3 3 3 1
3 3 2 2
5 3 2 3
0 3 1 3
12 0 3 0
6 0 1 3
0 1 0 0
2 0 2 0
3 2 0 1
11 1 2 1
0 1 3 1
12 1 3 3
3 3 1 1
0 3 0 2
2 2 2 2
3 1 1 0
6 0 2 0
0 0 1 0
12 0 3 3
6 3 1 0
3 0 2 3
10 3 2 3
0 3 2 3
12 3 0 0
3 2 1 3
3 0 0 1
3 0 1 2
5 2 3 3
0 3 3 3
12 0 3 0
6 0 0 3
3 2 3 2
3 1 2 0
2 0 1 2
0 2 1 2
12 3 2 3
3 3 2 1
3 0 0 2
2 0 1 1
0 1 1 1
12 1 3 3
6 3 1 2
3 2 3 0
3 0 1 1
3 1 2 3
13 0 3 0
0 0 2 0
0 0 2 0
12 0 2 2
6 2 3 1
0 2 0 2
2 2 2 2
3 0 3 3
3 3 0 0
10 3 2 2
0 2 2 2
12 1 2 1
0 2 0 0
2 0 2 0
3 3 2 2
0 1 0 3
2 3 1 3
9 0 2 3
0 3 3 3
12 1 3 1
3 0 2 3
3 0 0 2
3 3 0 0
0 0 2 0
0 0 1 0
12 1 0 1
6 1 2 0
3 1 0 2
3 3 1 3
0 2 0 1
2 1 2 1
1 3 2 3
0 3 2 3
12 0 3 0
6 0 1 3
3 1 0 0
3 2 3 2
3 1 0 1
6 0 2 1
0 1 2 1
12 1 3 3
6 3 2 2
3 2 0 1
0 1 0 0
2 0 2 0
3 3 2 3
15 3 0 3
0 3 1 3
12 3 2 2
6 2 3 1
3 1 3 3
3 0 3 2
0 2 0 0
2 0 1 0
12 3 3 2
0 2 1 2
0 2 3 2
12 1 2 1
6 1 1 2
0 1 0 1
2 1 0 1
0 3 0 0
2 0 2 0
0 3 0 3
2 3 2 3
4 0 3 3
0 3 1 3
12 3 2 2
6 2 3 3
3 3 2 1
3 3 0 2
11 0 2 0
0 0 2 0
0 0 3 0
12 0 3 3
3 2 1 0
9 0 2 1
0 1 1 1
0 1 1 1
12 3 1 3
6 3 0 0
3 0 0 2
3 2 3 3
3 1 1 1
0 1 2 2
0 2 2 2
0 2 3 2
12 2 0 0
6 0 2 1
3 3 0 0
3 2 1 2
7 2 3 3
0 3 3 3
12 3 1 1
6 1 1 2
3 1 1 0
3 2 0 3
0 3 0 1
2 1 0 1
2 0 1 1
0 1 3 1
12 2 1 2
6 2 2 1
3 2 1 2
3 0 2 3
3 3 0 0
0 0 2 0
0 0 3 0
12 1 0 1
6 1 1 0
3 2 0 3
0 1 0 1
2 1 2 1
3 0 1 2
5 2 3 1
0 1 2 1
12 0 1 0
6 0 3 2
3 2 1 1
3 2 0 0
4 0 3 3
0 3 1 3
12 3 2 2
6 2 0 1
3 3 0 2
3 2 3 3
4 0 3 0
0 0 3 0
0 0 1 0
12 0 1 1
0 2 0 0
2 0 2 0
3 1 1 3
14 3 0 2
0 2 3 2
12 1 2 1
6 1 3 2
3 1 1 1
13 0 3 3
0 3 3 3
0 3 3 3
12 2 3 2
3 2 3 1
3 2 1 3
4 0 3 1
0 1 2 1
12 2 1 2
6 2 3 3
3 2 1 1
3 3 2 2
11 0 2 0
0 0 1 0
12 0 3 3
6 3 2 2
3 1 1 0
3 2 1 3
14 0 3 3
0 3 1 3
12 3 2 2
6 2 1 1
3 2 2 2
0 3 0 3
2 3 2 3
3 2 3 0
4 0 3 3
0 3 2 3
12 1 3 1
6 1 3 0
3 1 3 2
3 2 2 3
3 2 2 1
7 1 3 3
0 3 3 3
0 3 2 3
12 0 3 0
6 0 1 2
3 1 3 3
3 3 3 1
3 2 3 0
13 0 3 0
0 0 2 0
12 2 0 2
6 2 1 0
3 0 1 3
3 2 2 2
3 1 1 1
7 2 3 1
0 1 2 1
12 1 0 0
6 0 1 1
3 1 2 2
0 0 0 0
2 0 2 0
7 0 3 2
0 2 2 2
12 1 2 1
6 1 0 3
3 1 0 0
3 0 2 1
3 2 1 2
6 0 2 2
0 2 2 2
12 2 3 3
6 3 0 2
3 1 2 3
2 3 1 1
0 1 3 1
12 1 2 2
6 2 0 0
0 3 0 2
2 2 0 2
3 3 0 3
3 3 2 1
3 2 1 2
0 2 1 2
12 2 0 0
6 0 3 1
3 3 3 2
3 1 0 0
3 2 0 3
14 0 3 2
0 2 2 2
12 1 2 1
6 1 1 2
3 3 1 3
3 1 2 1
3 2 2 0
15 3 0 3
0 3 2 3
12 3 2 2
3 3 2 3
3 2 2 1
15 3 1 1
0 1 1 1
12 1 2 2
3 1 0 0
3 2 0 3
3 2 1 1
14 0 3 0
0 0 1 0
0 0 3 0
12 0 2 2
6 2 0 1
3 1 1 3
3 2 2 2
3 2 2 0
13 0 3 3
0 3 2 3
12 3 1 1
3 1 3 0
3 0 1 3
6 0 2 0
0 0 3 0
12 1 0 1
6 1 0 2
3 2 0 0
3 2 0 3
3 3 2 1
4 0 3 1
0 1 2 1
12 1 2 2
6 2 2 0
0 3 0 1
2 1 3 1
0 0 0 3
2 3 1 3
3 1 3 2
2 3 1 1
0 1 1 1
0 1 3 1
12 0 1 0
6 0 0 2
3 1 1 1
3 2 3 0
3 0 1 3
14 1 0 0
0 0 1 0
12 2 0 2
6 2 0 0
3 2 2 3
3 2 3 1
3 3 3 2
11 1 2 3
0 3 2 3
12 0 3 0
6 0 0 1
3 0 1 3
0 3 0 0
2 0 2 0
3 2 0 2
10 3 2 2
0 2 3 2
0 2 3 2
12 1 2 1
3 0 1 2
3 1 0 3
3 3 3 0
1 0 2 0
0 0 3 0
0 0 3 0
12 1 0 1
6 1 1 3
3 3 2 2
3 1 1 0
0 0 0 1
2 1 0 1
2 0 1 2
0 2 3 2
12 3 2 3
6 3 1 1
0 1 0 3
2 3 2 3
3 2 3 0
3 2 2 2
7 2 3 2
0 2 3 2
12 2 1 1
6 1 1 3
0 1 0 1
2 1 3 1
3 1 2 0
3 2 0 2
6 0 2 2
0 2 3 2
12 3 2 3
6 3 0 1
0 2 0 2
2 2 2 2
3 1 0 3
3 2 3 0
14 3 0 0
0 0 3 0
12 1 0 1
6 1 3 0
3 3 2 2
0 0 0 1
2 1 1 1
0 3 0 3
2 3 2 3
0 1 2 2
0 2 1 2
12 0 2 0
6 0 2 1
3 1 2 3
3 1 1 2
3 2 1 0
12 3 3 3
0 3 2 3
12 3 1 1
6 1 0 0
3 0 0 3
3 0 3 1
3 3 2 2
3 3 1 2
0 2 3 2
0 2 3 2
12 2 0 0
3 1 3 3
3 1 0 2
3 3 1 1
12 3 3 3
0 3 1 3
12 3 0 0
6 0 1 3
3 2 3 1
3 0 2 2
3 3 0 0
9 2 0 0
0 0 2 0
12 3 0 3
6 3 0 2
3 2 1 0
3 3 0 1
3 2 2 3
4 0 3 0
0 0 2 0
12 0 2 2
0 1 0 0
2 0 2 0
3 0 0 1
4 0 3 0
0 0 1 0
12 2 0 2
6 2 2 1
3 2 1 0
3 3 1 2
11 0 2 3
0 3 2 3
12 3 1 1
3 1 1 0
3 0 2 3
3 0 0 2
0 0 2 2
0 2 2 2
0 2 1 2
12 2 1 1
6 1 1 2
3 0 1 0
3 2 2 1
7 1 3 0
0 0 3 0
12 2 0 2
6 2 0 3
3 1 2 2
3 3 2 0
11 1 0 2
0 2 3 2
0 2 1 2
12 2 3 3
6 3 1 2
3 0 2 0
0 2 0 3
2 3 2 3
7 1 3 1
0 1 2 1
12 2 1 2
6 2 2 3
0 0 0 1
2 1 3 1
3 3 3 2
3 2 1 0
15 1 0 2
0 2 3 2
12 3 2 3
3 2 0 1
3 2 0 2
3 3 3 0
11 1 0 2
0 2 2 2
0 2 2 2
12 3 2 3
6 3 1 1
0 0 0 0
2 0 0 0
3 2 1 3
3 0 0 2
5 2 3 2
0 2 1 2
12 1 2 1
6 1 0 3
3 3 2 1
3 2 2 0
3 3 2 2
9 0 2 0
0 0 1 0
12 0 3 3
3 3 1 0
3 0 1 1
3 0 0 2
9 2 0 2
0 2 3 2
12 2 3 3
6 3 2 2
3 3 0 3
3 2 2 1
3 2 3 0
15 3 0 1
0 1 3 1
12 1 2 2
0 1 0 1
2 1 3 1
3 2 3 3
8 0 1 0
0 0 1 0
0 0 3 0
12 0 2 2
6 2 3 1
3 2 2 0
3 3 1 2
3 1 3 3
13 0 3 0
0 0 2 0
12 1 0 1
6 1 3 0
3 0 3 2
3 2 0 1
0 3 2 1
0 1 3 1
12 0 1 0
6 0 2 2
3 2 2 1
3 2 1 0
13 0 3 1
0 1 2 1
12 1 2 2
6 2 1 0
3 0 0 3
3 2 1 2
3 2 1 1
10 3 2 2
0 2 1 2
12 2 0 0
6 0 2 3
3 1 0 0
0 0 0 2
2 2 2 2
6 0 2 1
0 1 2 1
12 3 1 3
6 3 3 0
0 2 0 3
2 3 1 3
3 3 0 1
8 2 1 3
0 3 1 3
12 0 3 0
6 0 1 1
3 2 3 3
0 3 0 0
2 0 3 0
0 0 0 2
2 2 0 2
5 2 3 0
0 0 1 0
12 1 0 1
6 1 3 3
3 2 2 1
3 2 1 2
3 3 0 0
8 2 0 0
0 0 2 0
0 0 1 0
12 3 0 3
3 3 3 2
0 0 0 0
2 0 1 0
3 0 2 1
12 0 0 0
0 0 2 0
12 0 3 3
6 3 0 2
3 1 3 0
3 1 3 3
3 1 0 1
3 3 0 0
0 0 3 0
12 2 0 2
6 2 1 1
3 1 2 0
3 2 1 2
3 0 1 3
10 3 2 2
0 2 1 2
12 2 1 1
6 1 1 0
0 2 0 2
2 2 2 2
3 0 2 1
7 2 3 3
0 3 3 3
12 3 0 0
3 0 3 2
3 1 2 1
0 3 0 3
2 3 3 3
0 1 2 3
0 3 1 3
0 3 1 3
12 3 0 0
6 0 1 1
3 0 2 0
0 3 0 3
2 3 3 3
3 2 0 0
0 0 2 0
12 1 0 1
6 1 0 3
3 3 1 2
3 2 2 0
3 0 0 1
9 0 2 1
0 1 3 1
12 3 1 3
6 3 3 1
3 0 2 3
3 1 3 0
3 2 2 2
10 3 2 0
0 0 3 0
12 0 1 1
6 1 1 0
0 2 0 1
2 1 0 1
3 2 3 3
3 0 1 2
5 2 3 1
0 1 3 1
0 1 1 1
12 1 0 0
3 3 2 1
5 2 3 1
0 1 2 1
0 1 2 1
12 0 1 0
6 0 0 1
3 1 2 0
14 0 3 0
0 0 2 0
12 0 1 1
3 3 1 3
3 3 1 2
3 0 3 0
1 3 2 2
0 2 1 2
12 1 2 1
6 1 2 3
3 1 2 0
3 3 3 1
3 2 0 2
6 0 2 1
0 1 3 1
12 1 3 3
6 3 3 0
0 0 0 1
2 1 0 1
0 1 0 3
2 3 2 3
0 2 0 2
2 2 0 2
5 2 3 2
0 2 3 2
0 2 3 2
12 0 2 0
0 2 0 1
2 1 1 1
0 1 0 2
2 2 0 2
5 2 3 3
0 3 3 3
12 0 3 0
6 0 3 1
3 2 2 3
3 2 3 2
3 3 0 0
7 2 3 2
0 2 3 2
12 1 2 1
6 1 1 3
3 2 1 0
3 3 1 2
3 1 1 1
14 1 0 0
0 0 2 0
12 0 3 3
6 3 0 0
0 1 0 3
2 3 0 3
3 2 0 2
0 3 0 1
2 1 0 1
10 3 2 3
0 3 2 3
12 0 3 0
6 0 3 2
3 2 3 1
3 2 2 0
3 1 2 3
13 0 3 0
0 0 1 0
0 0 3 0
12 2 0 2
6 2 2 0
3 3 0 2
3 0 1 1
3 2 3 2
0 2 2 2
12 2 0 0
6 0 0 2
3 1 0 0
0 2 0 1
2 1 3 1
3 2 0 3
2 0 1 0
0 0 2 0
12 0 2 2
6 2 2 1
3 0 0 3
3 2 1 0
0 0 0 2
2 2 3 2
5 3 2 2
0 2 3 2
12 1 2 1
6 1 0 2
3 1 0 1
3 3 0 3
14 1 0 1
0 1 1 1
12 1 2 2
6 2 2 1
3 0 0 2
0 1 0 3
2 3 1 3
13 0 3 0
0 0 2 0
12 0 1 1
6 1 0 2
3 2 1 0
3 3 2 1
13 0 3 1
0 1 1 1
12 2 1 2
6 2 0 3
3 2 1 2
3 2 1 1
0 3 0 0
2 0 3 0
11 2 0 1
0 1 1 1
12 3 1 3
6 3 0 1
3 3 2 3
0 0 0 0
2 0 1 0
6 0 2 2
0 2 3 2
12 1 2 1
6 1 0 3
3 3 3 1
3 1 0 2
1 1 2 2
0 2 1 2
12 2 3 3
6 3 0 1
3 0 2 0
0 2 0 2
2 2 2 2
0 1 0 3
2 3 0 3
10 3 2 0
0 0 3 0
12 0 1 1
3 1 0 0
6 0 2 2
0 2 1 2
12 2 1 1
6 1 1 2
3 2 3 0
0 0 0 3
2 3 2 3
0 2 0 1
2 1 2 1
4 0 3 0
0 0 3 0
12 2 0 2
6 2 2 1
3 1 3 3
3 1 0 2
0 2 0 0
2 0 2 0
13 0 3 3
0 3 1 3
12 1 3 1
6 1 2 2
0 3 0 0
2 0 1 0
3 3 0 3
3 1 0 1
12 1 0 1
0 1 3 1
0 1 3 1
12 2 1 2
3 2 1 0
3 1 3 1
3 1 0 3
13 0 3 1
0 1 3 1
0 1 2 1
12 1 2 2
6 2 2 1
3 1 2 0
3 2 1 2
6 0 2 0
0 0 3 0
12 0 1 1
6 1 1 0
3 3 2 2
3 1 3 1
0 3 2 3
0 3 1 3
12 0 3 0
3 0 3 3
3 2 0 2
10 3 2 2
0 2 2 2
12 0 2 0
3 3 0 2
3 1 2 3
3 2 1 2
0 2 1 2
12 2 0 0"""
