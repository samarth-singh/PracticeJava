import java.util.Scanner;
class bubsort{
  static void bubble(int a[]){
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length-1;j++){
        if(a[j]>a[j+1]){
          a[j]=a[j]^a[j+1];
          a[j+1]=a[j+1]^a[j];
          a[j]=a[j]^a[j+1];
        }
      }
    }
  }
  public static void main(String...args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter array size: ");
    int n=scan.nextInt();
    int a[]=new int[n];
    System.out.print("Enter an array ");
    for(int i=0;i<a.length;i++){
      a[i]=scan.nextInt();
    }
    bubble(a);
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}
