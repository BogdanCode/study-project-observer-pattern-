package pl.radziejewski.observer;

/**
 *
 * @author Tomasz Radziejewski <tomasz@radziejewski.pl>
 */
public interface BlogObservable {
    public void addObserver(BlogObserver blogObserver);
    public void removeObserver(BlogObserver blogObserver);
    public void notifyObserver();
}
