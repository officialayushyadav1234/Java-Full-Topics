public class Sbi extends Bank {
    
    String gov_scheme;

    Sbi()
    {

    }

    Sbi(String name, String ifsc,String gov_scheme)
    {
        super(name,ifsc);
        this.gov_scheme = gov_scheme;
    }
}
