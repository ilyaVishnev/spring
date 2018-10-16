package Annot;

import Xml.ImportUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotTest {

    @Test
    public void WhenAddUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-contextTest.xml");
        ImportUserA importUser=applicationContext.getBean(ImportUserA.class);
        importUser.addUser();
    }
}
