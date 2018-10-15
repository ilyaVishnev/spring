package Annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ImportUserA {

    private Storage storage;

    @Autowired
    public ImportUserA(Storage storage) {
        this.storage = storage;
    }

    public void addUser() {
        storage.add();
    }
}
