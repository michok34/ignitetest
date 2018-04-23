package io.choquet.project.controller;


import io.choquet.project.model.User;
import io.choquet.project.persistence.cache.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
//    @Autowired
//    private UserRepository userRepository;

    @Autowired
    private UserRepository userCache;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
//        userRepository.save(n);
        userCache.save(1L, n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
//        return userRepository.findAll();
        return userCache.findAll();
    }
}
