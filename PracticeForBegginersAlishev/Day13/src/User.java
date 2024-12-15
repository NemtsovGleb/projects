import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean subscribed;
        if(this.subscriptions.contains(user)) {
            subscribed = true;
        } else {
            subscribed = false;
        }
        return subscribed;
    }

    public boolean isFriend(User user) {
        boolean friend;
        if(this.subscriptions.contains(user) & user.getSubscriptions().contains(this)) {
            friend = true;
        } else {
            friend = false;
        }
        return friend;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
