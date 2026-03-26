1st Assignment of Algorithms and Data Structures course.

Made by: Alikhan Shikhiyev IT-2510

Computational Complexity Analysis (Time & Space) for each problem
All analyses assume standard recursive implementations (as provided in the Java solutions). Complexities are in Big-O notation and refer to the input size (typically $  n  $, array/string length, or grid size).
1. Sum of squares ($  1^2 + 2^2 + \dots + n^2  $)

Time Complexity: $  O(n)  $
(Single chain of $  n  $ recursive calls, each doing $  O(1)  $ work.)
Space Complexity: $  O(n)  $
(Recursion depth = $  n  $, call stack.)

2. Sum of first $  n  $ elements of an array

Time Complexity: $  O(n)  $
(Linear recursion over the $  n  $ elements.)
Space Complexity: $  O(n)  $
(Recursion depth = $  n  $.)

3. Sum of first $  n  $ positive integers ($  1 + 2 + \dots + n  $)

Time Complexity: $  O(n)  $
(Single chain of $  n  $ recursive calls.)
Space Complexity: $  O(n)  $
(Recursion depth = $  n  $.)

4. Sum of first $  n  $ powers of base $  b  $ ($  b^0 + b^1 + \dots + b^n  $)

Time Complexity: $  O(n)  $
(Linear recursion; each Math.pow is $  O(1)  $ in practice.)
Space Complexity: $  O(n)  $
(Recursion depth = $  n  $.)

5. Print sequence of $  N  $ integers in reverse order (no arrays/loops allowed)

Time Complexity: $  O(n)  $
(Exactly $  n  $ recursive calls, each reading/printing one number.)
Space Complexity: $  O(n)  $
(Recursion depth = $  n  $.)

6. Print sequence of $  N  $ strings in reverse order (only one local char array allowed, no loops)

Time Complexity: $  O(n)  $
(Exactly $  n  $ recursive calls, each reading/printing one string.)
Space Complexity: $  O(n)  $
(Recursion depth = $  n  $; string storage is input-size dependent.)

7. Fill and print $  N \times N  $ spiral square (recursive layer-by-layer)

Time Complexity: $  O(n^2)  $
(There are $  \Theta(n)  $ layers. Each layer uses 4 loops that together touch $  \Theta(n)  $ cells → total cells filled = $  n^2  $.)
Space Complexity: $  O(n^2)  $
(Grid storage) + $  O(n)  $ (recursion depth = $  \lceil n/2 \rceil  $).

8. Generate all sequences of length $  n  $ with values $  1 \dots k  $

Time Complexity: $  O(k^n \cdot n)  $
(Recursion tree has $  k^n  $ leaves. Each leaf prints $  n  $ numbers; total nodes ≈ $  \frac{k^{n+1}-1}{k-1}  $.)
Space Complexity: $  O(n)  $
(Maximum recursion depth = $  n  $.)

9. Generate all permutations of a string of length $  m  $ (distinct symbols)

Time Complexity: $  O(m \cdot m!)  $
(Standard backtracking: $  m!  $ permutations generated; work per permutation is proportional to $  m  $ due to swaps and recursion depth.)
Space Complexity: $  O(m)  $
(Recursion depth = $  m  $.)

10. Check if a number is a power of two (strict single recursive function, no helpers)

Time Complexity: $  O(\log n)  $
(Each step divides by 2; at most $  \log_2 n  $ recursive calls.)
Space Complexity: $  O(\log n)  $
(Recursion depth = $  \log_2 n  $.)
