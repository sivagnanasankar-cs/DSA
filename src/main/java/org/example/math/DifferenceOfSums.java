package org.example.math;

public class DifferenceOfSums {

    ///  Name : Divisible and Non-divisible Sums Difference
    ///  https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/

    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i % m == 0 ? -i : +i;
        return sum;
    }

    public static void main(String[] args) {
        DifferenceOfSums diff = new DifferenceOfSums();
        System.out.println(diff.differenceOfSums(10, 3));
    }
}
