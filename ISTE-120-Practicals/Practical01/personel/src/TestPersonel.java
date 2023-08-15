/**
 * Class: ISTE-120 - <801>
 * Exam: Practical 1, Questions #2
 * Description: A class to test The Employee, Department & Devision Classes
 * @author Klara Makek
 * @version 30.9.2022.
 */
public class TestPersonel {
    public static void main(String[] args) {
        
    //inistilising employees 1 and 2
    Employee emp1 = new Employee("Tim Cook", 1234, 200000);
    Employee emp2 = new Employee("Bill Gates", 222, 300000);

    //instalising the Employee 3 - Ivan Rimac
    Employee emp3 = new Employee();
    //Seting the name of the Employee 3
    emp3.setName("Ivan Rimac");
    //Seting the employee number of the Employee 3
    emp3.setEmpNo(787);
    //Seting the yearly sallary of the Employee 3
    emp3.setYearlySalary(500000);


    //inisilizing devisions 
    //devision for Apple
    Division appl = new Division("Apple", emp1);
    //devision for Microsoft
    Division mic = new Division("Microsft", emp2);

    //inisilizing departments
    Department dem1 = new Department("Bugatti Rimac Apple Microsoft", emp3, appl, mic);
 
    //printing the resoults
    dem1.print();


}

}
