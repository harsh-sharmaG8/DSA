package array;

        public static int linearSearch(int[] arr, int target) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == target) {
                    return i;   // Element found
                }
            }
            return -1;  // Element not found
        }

}
