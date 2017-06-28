package hello.com.tiagophotoblog.controllers;

import hello.com.tiagophotoblog.model.BlogPost;
import hello.com.tiagophotoblog.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private BlogPostRepository repository;

    @GetMapping
    public String get(Model model) {

        List<BlogPost> postList = repository.findAll();
        model.addAttribute("postList", postList);

        return "posts/postList";
    }

    @GetMapping("/{friendlyUrl}")
    public String get(@PathVariable String friendlyUrl, Model model) {

        BlogPost post = repository.findByFriendlyUrl(friendlyUrl);
        model.addAttribute("post", post);

        return "posts/post";
    }

}