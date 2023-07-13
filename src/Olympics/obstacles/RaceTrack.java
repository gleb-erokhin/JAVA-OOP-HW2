package Olympics.obstacles;

import Olympics.member.Sports;

public class RaceTrack extends Sports{
        int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public int getInfo() {
            return distance;
    }
}
