public class SelectionSort{

  public static void main(String[] args){
    int[] a = {1,7,66,14,15,18,3,0,1};
    int[] b = {4,7,5,0,99,51,-7};
    int[] c = {124,3254,342,231,424,53};
    int[] d = {-124,12,-11,432,0,434,32};

    printArray(a);
    System.out.println();
    printArray(b);
    System.out.println();
    printArray(c);
    System.out.println();
    printArray(d);

  }

  public static void selectionsort(int [] ary){
    int n = ary.length;
    //cycles through the array
    for(int i =0; i < n-1; i++){
      int min = i;
      //finds the next smallest
      for(int x = i+1; x < n; x++){
        if (ary[x] < ary[min]) min = x;
      }
      //does the swappy
      int hold = ary[min];
      ary[min] = ary[i];
      ary[i] = hold;
    }
  }

  public static void printArray(int ary[]){
    int n = ary.length;
    System.out.print("{");
    for (int i=0; i<n; ++i){
        System.out.print(ary[i]+" ");
    }
    System.out.print("}");
    System.out.println();
    selectionsort(ary);
    System.out.print("{");
    for (int i=0; i<n; ++i){
        System.out.print(ary[i]+" ");
    }
    System.out.print("}");
    System.out.println();
  }

}
