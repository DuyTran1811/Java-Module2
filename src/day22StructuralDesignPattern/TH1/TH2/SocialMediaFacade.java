package day22StructuralDesignPattern.TH1.TH2;

import java.util.LinkedList;

public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedList) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedList;
    }
    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
}
