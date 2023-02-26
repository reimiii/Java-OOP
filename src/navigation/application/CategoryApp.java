package navigation.application;

import navigation.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("02");
        category.setId(null);

        System.out.println(category.getId());
    }
}
