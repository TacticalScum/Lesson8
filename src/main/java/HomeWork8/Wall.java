package HomeWork8;

public class Wall extends Obstacle {

    private final static String wallType = "Стена";

    public Wall(int obstacleDistance) {
        super(obstacleDistance, wallType);
    }
}