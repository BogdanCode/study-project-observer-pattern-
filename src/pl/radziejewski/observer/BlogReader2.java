package pl.radziejewski.observer;

/**
 *
 * @author Tomasz Radziejewski <tomasz@radziejewski.pl>
 */
public class BlogReader2 implements BlogObserver{

    @Override
    public void doUpdate(String blogPost) {
        System.out.println("BlogReade2 just read: " + blogPost);
        BlogSystemExample.thirdNotification.append("New post added: " + blogPost + "\n");
    }

}
