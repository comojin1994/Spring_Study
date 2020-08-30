package com.dddd.mobilekiosk.controller;

import com.dddd.mobilekiosk.domain.Menu;
import com.dddd.mobilekiosk.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu/{store_ID}")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getMenu(@PathVariable Long store_ID){
        return menuService.getMenu(store_ID);
    }
}
