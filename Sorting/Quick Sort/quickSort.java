//Time Complexity Analysis:
//Best Case Time Complexity: O(nlogn)
//Avg Case Time Complexity: O(nlogn)
//Worst Case Time Complexity: O(n2)

public static void main(String args[]){
  int []arr = {5,4,3,2,1};
  int n = arr.length;
  quickSort(arr,0,n-1);
}

public quickSort(arr,lb,ub){
  int i = partition(arr, lb, ub);
  quickSort(arr, lb, i);
  quickSort(arr, i+1, ub);
}

public int partition(arr, lb, ub){
  int pivot = arr[lb];
  while(lb<ub){
    while(arr[pivot]>=arr[lb]){
      lb++;
    }
    while(arr[pivot]<arr[ub]){
      ub--;
    }
    if(lb<ub){
      swap(arr[lb],arr[ub]);
    }
  }
  swap(arr[pivot],arr[lb]);
  return pivot;
}
