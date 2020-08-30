package com.dddd.mobilekiosk.service;

import com.dddd.mobilekiosk.domain.Menu;
import com.dddd.mobilekiosk.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getMenu(Long id) {
        return menuRepository.findMenusByStoreID(id);
    }
}
