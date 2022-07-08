import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String name = System.getProperty("user.name");

       System.out.print("何歳 : ");
       int age = sc.nextInt();

       System.out.print("身長 : ");
       double height = sc.nextDouble();
  
       System.out.print("体重 : ");
       double weight = sc.nextDouble();

       System.out.println(name+"のプロフィール");
       System.out.println(age+"歳 / "+height+"センチメートル / "+weight+"キログラム");

       int a = age/5;
       double b = height/10;
       double c = weight/8;
        
       System.out.print("何歳    : ");
       if(a<5){
        for(int i = 1 ; i<=a ;i++){
            System.out.print("&");
           }
           System.out.println(" ");
       }else{
        int d =a/5;
        int e = a-d*5;
        for (int i = 1; i<=d;i++){
            for (int l = 1 ; l<=5;l++){
                System.out.print("&");
        }
        System.out.print(" ");
       }
       for(int i = 1 ; i<=e ;i++){
        System.out.print("&");
       }
       System.out.println(" ");       
    }

       System.out.print("身長 : ");
       if(b<5){
        for(int i = 1 ; i<=b ;i++){
            System.out.print("&");
           }
           System.out.println(" ");
       }else{
        double k = b/5;
        double h = b-k*5;
        for (int i = 1; i<=k;i++){
            for (int l = 1 ; l<=5;l++){
                System.out.print("&");
        }
        System.out.print(" ");
       }
       for(int i = 1 ; i<=h ;i++){
        System.out.print("&");
       }
       System.out.println(" ");       
    }
       
       System.out.print("体重 : ");
       if(c<5){
        for(int i = 1 ; i<=c ;i++){
            System.out.print("&");
           }
           System.out.println(" ");
       }else{
        double n =c/5;
        double m = c-n*5;
        for (int i = 1; i<=n;i++){
            for (int l = 1 ; l<=5;l++){
                System.out.print("&");
        }
        System.out.print(" ");
       }
       for(int i = 1 ; i<=m ;i++){
        System.out.print("&");
       }
       System.out.println(" ");       
    }
       

       sc.close();

    }
}