public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        int x,sum=0;
        int temp;
        int y=sc.nextInt();

        temp=y;
        while(y>0){
            x=y%10;
            sum=(sum*10)+r;
            y=y/10;
        }
        if(temp==sum)
            System.out.println("palindrome ");
        else
            System.out.println("not palindrome");
    }
}