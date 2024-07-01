package Array.Array3;

public class ArrayCompare {
  public static void main(String[] args) {
    ArrayCompare arrayCompare = new ArrayCompare();

    int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
    int[] arr2 = {0,2,3,4,5,6,7,8,9,10};

    boolean bool = arrayCompare.equalsArray(arr1, arr2);

    if (bool)
      System.out.println("two array equals");
    else
      System.out.println("two array not-equals");
  }
  public boolean equalsArray(int[] a, int[] b){
    boolean bool = true;
    for (int i = 0; i < a.length; i++) {
      if(a[i] != b[i]) {
        bool = false;
        break;
      }
    }
    return bool;
  }
}
