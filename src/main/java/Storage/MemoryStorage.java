package Storage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MemoryStorage implements Storage {

    private List<User> users = new ArrayList();

    public void add(User user) {
        users.add(user);
    }

    @Override
    public List<User> getList() {
        return users;
    }

    @Override
    public void setParameters(String dataBaseName, String user, String password) {

    }
}
