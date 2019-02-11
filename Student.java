/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130.week2Inheritance;

/**
 *
 * @author evan.horton
 */
public class Student {
    int age;
    String name;
    String gender;
    int studentId;
    String advisorName;
    String gradeLevel;
    String SchoolName;
}//end class Student

class ElemStudent extends Student {
    String EmergencyContacts;
    String Allergies;
    String Medicines;
    
    
}//end Elementary school student

class MiddleSchoolStudent extends Student {
    

}//end Middle School Student


class HighSchoolStudent extends Student {
    String ClassSchedule;
    String LunchPeriod;
    String AfterSchoolSports;
  
    
    
}//end HighSchool Student


class CollegeStudent extends Student {
    String NewAddress;
    
    
    
}//end College Student
