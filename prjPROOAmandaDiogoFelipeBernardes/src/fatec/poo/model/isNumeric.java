
package fatec.poo.model;


public class isNumeric {
    private String str;

    public isNumeric(String str) {
        this.str = str;
    }
    
    
    static public boolean isNumeric(String str)  
    {  
        try  
        {  
          double d = Double.parseDouble(str);  
        }  
        catch(NumberFormatException nfe)  
        {  
          return false;  
        }  
        return true;  
    }
}
