package DSAInJava;
class binarySearchAlgo{
    public int binarySearchImp(int[] array, int key){
        int right=array.length;
        int left= 0;
        int mid=0;
        while(left<=right){
            mid= left+((right-left)/2);
            if(key>array[mid]){
                left=mid+1;
            } else if (key<array[mid]) {
                right= mid-1;
            } else if (array[mid]==key) {
                return mid;
            }
        }
        return -1;
    }
}

public class BinarySearch {

    public static void main(String[] args) {
        int[] shortedArray=new int[]{20,23,33,36,66,99,172,223,255};
        int key= 66;
        binarySearchAlgo algo= new binarySearchAlgo();
        int index=algo.binarySearchImp(shortedArray,key);
        if(index==-1){
            System.out.println("Key is not found inside the given array!");
        }else {
            System.out.println("Key found at index: " + index);
        }
    }
}
