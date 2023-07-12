package Olympics;

import Olympics.member.Cat;
import Olympics.member.Human;
import Olympics.member.Participants;
import Olympics.member.Robot;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Participants[] members = {
                new Human("Вова", 200, 100 ),
                new Robot("Джек", 200, 100 ),
                new Cat("Киса", 200, 100 ),
        };
    }
}