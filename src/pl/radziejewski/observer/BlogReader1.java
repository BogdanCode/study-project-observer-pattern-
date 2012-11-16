package pl.radziejewski.observer;

/**
 *
 * @author Tomasz Radziejewski <tomasz@radziejewski.pl>
 */
public class BlogReader1 implements BlogObserver{

    @Override
    public void doUpdate(String blogPost) {
        System.out.println("BlogReader1 just read: " + blogPost);
        BlogSystemExample.secondNotification.append("New post added: " + blogPost + "\n");
    }

}
