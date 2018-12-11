public class Sorts{

  public static void main(String[] args){
    System.out.println("Selection Sort:");
    int[] a = {1,7,66,14,15,18,3,0,1};
    int[] b = {4,7,5,0,99,51,-7};
    int[] c = {124,3254,342,231,424,53};

    printArray(a,0);
    System.out.println();
    printArray(b,0);
    System.out.println();
    printArray(c,0);
    System.out.println();

    System.out.println("Bubble Sort:");
    int[] d = {5,1,12,-5,16};
    int[] e = {2,3,4,5,1};
    int[] f = {6,1,2,3,4,5};

    printArray(d,1);
    System.out.println();
    printArray(e,1);
    System.out.println();
    printArray(f,1);
    System.out.println();

    System.out.println("Insertion Sort:");
    int[] g = {5,0,18,-5,155};
    int[] h = {-5,3,6,33,2};
    int[] i = {6,99,21,2,-43,5};

    printArray(g,2);
    System.out.println();
    printArray(h,2);
    System.out.println();
    printArray(i,2);
    System.out.println();

  }

  public static void selectionSort(int [] ary){
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

  public static void insertionSort(int[] data){
    for(int i = 1; i < data.length; i++){
      int current = data[i];
      boolean sorted = false;
      int idx = i-1;
      while(!(idx < 0 || data[idx] < current)){
        data[idx+1] = data[idx];
        idx--;
      }
      data[idx+1] = current;
    }
  }



  public static void printArray(int ary[], int a){
    int n = ary.length;
    System.out.print("{");
    for (int i=0; i<n; ++i){
        if (i != n-1) System.out.print(ary[i]+", ");
        else System.out.print(ary[i]+"");
    }
    System.out.print("}");
    System.out.println();
    if (a == 0) selectionSort(ary);
    if (a == 1) bubbleSort(ary);
    if (a == 2) insertionSort(ary);
    System.out.print("{");
    for (int i=0; i<n; ++i){
      if (i != n-1) System.out.print(ary[i]+", ");
      else System.out.print(ary[i]+"");
    }
    System.out.print("}");
    System.out.println();
  }

}
