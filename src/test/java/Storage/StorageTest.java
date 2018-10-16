package Storage;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.core.Is.is;

public class StorageTest {

    @Test
    public void whenAddUserGetResult() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-contextTest.xml");
        ImportUser importUser = context.getBean(ImportUser.class);
        importUser.addUser(new User("ilya"));
        Assert.assertThat(importUser.getStorage().getList().get(0).toString(), is("ilya"));
    }
}
