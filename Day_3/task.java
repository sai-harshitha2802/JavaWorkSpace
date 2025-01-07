package Day_3;

public class task {

    int id;
    
    int salary;
    
    String Name;
    
    int noofdayspresent;
    
    
    public task(int id, int salary, String name, int noofdayspresent) {
    
    this.id = id;
    
    this.salary = salary;
    
    this.Name = name;
    
    this.noofdayspresent = noofdayspresent;
    
    }
    
    int findperdaysalary() {
    
    return (salary/30);
    
    }
    
    int salaryearnedforcurrentmonth() {
    
    return noofdayspresent *findperdaysalary();
    
    }
    
    
    }
