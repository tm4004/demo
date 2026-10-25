public interface Tracker {
    Position position();
    Position position(long longitude, long latitude);
}
