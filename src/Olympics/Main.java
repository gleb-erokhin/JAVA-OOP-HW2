package Olympics;

import Olympics.member.*;
import Olympics.obstacles.RaceTrack;
import Olympics.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Participants[] members = {
                new Human("Вова", 200, 200 ),
                new Robot("Джек", 200, 100 ),
                new Cat("Киса", 100, 100 ),
        };
        Sports[] obstractCourse = {
                new Wall(150),
                new RaceTrack(200),
                new Wall(110),
                new RaceTrack(50),
                new Wall(50),
                new RaceTrack(300)
        };

        for (Participants s : members) {
            System.out.println("К выполнению упражнения приступает " + s.hello());
            for (Sports o : obstractCourse) {
                if (o instanceof Wall) {
                    if (!s.jump(o.getInfo())) break;
                }
                else {
                    if(!s.run(o.getInfo())) break;
                }
            }
            System.out.println();
        }
    }
}