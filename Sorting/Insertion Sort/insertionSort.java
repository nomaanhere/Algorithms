public static void main(String args[]){
int arr[] = {5,4,3,2,1};
for(int i=1;i<n;i++){
 int temp = arr[i];
  j = i-1;
  while(j>=0 && arr[j]>temp){
    arr[j+1]=arr[j];
    j--;
  }
  arr[j+1]=temp;
}
  for(int i : arr){
    System.out.print(i+" ");
  }
}
