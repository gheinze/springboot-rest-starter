package com.accounted4.amrs.controller;

import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gheinze
 */
@RestController
public class UserController {

  @RequestMapping("/user")
  public Principal user(Principal principal) {
      return principal;
  }


}
