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

    public String hello() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDist() {
        return maxRunDist;
    }

    public void setMaxRunDist(int maxRunDist) {
        this.maxRunDist = maxRunDist;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(int dist) {
        if (maxRunDist >= dist) {
            System.out.println(name + " - пребежал дистанцию " + dist + " метров");
            return true;
        }
        else {
            System.out.println(name + " - не пребежал дистанцию " + dist + " метров");
            return false;
        }
    }

    public boolean jump(int height) {
        if (maxJumpHeight >= height ) {
            System.out.println(name + " - смог перепрыгнуть высоту " + height + " метров");
            return true;
        }
        else {
            System.out.println(name + " - не смог перепрыгнуть высоту " + height + " метров");
            return false;
        }
    }
}
