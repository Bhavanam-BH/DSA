import java.lang.*;
class SecondLargest{
public static void main(string[] args){
    int arr=[20,30,40,50,90,70,20];
    int max=arr[0];
    //largest number
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    //second largest number
    int second=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<max && arr[i]>second){
            second=arr[i];
        }
    }
    System.out.println(max);
    System.out.println(second);
}
}