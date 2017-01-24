package Users;

import Coordinates.Coordinate;

/**
 * Created by Deniz Alkislar on 24.01.2017.
 */
public class Cook extends User
{
    // properties
    private String fullAdress;
    // food menu

    // constructor
    public Cook(String userName, String password, String phoneNumber, String mailAdress, Coordinate userLocation, String fullAdress)
    {
        super(userName, password, phoneNumber, mailAdress, userLocation);
        this.fullAdress = fullAdress;
    }

    // methods

}
