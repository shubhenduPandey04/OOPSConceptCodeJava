package oops.aggregation;

import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name, List<Doctor> doctors){
        this.name = name;
        this.doctors = doctors;
    }

    public void showHospitalData(){
        System.out.println("Hospital: "+name);
        for(Doctor d:doctors){
            d.showPatients();
        }
    }

    public int getTotalPatients(){
        int total = 0;
        for (Doctor doctor : doctors){
            total += doctor.getPatientCount();
        }
        return total;
    }
}
