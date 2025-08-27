package com.raxrot.spacetimecomplexity;

public class SpaceTimeComplexity {
        public static void main(String[] args) {
            // O(1) — Constant
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[1]);

            // O(n) — Linear
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            // O(log n)
            int start = 0;
            int end = arr.length - 1;
            int targetValue = 4;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == targetValue) {
                    System.out.println("Found " + targetValue + " at index " + mid);
                    break;
                } else if (arr[mid] < targetValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // O(n^2)
            int target = 9;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("Target " + target + " -> pair: " + arr[i] + ", " + arr[j]);
                    }
                }
            }
        }
}
