package Users;
import Coordinates.Coordinate;

/**
 * Created by Deniz Alkislar on 23.01.2017.
 */
public class User
{
    // properties
    private String userName;
    private String password;
    private String phoneNumber;
    private String mailAdress;
    private Coordinate userLocation; // variable type will be decided later, after handling GPS location

    // constructor
    public User (String userName, String password, String phoneNumber, String mailAdress, Coordinate userLocation)
    {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.mailAdress = mailAdress;
        this.userLocation = userLocation;
    }

    // methods
    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getMailAdress()
    {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress)
    {
        this.mailAdress = mailAdress;
    }

    public Coordinate getUserLocation()
    {
        return userLocation;
    }

    public void setUserLocation(Coordinate userLocation)
    {
        this.userLocation = userLocation;
    }
}


