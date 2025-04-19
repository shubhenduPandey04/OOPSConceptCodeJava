package oops.aggregation;

import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name,String specialization,List<Patient> patients){
        this.name = name;
        this.specialization = specialization;
        this.patients = patients;
    }

    public void showPatients(){
        System.out.println("Doctor: " + name + " [" + specialization + "]" );
        for(Patient p : patients){
            System.out.println(" - "+ p.getDetails());
        }
    }

    public int getPatientCount(){
        return patients.size();
    }
}
