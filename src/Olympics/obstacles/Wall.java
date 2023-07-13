package Olympics.obstacles;

import Olympics.member.Sports;

public class Wall extends Sports {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getInfo() {
        return height;
    }
}
