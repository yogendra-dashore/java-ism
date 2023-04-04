import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
//		int [] a= new int[6];
//		
//             for(int i=0;i<a.length;i++) {
//			
//			a[i] = sc.nextInt();
//		}
             int n = sc.nextInt();
             int[] a=new int[n+1];
             for(int i=0;i<n;i++) {
            	 int temp =sc.nextInt();
            	 a[i]=temp;
            	 
             }
             System.out.println("on which index you want to add number");
             int ind= sc.nextInt();
             System.out.println("which number you want to add");
             
             int newnum = sc.nextInt();
             for(int i=n;i>0;i--) {
            	 if(i-1==ind) {
            		 a[i]=a[i-1];
            		 a[i-1]= newnum;
            		 break;
            	 }
            	 a[i]= a[i-1];
            	 
             }
             for(int i=0;i<=n;i++) {
            	 System.out.println(a[i]+ " ");
             }
		
	}
	

}
