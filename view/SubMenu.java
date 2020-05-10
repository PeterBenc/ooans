package view;

import java.util.ArrayList;
import java.util.List;

public class SubMenu implements Menu {
    List<Menu> menus = new ArrayList<Menu>();

    @Override
    public void render() {
        for (Menu menu : menus) {
            menu.render();

        }
    }

    public void add(Menu menu) {
        menus.add(menu);

    }

    public void remove(Menu menu) {
        menus.remove(menu);

    }

}


