
import com.mycompany.rmispringserver.daos.Dao;
import com.mycompany.rmispringserver.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        Dao dao = (Dao) context.getBean("factory");
        System.out.println(""+  dao.getSalary(new  User(1, "ds", 12, 1000)));
    }
}
