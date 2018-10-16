package Storage;

import java.util.List;

public interface Storage {
    public void add(User user);

    public List<User> getList();

    public void setParameters(String dataBaseName, String user, String password);
}
