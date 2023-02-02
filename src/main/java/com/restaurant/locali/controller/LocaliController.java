package com.restaurant.locali.controller;

import com.restaurant.locali.entities.LocaliEntity;
import com.restaurant.locali.repositories.LocaliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/locali")
public class LocaliController {

    @Autowired
    private LocaliRepository localiRepository;

    @GetMapping("/getLocali")
    public List<LocaliEntity> getArticles() {
        return localiRepository.findAll();
    }
}
