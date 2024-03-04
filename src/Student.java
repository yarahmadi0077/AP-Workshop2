public class Student {

    private String stdFirstName ;
    private String stdLastName ;
    private String stdId ;
    private String stdGrade ;

    public Student(String stdFirstName, String stdLastName, String stdId, String stdGrade) {
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
        this.stdId = stdId;
        if(stdId.length() != 7){
            this.stdId = "invalid idCode!!" ;
        }
        this.stdGrade = stdGrade;
        if(Integer.valueOf(stdGrade) > 20 || Integer.valueOf(stdGrade) < 0 ){
            this.stdGrade = "invalid grade !!" ;
        }
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    public String getStdId() {
        if(stdId.length() != 7){
            System.out.println("invalid idCode!!!!");

        }
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getStdGrade() {
        return stdGrade;
    }

    public void setStdGrade(String stdGrade) {
        if(Integer.valueOf(stdGrade) > 20 || Integer.valueOf(stdGrade) < 0 ){
            this.stdGrade = "invalid grade !!" ;
        }
        this.stdGrade = stdGrade;
    }
    public void printInfo(){
        System.out.println(stdFirstName + " " + stdLastName + " " + stdGrade + " " + stdId);
    }
}
