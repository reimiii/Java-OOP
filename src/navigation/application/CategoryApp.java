package navigation.application;

import navigation.annotation.Fancy;
import navigation.data.Category;

@Fancy(name = "Hilmi", tags = {"Tinggi", "Ganteng"})
public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("02");
        category.setId(null);

        System.out.println(category.getId());
    }
}
