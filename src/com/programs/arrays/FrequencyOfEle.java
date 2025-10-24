package com.programs.arrays;

public class FrequencyOfEle {

	public static void main(String[] args) {
		int arr[] = {10, 50, 65, 2, 1, 4, 2, 6, 5, 4};
        int target = 2;  // Element whose frequency we want
        int frequency = 0;

        // Loop through the array
        for (int num : arr) {
            if (num == target) {   // Check if current element is the target
                frequency++;        // Increase the counter
            }
        }

        System.out.println("Frequency of " + target + " is: " + frequency);
	}

}
