package Annot;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class MemoryStorageA implements Storage {

    public void add() {
        System.out.println("memory");
    }
}
