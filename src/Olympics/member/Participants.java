package Olympics.member;

public class Participants {
    protected  String name;

    protected int maxRunDist;
    protected int maxJumpHeight;


    public Participants(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public Participants() {
    }

    protected void run(int dist) {
        if (dist <= maxRunDist) {
            System.out.println("Участник - " + name + " - пребежал дистанцию " + dist + " метров");
        }
        else {
            System.out.println("Участник - " + name + " - не пребежал дистанцию " + dist + " метров");
        }
    }

    protected void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Участник - " + name + " - смог перепрыгнуть высоту " + height + " метров");
        }
        else {
            System.out.println("Участник - " + name + " - не смог перепрыгнуть высоту " + height + " метров");
        }
    }
}
