package navigation.data;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("02");
        category.setId(null);

        System.out.println(category.getId());
    }
}
