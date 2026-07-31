public class reversing_array {
 public static void main(String[] args){
int[] arr = {1,2,3,4,5,6,7,8,9,10};
int a = arr.length;
int b = Math.floorDiv(a,2);
int temp;
for(int i=0;i<b;i++){
    temp = arr[i];
    arr[i] = arr[a-i-1];
    arr[a-i-1] = temp;}
    for(int elements:arr){
        System.out.println(elements);}
    }
}