public static void main(String args[]){
int[] arr = {5,4,3,2,1};
int n = arr.length;
mergeSort(arr, 0, n-1);
}

public merge(int[]arr, int lb, int mid, int ub){
  
}

public mergeSort(int arr, int lb, int ub){
  int mid = (ub-lb)/2;
  mergeSort(arr, lb, mid);
  mergeSort(arr, mid+1, ub);
  merge(arr, lb, mid, ub);
}
