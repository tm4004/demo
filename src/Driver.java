public abstract class Driver {
    private final Tracker tracker;
    protected Driver(Tracker tracker) {
        this.tracker = tracker;
    }
    public boolean travel(Car car, Position destination) {
        if (car.start()) {
            long startTime = System.currentTimeMillis();
            while (!getMyPosition().equals(destination)) {
                car.drive(preferredSpeed(), 1);
                if (System.currentTimeMillis() - startTime > 1000000000L) {
                    // lost driver
                    car.park();
                    return false;
                }
            }
            // reached destination
            car.park();
            return true;
        } else {
            throw new RuntimeException("Car failed to start");
        }
    }

    private Position getMyPosition() {
        return tracker.position();
    }

    protected abstract int preferredSpeed();
}
