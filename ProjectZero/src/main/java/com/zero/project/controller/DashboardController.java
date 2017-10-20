package com.zero.project.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DashboardController.java.
 *
 * @author Shaun Lavelle.
 * @version 1.0
 */
@Controller
public class DashboardController {

  @RequestMapping(value={"", "/", "/Dashboard"})
  public String dashboard(Map<String, Object> model) {
    return "index";
  }
}
