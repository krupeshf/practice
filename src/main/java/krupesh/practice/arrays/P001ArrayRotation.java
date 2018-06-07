package krupesh.practice.arrays;

// https://www.geeksforgeeks.org/array-rotation/
public class P001ArrayRotation {
    public <T> void rotateArray(T[] array, int displacement, int size) {
        if (array.length != size) {
            throw new Error("Array length does not match given length");
        }
        // if displacement is more than size - take modulo
        displacement = displacement % size;
        int diff = size - displacement;
        T[] placeHolderArray = (T[]) new Object[displacement];
        for (int i = 0; i < size; ++i) {
            if(i < displacement) {
                placeHolderArray[i] = array[i];
            }
            if (i < diff) {
                array[i] = array[i + displacement];
            } else {
                array[i] = placeHolderArray[i - diff];
            }
        }
    }
}
