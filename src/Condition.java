abstract class Condition {
    private boolean isSick;
    private boolean canWork;

    public boolean getSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public boolean getCanWork() {
        return canWork;
    }

    public void setCanWork(boolean canWork) {
        this.canWork = canWork;
    }
}
