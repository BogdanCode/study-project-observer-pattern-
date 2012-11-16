package pl.radziejewski.observer;

/**
 *
 * @author Tomasz Radziejewski <tomasz@radziejewski.pl>
 */
public class BlogReader implements BlogObserver{

    @Override
    public void doUpdate(String blogPost) {
        System.out.println("BlogReader just read: " + blogPost);
        BlogSystemExample.firstNotification.append("New post added: " + blogPost + "\n");
    }

}
