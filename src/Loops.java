//public class First {
//   public static void main(String[] a) {
//     int N = 7;
//   int i = 1;
// while (i <= 10) {

// printing the N*i,ie ith multiple of N.
//   System.out.println(N + " * " + i + " = "
//         + N * i);
//i++;
// }
// }
//}
// public class First{
//   public static void main(String[] args) {
// setting the infinite while loop by passing true to the condition
//     while(true){
//       System.out.println("nhi jana khinn ");
// }
//}
//}
//public class Loops{
  //  public static void main(String[] a){
    //    int i= 100;
      //  while (i<=200){
        //    System.out.println(i);
          //  i++;
       // }
        //System.out.print("loop ends");
    //}
//}
//(multiplication of 3)
//public class Loops{
  //  public static void main(String[] a){
    //    int i=1;
      //  int n=3;
        //do {
          //  System.out.println(n+"*" +i+"="+n*i);
            //i++;
        //}while (i<=10);
    //}
//}
//public class Loops {
  //  public static void main(String[] a){
    //    do {
      //      System.out.println("Faridabad");
        ///}while(true);
   // }
//}
//public class Loops
//{
  //  public static void main(String args[])
    //{
//i for rows and j for columns
//row denotes the number of rows you want to print
      //  int i, j, row=6;
//outer loop for rows
        //for(i=0; i<row; i++)
        //{
//inner loop for columns
          //  for(j=0; j<=i; j++)
            //{
//prints stars
              //  System.out.print("* ");
            //}
//throws the cursor in a new line after printing each line
            //System.out.println();
   //     }
 //   }
//}
// star pattern
//public class Loops{
  //  public static void main(String[] a){
    //    int i,j;
      //  for(i=1; i<=5; i++){//row
        //    for(j=1; j<=i; j++ ){//column
          //      System.out.print("*");
            //}
            //System.out.print("\n");
//        }
  //  }
//}
//public class Loops {
  //  public static void main(String[] a){
//    int i,j;
  //      for (i=1; i<=5; i++) {
    //        for (j=5; j>=i; j--) {
      //          System.out.print("*");
        //    }
        //    System.out.print("\n");
        //}
    //}
//}
//
//public class Loops{
  //  public static void main(String[] a){
    //    int n=7;
      //  int i=1;
        //for(i=1; i<=10; i++){
          //  System.out.println(n+"*"+i+"="+n*i);
        //}

    //}
//}
/*public class Loops {
    public static void main(String[] a){
        int i,j,k;
        for (i=1; i<=5; i++){
            for (j=1; j<=5; j++){
                System.out.print(" ");
            }
        for(k=i; k<=j; k++){
            System.out.print("*");
        }
            System.out.print("\n");
        }

    }

}*/
/*public class Loops {
 public static void main(String args[]) {
    char ch='A';

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j <=i ; j++) {

            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }
}
}
}
 */
/*public class Loops {
    public static void main(String a[]){
        int i,j,p;
    for(i=1; i<=5; i++){
        for(j=i; j<5; j++){
            System.out.print(" ");
        }
        for (p=1; p<=i; p++){
            System.out.print(" *");
        }
        System.out.print("\n");
    }


        }
    
}*/
    class Loops
    {
        public static void main(String args[])
        {
            int i, j,number, n=7;
//loop for rows
            for(i=0; i<n; i++)
            {
                number=1;
//loop for columns
                for(j=0; j<=i; j++)
                {
//prints num
                    System.out.print(number+ " ");
//incrementing the value of number
                    number++;
                }
//throws the cursor at the next line after printing each row
                System.out.println();
            }
        }
    }