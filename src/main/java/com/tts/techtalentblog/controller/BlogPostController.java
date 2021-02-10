package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.model.BlogPost;
import com.tts.techtalentblog.repo.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {


    // @Autowired allows us to implement whats known as dependency injection
    // Dependency injection allows us to give certain objects the dependencies that it needs


    //@Autowired
    private BlogPostRepository blogPostRepository;


    // below is a constructor based dependency injection
    // if you only have one dependency, this is considered the best practice
    public BlogPostController(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }



    @GetMapping(value = "/")
    public String index(BlogPost blogPost) {
        // since we are utilizing thymeleaf
        // our output will generated in a template
        // returning a reference to said template
        //will allow us to show the data that we want
        return "blogpost/index";
    }

    @PostMapping("/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);


        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());

        return  "blogpost/result";


    }

}
