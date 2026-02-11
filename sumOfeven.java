import  java.io.*;
abstract class a{
    abstract void getdata();
}
class B extends a{
    void getdata()
    {
       Public final int a = 20;
    }
    int sum123(){
        int sum = 0;
        for (int i=0; i<a; i++){
            if(i%2==0){
                sum = sum+i;
                return sum;
            }
        }
    }
}
class D{
    public static void main(Strings args[]){
        B obj = new B();
        obj.getdata();
        int sum1=obj.sum123();
        System.out.println("the sum of the even number is: "+sum1);
    }
}