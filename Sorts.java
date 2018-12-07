public class Sorts{

  public static void main(String[] args){
    System.out.println("Selection Sort:");
    int[] a = {1,7,66,14,15,18,3,0,1};
    int[] b = {4,7,5,0,99,51,-7};
    int[] c = {124,3254,342,231,424,53};

    printArray(a);
    System.out.println();
    printArray(b);
    System.out.println();
    printArray(c);
    System.out.println();

    System.out.println("Bubble Sort:");
    int[] d = {5,1,12,-5,16};
    int[] e = {2,3,4,5,1};
    int[] f = {6,1,2,3,4,5};

    printArray(d);
    System.out.println();
    printArray(e);
    System.out.println();
    printArray(f);
    System.out.println();

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

  public static void bubbleSort(int[] data){
    boolean sorted = false;

    while(!sorted){
      int swaps = 0;
      for(int i = 0; i < data.length - 1; i++){
        if(data[i]>data[i+1]){
          int hold = data[i];
          data[i] = data[i+1];
          data[i+1] = hold;
          swaps++;
        }
      }
      if (swaps == 0) sorted = true;
    }
  }

  public static void printArray(int ary[]){
    int n = ary.length;
    System.out.print("{");
    for (int i=0; i<n; ++i){
        if (i != n-1) System.out.print(ary[i]+", ");
        else System.out.print(ary[i]+"");
    }
    System.out.print("}");
    System.out.println();
    selectionsort(ary);
    System.out.print("{");
    for (int i=0; i<n; ++i){
      if (i != n-1) System.out.print(ary[i]+", ");
      else System.out.print(ary[i]+"");
    }
    System.out.print("}");
    System.out.println();
  }

}
