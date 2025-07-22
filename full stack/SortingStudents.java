public class SortingStudents
 {
    public static void main(String[] args)
    {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1001,"saniya",1000000));
        employees.add(new Employee (1001,"shradda",800000));
        employees.add(new Employee (1001,"sulthqnq",300000));
        employees.add(new Employee (1001,"shqik",700000));
        employees.add(new Employee(1001,"sabi",100000));
        Comparator<Employee> salComparator=(e1,e2) ->
        {
            if(e1.sal==e2.sal)
            return 0;
            else if(e1.sal > e2.sal)
            return 1;
        } ;

        collections.sort(employees ,salComparator);
        Iterator<Employee> it=employees.Iterator();
        while(it.hasNext())
        {
            Employee emp=it.next();
            System.out.println(emp.id+" "+emp.name+" "+emp.salary);
        }
    }
}
class nameComperator implements Comparator<Employee>
 {
    public int compare(Employee e1, Employee e2)
     {
        if(e1.name.compareTo(e2.name)==0)
        return 0;
        else if(e1.name.compareTo(e2.name)>0)
        return 1;
        else
        return -1;
    }
}
class Employee
{
    public int id;
    public String name;
    public long salary;
    Employee(int x, String y, long z)
    {
        id=x;
        name=y;
        salary=z;
    }
}
class ageComparator implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        if(e1.salary==e2.salary)
        {
            
        }
    }
}
