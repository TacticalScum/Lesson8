package HomeWork8;

public class HomeWork8 {

    public static void main(String[] args) {

        Moving[] movings = {
                new Human("Игорь", 1, 1),
                new Cat("Мужик", 8, 3),
                new Robot("Карл", 10, 2)
        };

        Obstacle[] obstacles = {
                new Treadmill(2),
                new Wall(1),
                new Treadmill(5),
                new Wall(3),
                new Treadmill(10),
        };

        for (Moving moving : movings) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    if (!moving.competitorJump(obstacle)) {
                        break;
                    }
                } else if (obstacle instanceof Treadmill) {
                    if (!moving.competitorRun(obstacle)) {
                        break;
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
