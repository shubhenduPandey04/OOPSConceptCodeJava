package oops.aggregation;

import java.util.List;

public class Department {
    private String deptName;
    private List<Professor> professors;

    public Department(String deptName, List<Professor> professors){
        this.deptName=deptName;
        this.professors=professors;
    }

    public void showProfessors(){
        System.out.println("Department: "+deptName);
        for(Professor prof : professors){
            System.out.println("Professor: "+ prof.getName());
        }
    }
}
