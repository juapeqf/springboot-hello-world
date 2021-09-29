package com.frontbackend.springboot.api;

import com.frontbackend.springboot.models.User;
import com.frontbackend.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller // This means that this class is a Controller
@RequestMapping(path="/api/user") // This means URL's start with /user (after Application path)
public class UserController {
  
  @Autowired
  UserService userService;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
 
    return userService.addUser(name, email);

  }

  @PostMapping(path="/addBody") // Map ONLY POST Requests
  public @ResponseBody String addNewUser2 (@RequestBody User user) {

    return userService.addUser(user.getName(), user.getEmail());

  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userService.allUsers();
  }

  @DeleteMapping(path = "/delete")
  public @ResponseBody String deleteById(@RequestBody Integer idUser){

    userService.deleteById(idUser);

    return "deleted";

  }
  // @DeleteMapping(path = "/user/{id}")
  // public @ResponseBody String delete (@PathVariable("id") Integer id) {
    
  //   Optional<User> user = userRepository.findById(id);

  //   return userService.deleteUser(user);
  // }
}
