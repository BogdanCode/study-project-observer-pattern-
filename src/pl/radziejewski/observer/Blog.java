package pl.radziejewski.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Tomasz Radziejewski <tomasz@radziejewski.pl>
 */
public class Blog implements BlogObservable{
    Set<BlogObserver> blogObservers;
    String blogPost;
    
    public Blog(String blogPost){
        blogObservers = new HashSet<BlogObserver>();
        this.blogPost = blogPost;
    }

    @Override
    public void addObserver(BlogObserver blogObserver) {
        blogObservers.add(blogObserver);
    }

    @Override
    public void removeObserver(BlogObserver blogObserver) {
        blogObservers.remove(blogObserver);
    }

    @Override
    public void notifyObserver() {
        Iterator<BlogObserver> it = blogObservers.iterator();
        
        while(it.hasNext()){
            BlogObserver blogObserver = it.next();
            blogObserver.doUpdate(blogPost);
        }
    }
    
    public void createPost(String newPost){
        System.out.println("\nNew post on blog just released: " + newPost);
        blogPost = newPost;
        notifyObserver();
    }
    
}
