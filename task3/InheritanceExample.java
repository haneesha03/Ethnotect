class Employee
{
    public  static String office="google";
	public int id;
	public float salary;
    public Employee(int id,float salary){
        this.id=id;
        this.salary=salary;
    }
	public void print()
	{
        System.out.println(id +" "+salary+ " "+office);
	}
}
// class Tester extends Employee{
//     public void print(){

//     }
// }
// class Developer extends Emplo{
// 	public void print()
// 	{
		
// 	}
// }
class InheritanceExample{
    public static void main(String args[]){
        Employee emp=new Employee(1,384689634);
        Employee ep=new Employee(2,34254);
        emp.print();
        ep.print();
    }
}