package com.dddd.mobilekiosk.controller;

import com.dddd.mobilekiosk.domain.Menu;
import com.dddd.mobilekiosk.repository.MenuRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class MenuControllerTest {
    @Autowired
    private MenuController menuController;
    @Autowired
    private MenuRepository menuRepository;

    private MockMvc mockMvc;

    @BeforeEach
    void beforeEach(){
        mockMvc = MockMvcBuilders.standaloneSetup(menuController).build();
    }

    @Test
    void getMenuController() throws Exception {

        givenMenu(1L, 1L, "americano", 4200, "americano", "https://www.naver.com/1", "hot coffee");
        givenMenu(2L, 2L, "latte", 5300, "coffee latte", "https://www.google.com/1", "hot lattee");
        givenMenu(3L, 2L, "strawberry", 4200, "juice", "https://www.dddd.com/1", "ice juice");

        mockMvc.perform(
                MockMvcRequestBuilders.get("/menu/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    public void givenMenu(Long id, Long store_Id, String name, int price, String category, String picture, String detail){
        Menu menu = new Menu();

        menu.setId(id);
        menu.setStoreID(store_Id);
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategory(category);
        menu.setPicture(picture);
        menu.setDetail(detail);

        menuRepository.save(menu);
    }

}