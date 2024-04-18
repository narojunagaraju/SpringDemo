package demo;

public class Doctor implements Staff {
    private String qualification;


    public Doctor(java.lang.String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor assisting...");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
