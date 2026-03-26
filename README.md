1st Assignment of Algorithms and Data Structures course.

Made by: Alikhan Shikhiyev IT-2510

Computational Complexity Analysis (Time & Space) for each problem
All analyses assume standard recursive implementations (as provided in the Java solutions). Complexities are in Big-O notation and refer to the input size (typically n, array/string length, or grid size).
1. Sum of squares (1^2 + 2^2 + ... + n^2)

Time Complexity: O(n)
(Single chain of n recursive calls, each doing O(1) work.)
Space Complexity: O(n)
(Recursion depth = n, call stack.)

2. Sum of first n elements of an array

Time Complexity: O(n)
(Linear recursion over the n elements.)
Space Complexity: O(n)
(Recursion depth = n.)

3. Sum of first n positive integers (1 + 2 + ... + n)

Time Complexity: O(n)
(Single chain of n recursive calls.)
Space Complexity: O(n)
(Recursion depth = n.)

4. Sum of first n powers of base b

Time Complexity: O(n) (Because I used Math.pow for calculating powers)
Space Complexity: O(n)

5. Print sequence of N integers in reverse order (no arrays/loops allowed)

Time Complexity: O(n)
Space Complexity: O(n)

6. Print sequence of N strings in reverse order (only one local char array allowed, no loops)

Time Complexity: O(n) 
(Exactly n recursive calls, each reading/printing one string.)
Space Complexity: O(n)

7. Fill and print NxN spiral square (recursive layer-by-layer)

Time Complexity: O(n^2)
Space Complexity: O(n^2)

8. Generate all sequences of length n with values 1..k
Time Complexity: O(k^n * n) 
(Recursion tree has k^n  leaves. Each leaf prints  n numbers)
Space Complexity: O(n)
(Maximum recursion depth = n.)

9. Generate all permutations of a string of length m (distinct symbols)

Time Complexity: O(m * m!)
(Standard backtracking: m! permutations generated; work per permutation is proportional to m due to swaps and recursion depth.)
Space Complexity: O(m)
(Recursion depth = m )

10. Check if a number is a power of two (strict single recursive function, no helpers)

Time Complexity: O(log n)
(Each step divides by 2; at most log_2 n recursive calls.)
Space Complexity: O(log n)
(Recursion depth = log_2 n.)
