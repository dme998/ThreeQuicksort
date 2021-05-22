# ThreeQuicksort
Performance comparison of three different versions of Quicksort.

## Description
In this project, we implement the quicksort algorithm in three versions:
* the original version
* the randomization version
* the median-of-3 version

Three integer arrays are generated:
* Array with random data
* Array in ascending order 1-1000
* Array in descending order 1-1000

Each of the three quicksort methods is performed on each array for a total of 9 trials. <br>
The execution time in nanoseconds, number of comparisons, and number of swaps are recorded. 

### Original Specification
1. (Programming Languages) You can use either C/C++, Java or Python to write this
program. If you want to use other programming languages, you may need to talk
to me first.
2. (Generate Data) First you need to generate the data. Our data is composed of
three 1000-element arrays. The first array is a random array, for which you can use
a random function or method to generate an integer array containing 1000 random
integers with values between 1 and 1000 inclusive. The array elements do not have
to be distinct. The next two arrays are ordered arrays described below.
3. (Ordered Data) Use two 1000-element arrays to store ordered data: one in ascending
order and one in descending order. These two arrays contain consecutive integers
from 1 to 1000.
4. (Display Data) Before you sort the arrays, you need to display the unordered array
on the screen. You display these 1000 integers in 50 lines with each line containing
20 numbers, separated by commas. You do not need to display the other two ordered arrays.
5. (Develop) You need to develop one function or method for each of the three versions
of the quicksort. For each function or method, the input is the array to be sorted,
and the output is the sorted array.
6. (Count operations) In this algorithm, you will count two types of operations: comparisons and swaps. In each of your quicksort implementation function or method,
create two counters to count the number of those two operations. In order to do the
tally conveniently, you can use global variables or instance variables when necessary.
17. (Ignore overhead) When we count the number of comparisons and the number of
swaps, only count those that are involving the original array elements or copies of
the elements. Do not count the part that are used for the overhead.
8. (Display results) Run three versions of the quicksort in order with appropriate information displayed. When you run each version on three arrays, print out the number
of comparisons, the number of swaps, and then the sorted array in the same way as
described in 4. (Display Data).
9. (Display running time) When you run each version on each array, clock the running
time, and display it for comparison. We want to get some ideas for the performances
of these three versions on different inputs. (Just compare and think about it. You
do not need to write your observations and conclusions out.)
