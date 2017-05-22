import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 4};
        int[] a2 = {1, 3, 5};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }
//Stepik code: start

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int length = a1.length + a2.length;
        int[] a3 = new int[length];

        if (a1.length == 0 && a2.length == 0) {
            return a3;
        } else if (a1.length == 0 && a2.length != 0) {
            for (int i = 0; i < a2.length; i++) {
                a3[i] = a2[i];
            }
            return a3;
        } else if (a1.length != 0 && a2.length == 0) {
            for (int i = 0; i < a1.length; i++) {
                a3[i] = a1[i];
            }
            return a3;
        }
        int temp1;
        int temp2;
        for (int i = 0; i < length-1; i++) {
            if ((a1.length - 1) < i && (a2.length - 1) >= i) {
                if (a3[i + 1] < a2[i]) {
                    a3[i + 2] = a2[i];
                    continue;
                } else if (a3[i + 1] > a2[i] && a3[i] >= a2[i]) {
                    temp1 = a3[i];
                    temp2 = a3[i+1];
                    a3[i] = a2[i];
                    a3[i+1] = temp1;
                    a3[i + 2] = temp2;
                    continue;
                } else if (a3[i + 1] > a2[i]){
                    temp1 = a3[i + 1];
                    a3[i + 1] = a2[i];
                    a3[i+2] = temp1;
                    continue;
                } else if (a3[i + 1] == a2[i]) {
                    a3[i + 2] = a2[i];
                    continue;
                }
                //
//                if (a3[i + 1] < a2[i]) {
//                    a3[i + 2] = a2[i];
//                    continue;
//                } else if (a3[i + 1] > a2[i]) {
//                    a3[i + 2] = a3[i + 1];
//                    a3[i + 1] = a2[i];
//                    continue;
//                } else if (a3[i + 1] == a2[i]) {
//                    a3[i + 2] = a2[i];
//                    continue;
            } else if ((a2.length - 1) < i && (a1.length - 1) >= i) {
                if (a3[i + 1] < a1[i]) {
                    a3[i + 2] = a1[i];
                    continue;
                } else if (a3[i + 1] > a1[i] && a3[i] >= a1[i]) {
                    temp1 = a3[i];
                    temp2 = a3[i+1];
                    a3[i] = a1[i];
                    a3[i+1] = temp1;
                    a3[i + 2] = temp2;
                    continue;
                } else if (a3[i + 1] > a1[i]){
                    temp1 = a3[i + 1];
                    a3[i + 1] = a1[i];
                    a3[i+2] = temp1;
                    continue;
                } else if (a3[i + 1] == a1[i]) {
                    a3[i + 2] = a1[i];
                    continue;
                }
            } else if ((a1.length - 1) < i && (a2.length - 1) < i) {
                break;
            }

            if (i == 0) {
                if (a1[i] < a2[i]) {
                    a3[i] = a1[i];
                    a3[i + 1] = a2[i];
                } else if (a1[i] > a2[i]) {
                    a3[i] = a2[i];
                    a3[i + 1] = a1[i];
                } else if (a1[i] == a2[i]) {
                    a3[i] = a1[i];
                    a3[i + 1] = a2[i];
                }
            } else {
                if (a1[i] < a2[i]) {
                    if (a1[i] <= a3[i-1] && a1[i] < a3[i]) {
                        temp1 = a3[i-1];
                        temp2 = a3[i];
                        a3[i-1] = a1[i];
                        a3[i] = temp1;
                        a3[i + 1] = temp2;
                        a3[i + 2] = a2[i];
                    } else if (a1[i] > a3[i-1] && a1[i] < a3[i]){
                        temp1 = a3[i];
                        a3[i] = a1[i];
                        a3[i + 1] = temp1;
                        a3[i + 2] = a2[i];
                    } else {
                        a3[i + 1] = a1[i];
                        a3[i + 2] = a2[i];
                    }
                } else if (a1[i] > a2[i]) {
                    if (a2[i] <= a3[i-1] && a2[i] < a3[i]) {
                        temp1 = a3[i-1];
                        temp2 = a3[i];
                        a3[i-1] = a2[i];
                        a3[i] = temp1;
                        a3[i + 1] = temp2;
                        a3[i + 2] = a1[i];
                    } else if (a2[i] > a3[i-1] && a2[i] < a3[i]){
                        temp1 = a3[i];
                        a3[i] = a2[i];
                        a3[i + 1] = temp1;
                        a3[i + 2] = a1[i];
                    } else {
                        a3[i + 1] = a2[i];
                        a3[i + 2] = a1[i];
                    }
                } else if (a1[i] == a2[i]) {
                    a3[i + 1] = a1[i];
                    a3[i + 2] = a2[i];
                }
            }
        }
        return a3; // your implementation here
    }

//Stepik code: end
}
