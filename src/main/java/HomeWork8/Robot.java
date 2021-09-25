package HomeWork8;

public class Robot implements Moving {

    private static final String type = "Робот";
    private int robotRunDistance;
    private int robotJumpHeight;
    private String robotName;

    public Robot(String name, int robotRunDistance, int robotJumpHeight) {
        this.robotRunDistance = robotRunDistance;
        this.robotJumpHeight = robotJumpHeight;
        this.robotName = name;
        if (this.robotJumpHeight < 0) {
            this.robotJumpHeight = 0;
        }
        moving();
    }

    @Override
    public boolean competitorRun(Obstacle obstacle) {
        if (this.robotRunDistance < 0) {
            this.robotRunDistance = 0;
        }
        if (this.robotRunDistance < obstacle.getObstacleDistance()) {
            System.out.printf("%s %s не смог пробежать %s длиной %d\n", type, this.robotName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return false;
        } else if (this.robotRunDistance >= obstacle.getObstacleDistance())
            System.out.printf("%s %s пробежал %s длиной %d\n", type, this.robotName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
        return true;
    }

    @Override
    public boolean competitorJump(Obstacle obstacle) {
        if (this.robotJumpHeight < obstacle.getObstacleDistance()) {
            System.out.printf("%s %s не смог перепрыгнуть %s высотой %d\n", type, this.robotName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return false;
        } else if (this.robotJumpHeight >= obstacle.getObstacleDistance()) {
            System.out.printf("%s %s перепрыгнул %s высотой %d\n", type, this.robotName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return true;
        }
        return true;
    }

    @Override
    public void moving() {
        System.out.printf("%s %s умеет бегать\n", type, this.robotName);
        System.out.printf("%s %s умеет прыгать\n", type, this.robotName);
        System.out.println(" ");
    }
}
