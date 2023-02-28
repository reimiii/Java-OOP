package navigation.application;

import navigation.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectionDatabase("admin", "null");
        System.out.println("Success");
    }

    public static void connectionDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa akses database");
        }
    }
}
