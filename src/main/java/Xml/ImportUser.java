package Xml;

public class ImportUser {

    private Storage storage;

    public ImportUser(Storage storage) {
        this.storage = storage;
    }

    public void addUser() {
        storage.add();
    }
}
