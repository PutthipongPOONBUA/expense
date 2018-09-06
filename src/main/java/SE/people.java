package SE;

public class people {
    private String fname;
    private String lname;

    public people(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString(){
        return "Name: "+getFname()+" Lastname: "+getLname();
    }
}
