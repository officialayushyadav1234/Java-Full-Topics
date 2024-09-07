public abstract class Bank {
    
    String name;
    String ifsc;
    Bank()
    {

    }
    Bank(String name,String ifsc){
        this.name = name;
        this.ifsc = ifsc;
    }
}
