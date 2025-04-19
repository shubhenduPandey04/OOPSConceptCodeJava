package oops.aggregation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        var engine = new Engine();
//        var hondaCity = new Car(engine);
//        hondaCity.drive();


        //Example 2:
        //Ye ek nested Has-A relationship banega:
        //University → has-a → Department
        //Department → has-a → List of Professor

//        Professor p1 = new Professor("Dr. Sharma");
//        Professor p2 = new Professor("Dr. Pandey");
//        Department csdept = new Department("Computer Science", Arrays.asList(p1, p2));
//        University university = new University("KIIT University",csdept);
//        university.showUniversityInfo();

//        Example 3:
//        Hospital
//            └── Doctors (List)
//                  └── Patients (List)

        // Patients
        Patient p1 = new Patient("Rohan", 25, "Fever");
        Patient p2 = new Patient("Simran", 30, "Diabetes");
        Patient p3 = new Patient("Raj", 40, "Heart Issue");
        Patient p4 = new Patient("Anjali", 22, "Cold");
        Patient p5 = new Patient("Kabir", 35, "Blood Pressure");

        // Doctors
        Doctor d1 = new Doctor("Dr. Mehta", "General Physician", Arrays.asList(p1, p2));
        Doctor d2 = new Doctor("Dr. Sharma", "Cardiologist", Arrays.asList(p3));
        Doctor d3 = new Doctor("Dr. Khan", "ENT Specialist", Arrays.asList(p4, p5));

        // Hospital
        Hospital hospital = new Hospital("City Hospital", Arrays.asList(d1, d2, d3));

        // Display data
        hospital.showHospitalData();

        //count total patients
        System.out.println("Total Patients in Hospital: " + hospital.getTotalPatients());

    }
}
