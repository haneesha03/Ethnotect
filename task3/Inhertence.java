class BasicCalci{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }


}
class AdvCalci extends BasicCalci{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class Inhertence{
    public static void main(String args[]){
        BasicCalci ob=new BasicCalci();
        System.out.println(ob.add(10,20));

        AdvCalci obj=new AdvCalci();
        System.out.println(obj.add(4,6));
        System.out.println(obj.mul(10,20));
    }
}