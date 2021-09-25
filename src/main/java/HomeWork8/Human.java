package HomeWork8;

public class Human implements Moving {

    private final String type = "Человек";
    private int humanRunDistance;
    private int humanJumpHeight;
    private String humanName;

    public Human(String name, int humanRunDistance, int humanJumpHeight) {
        this.humanRunDistance = humanRunDistance;
        this.humanJumpHeight = humanJumpHeight;
        this.humanName = name;
        if (this.humanJumpHeight < 0) {
            this.humanJumpHeight = 0;
        }
        moving();
    }

    @Override
    public boolean competitorRun(Obstacle obstacle) {
        if (this.humanRunDistance < 0) {
            this.humanRunDistance = 0;
        }
        if (this.humanRunDistance < obstacle.getObstacleDistance()) {
            System.out.printf("%s %s не смог пробежать %s длиной %d\n", type, this.humanName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return false;
        } else if (this.humanRunDistance >= obstacle.getObstacleDistance())
            System.out.printf("%s %s пробежал %s длиной %d\n", type, this.humanName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
        return true;
    }

    @Override
    public boolean competitorJump(Obstacle obstacle) {
        if (this.humanJumpHeight < obstacle.getObstacleDistance()) {
            System.out.printf("%s %s не смог перепрыгнуть %s высотой %d\n", type, this.humanName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return false;
        } else if (this.humanJumpHeight >= obstacle.getObstacleDistance()) {
            System.out.printf("%s %s перепрыгнул %s высотой %d\n", type, this.humanName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return true;
        }
        return true;
    }

    @Override
    public void moving() {
        System.out.printf("%s %s умеет бегать\n", type, this.humanName);
        System.out.printf("%s %s умеет прыгать\n", type, this.humanName);
        System.out.println(" ");
    }
}