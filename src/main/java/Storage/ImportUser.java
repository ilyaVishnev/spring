package Storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ImportUser {

    private Storage storage;

    @Autowired
    public ImportUser(Storage storage) {
        this.storage = storage;
    }

    public void addUser(User user) {
        storage.add(user);
    }

    public Storage getStorage() {
        return storage;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        ImportUser importUser = applicationContext.getBean(ImportUser.class);
        importUser.getStorage().setParameters("users","postgres","pobeda");
        importUser.getStorage().add(new User("philip"));
    }
}
