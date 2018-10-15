package Xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {

    @Test
    public void WhenAddUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        ImportUser importUser=applicationContext.getBean(ImportUser.class);
        importUser.addUser();
    }

}
