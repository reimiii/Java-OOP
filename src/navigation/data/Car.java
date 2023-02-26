package navigation.data;

public interface Car extends HasBrand, IsMain {
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }
}
