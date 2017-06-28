package hello.com.tiagophotoblog.repositories;

import hello.com.tiagophotoblog.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
    public BlogPost findByFriendlyUrl(String friendlyUrl);
}
