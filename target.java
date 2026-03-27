import java.util.*;
public class target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] search=new int[size];
        for(int i=0;i<size;i++){ 
            search[i]=sc.nextInt();

        }
        System.out.print("Enter target element: ");
        int t=sc.nextInt();
        // binary search
        int l=0;
        int h=size-1;
        boolean check=false;  //element is not found
        while(l<=h){
            int mid=(l+h)/2;
            if(search[mid]==t){
                check =true;  //element mil gya
                break;

            }
            else if(search[mid]>t){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(check==true){
            System.out.print("Element is present");

        }
        else{
            System.out.print("Element is not present");
        }
        

   }    
}
