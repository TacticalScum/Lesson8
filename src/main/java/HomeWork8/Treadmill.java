package HomeWork8;

public class Treadmill extends Obstacle {

    private final static String treadmillType = "Беговая дорожка";

    public Treadmill(int obstacleDistance) {
        super(obstacleDistance, treadmillType);
    }
}