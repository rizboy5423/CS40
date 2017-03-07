
public class Email
{
    private static final String Domain = "school.net";

    public Email()
    {

    }

    public String createEmailAddress(String first, String last)
    {
        char initial = first.charAt(0);
        String email = initial + last + "@" + Domain;
        return email.toLowerCase();

    }

    public Boolean isValid(String emailAddress)
    {
        int posAt = emailAddress.indexOf('@');
        if(posAt<1)
        {
            return false;
        }

        String check = ("!#$%^&*()-+=}{[]|\"':;<>?/,");

        for(int a = 0; a < check.length(); a++)
        {
            char b = check.charAt(a);
            int c = emailAddress.indexOf(b);
            if(c > -1)
            {
                return false;
                
            }
        }
       

        String domain = emailAddress.substring(posAt+1);
        if(domain.equals(Domain))
        {
            return true;
        }

        return false;

    }
}

