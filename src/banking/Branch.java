package banking;

public class Branch {
    private int branchCode;
    private String city;
    private GradeType grade;

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setGrade(GradeType grade) {
        this.grade = grade;
    }

    public GradeType getGrade() {
        return grade;
    }

    public String toString(){
        return "Your bank is in city \""+this.city+"\" with branch code "+this.branchCode + " that is a grade "+this.grade.getValue()+" bank.";
    }
}
