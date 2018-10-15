package Annot;

import org.springframework.stereotype.Component;

@Component
public class JdbcStorageA implements Storage {
    public void add() {
        System.out.println("dataBase");
    }
}
