package oops.aggregation;

public class University {
    private String name;
    private Department department;

    public University(String name, Department department){
        this.name=name;
        this.department=department;
    }

    public void showUniversityInfo(){
        System.out.println("University: "+name);
        department.showProfessors();  //Has-A call
    }
}
