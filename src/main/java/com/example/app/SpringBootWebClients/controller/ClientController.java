package com.example.app.SpringBootWebClients.controller;
import com.example.app.SpringBootWebClients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClientController {
    @Autowired
    ClientService service;

    //Todo: Логика такая, мы вытягиваем информацию из бд и по id подставляем данные под фото.
    @GetMapping
    public String getAllInfo(Model model) {
        String allInfo = service.getAllInfo();
        model.addAttribute("message", allInfo);
        return "home";
    }
}

