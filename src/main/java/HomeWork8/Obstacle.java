package HomeWork8;

public class Obstacle {

    protected int obstacleDistance;
    protected final String type;

    public Obstacle(int obstacleDistance, String type) {
        this.type = type;
        this.obstacleDistance = obstacleDistance;
        if (obstacleDistance < 0) {
            this.obstacleDistance = 0;
        }
    }

    public int getObstacleDistance() {
        return obstacleDistance;
    }

    public String getObstacleType() {
        return this.type;
    }
}
