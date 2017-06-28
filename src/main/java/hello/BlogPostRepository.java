package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
    public BlogPost findByFriendlyUrl(String friendlyUrl);
}
