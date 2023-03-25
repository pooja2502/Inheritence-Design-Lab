
public class Doctor extends HospitalEmployee{
    protected String specialty;
    
    public Doctor(String name, int number, String specialty)
    {
        super(name,number);
        this.specialty = specialty;
    }
    
    // parameterless constructor
    public Doctor()
    {
        
    }
    
    // Specialty Method - Getter
    public String getSpecialty()
    {
        return specialty;
    }
    
    // Specialty Method - Setter
    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }
    
    // Overriding the toString method with specialty variable
    @Override
    public String toString()
    {
        return(name+" "+number+" "+specialty);
    }
    
    @Override
     public void work()
    {
        System.out.println(name+ " works for the hospital. "+name+" is a(n) " +specialty+" doctor.");
    }
}
