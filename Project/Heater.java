
/**
 * William Kong
 * 
 * 
 *
 */
public class Heater
{
    private int min;
    private int max;
    private int increment;
    private int temperature;

    public Heater(int n, int k)
    {
        increment = 5;
        temperature = 15;  
         min = n; 
         max = k;
        }

    public int getTemperature()
    {
        return temperature;
    }
   
    public void warmer()
    {
        temperature += increment;
        if(temperature>max)
        {
            temperature -= increment;
        }
         
    }
    
     public void cooler()
    {
        temperature -= increment;
        
        if(temperature<min)
        {
            temperature += increment;
        }
         
        
    }
    
    public void setIncrement(int amount)
    {
        increment = amount;
    }
}
