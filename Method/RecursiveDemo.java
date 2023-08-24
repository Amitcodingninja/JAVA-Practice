package Method;

public class RecursiveDemo {
    static int count =0;
public static void main(String[] args) {
    // p();
    p_finite();


}
// static void p()
// {
//     System.out.println("Hello Amit ");
//     p();
// }
   static void p_finite()
   {
    if(count <= 5)
    {     
        System.out.println("Hello : "+count);
        count ++;
        p_finite();

    }
   } 


}