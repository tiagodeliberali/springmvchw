package hello;

import org.springframework.data.annotation.Id;

public class BlogPost {
    @Id
    public String id;

    public String title;
    public String friendlyUrl;
    public String content;

    public BlogPost(String title, String friendlyUrl, String content) {
        this.title = title;
        this.friendlyUrl = friendlyUrl;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "Post[id=%s, title=%s, friendlyUrl=%s]",
                id, title, friendlyUrl);
    }
}
