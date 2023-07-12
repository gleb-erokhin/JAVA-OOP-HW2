package Olympics.member;

public class Participants {
    protected  String name;
    protected String type;

    protected int maxRunDist;
    protected int maxJumpHeight;


    public Participants(String name, String type, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.type = type;
        if(type.equals("Кот"))
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public Participants() {
    }

    public void run(int dist) {
        if (maxRunDist <= dist) {
            System.out.println(type + " " + name + " - пребежал дистанцию " + dist + " метров");
        }
        else {
            System.out.println(type  + " " + name + " - не пребежал дистанцию " + dist + " метров");
        }
    }

    protected void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type  + " " + name + " - смог перепрыгнуть высоту " + height + " метров");
        }
        else {
            System.out.println(type  + " " + name + " - не смог перепрыгнуть высоту " + height + " метров");
        }
    }
}
