package src;

public interface Observateur {
    public abstract void observer(Observable observable);
    public abstract void arreterObserver(Observable observable);
}
