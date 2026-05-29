class Student{
    private int id;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
}
class Encapsulation{
    public static void main(String args[]){
        Student std1=new Student();
        std1.setId(10);
        System.out.println(std1.getId());
    }

}