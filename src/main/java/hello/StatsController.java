package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private BlogPostRepository repository;

    @GetMapping
    public String get(Model model) {

        List<BlogPost> postList = repository.findAll();
        model.addAttribute("postList", postList);

        return "postList";
    }

    @GetMapping("/{friendlyUrl}")
    public String get(@PathVariable String friendlyUrl, Model model) {

        BlogPost post = repository.findByFriendlyUrl(friendlyUrl);
        model.addAttribute("post", post);


        return "getStats";
    }
}
