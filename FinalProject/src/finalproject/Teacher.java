
package finalproject;

public class Teacher extends Person implements PayRoll{
     //Variables for Teacher
    private String speciality;
    private String degree;
    private double saldegree;
    private int dept_ID;

//    Teacher(int parseInt, String text, int parseInt0, String text0, String text1, String text2, int parseInt1) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    //Setters & Getters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    public void setDegree(String ndegree) {
        this.degree = ndegree;
    }
    
    public String getDegree() {
        return this.degree;
    }

    public int getDept_ID() {
        return dept_ID;
    }

    public void setDept_ID(int dept_ID) {
        this.dept_ID = dept_ID;
    }
    
    //Teacher constructor -> make object Teacher
    public Teacher(int ID, String name, int age, String gender, String speciality, String degree, int dept_ID){
        super(ID, name, age, gender);
        this.speciality = speciality;
        this.degree = degree;
        this.dept_ID = dept_ID;
    }
    //Empty constructor for dean
    public Teacher(){
        
    }
    //Display teacher info
    @Override
    public String toString(){
        return "Id: " + this.getID() + " Name: " + this.getName() + " Age: " + this.getAge() + " Gender: " + this.getGender() + " Speciality: " + speciality + " Degree: " + degree;
    }

    //Implementing Payroll
    @Override
    public double ComputePayRoll() {
        //salaries depending on degree
        int PhdSal = 112;
        int MasterSal = 82;
        int BachelorSal = 42;
        //switch case to calculate different salaries
        if (null != degree)
            switch (degree) {
            case "Phd":
                saldegree = (36 * PhdSal * 2);
                break;
            case "Master":
                saldegree = (36 * MasterSal * 2);
                break;
            case "Bachelor":
                saldegree = (36 * BachelorSal * 2);
                break;
            default:
                break;
        }
        return saldegree;
    }
}