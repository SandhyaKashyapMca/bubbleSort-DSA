
import java.util.Scanner.*;
public class selection {
  
public static void printArray(int arr[])
{
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]+" ");
  }
System.err.println();
}
public static void main(String[] args) {
  int arr[]={34,23,65,12,56,76};
  for(int i=0; i<arr.length; i++)
  {
    int smallest=i;
for(int j=i+1;j<arr.length; j++)
{
if(arr[smallest]>arr[j])
{
  smallest=j;
}
  }
  int temp = arr[smallest];
  arr[smallest] =arr[i];
  arr[i]=temp;


}
printArray(arr);
}
}