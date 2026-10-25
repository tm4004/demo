public class GoodDriver extends Driver {

    protected GoodDriver(Tracker tracker) {
        super(tracker);
    }

    @Override
    protected int preferredSpeed() {
        return 60;
    }
}
