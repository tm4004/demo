public class BadDriver extends Driver {

    protected BadDriver(Tracker tracker) {
        super(tracker);
    }

    @Override
    protected int preferredSpeed() {
        return 87;
    }
}
