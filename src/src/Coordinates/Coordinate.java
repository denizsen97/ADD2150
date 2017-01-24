package Coordinates;
import java.lang.Math;

/**
 * Created by Deniz Alkislar on 23.01.2017.
 */
public class Coordinate
{
    // properties
    private double latitude; // north and south point
    private double longitude; // east and west point

    // constructors
    public Coordinate(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordinate()
    {
        latitude = 0.0;
        longitude = 0.0;
    }

    // methods
    public double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public double getDistanceBtw(Coordinate secondCoordinate)
    {
        double radius = 6371; // earth's radius in meters

        double lat1 = Math.toRadians(latitude);
        double lat2 = Math.toRadians(secondCoordinate.getLatitude());

        double deltaLat = Math.toRadians(secondCoordinate.getLatitude() - latitude);
        double deltaLong = Math.toRadians(secondCoordinate.getLongitude() - longitude);

        double tmp = Math.sqrt(Math.sin(deltaLat / 2)) + Math.cos(lat1) * Math.cos(lat2) * Math.sqrt(Math.sin(deltaLong / 2));

        double c = 2 * Math.atan2(Math.sqrt(tmp), Math.sqrt(1-  tmp));

        return radius * c;
    }
}
