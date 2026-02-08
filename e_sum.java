abstract class A{
    final int n = 10;
    abstract void sum();
}
class B extends A {
    int i, E_sum=0;
    void sum(){
        for(i=1; i<n+1; i++){
            if(i%2==0){
                E_sum = E_sum+i;
            }
        }
     System.out.println(E_sum+" ");
    }


class D {
    void Display(){
        System.out.println(n);
    }

}
}
class e_sum{
    public static void main(String args[]){
        B obj = new B();
        B.D obj1 = obj.new D();
        obj.sum();
        obj1.Display();
    }
}