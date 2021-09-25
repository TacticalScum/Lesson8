package HomeWork8;

    public class Cat implements Moving {

        private static final String type = "Кот";
        private int catRunDistance;
        private int catJumpHeight;
        private String catName;

        public Cat(String name, int catRunDistance, int catJumpHeight) {
            this.catRunDistance = catRunDistance;
            this.catJumpHeight = catJumpHeight;
            this.catName = name;
            if (this.catJumpHeight < 0) {
                this.catJumpHeight = 0;
            }
            moving();
        }

        @Override
        public boolean competitorRun(Obstacle obstacle) {
            if (this.catRunDistance < 0) {
                this.catRunDistance = 0;
            }
            if (this.catRunDistance < obstacle.getObstacleDistance()) {
                System.out.printf("%s %s не смог пробежать %s длиной %d\n", type, this.catName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
                return false;
            } else if (this.catRunDistance >= obstacle.getObstacleDistance())
                System.out.printf("%s %s пробежал %s длиной %d\n", type, this.catName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
            return true;
        }

        @Override
        public boolean competitorJump(Obstacle obstacle) {
            if (this.catJumpHeight < obstacle.getObstacleDistance()) {
                System.out.printf("%s %s не смог перепрыгнуть %s высотой %d\n", type, this.catName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
                return false;
            } else if (this.catJumpHeight >= obstacle.getObstacleDistance()) {
                System.out.printf("%s %s перепрыгнул %s высотой %d\n", type, this.catName, obstacle.getObstacleType(), obstacle.getObstacleDistance());
                return true;
            }
            return true;
        }

        @Override
        public void moving() {
            System.out.printf("%s %s умеет бегать\n", type, this.catName);
            System.out.printf("%s %s умеет прыгать\n", type, this.catName);
            System.out.println(" ");
        }
    }