package kr.co.firstspring.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws ClassNotFoundException {
        logger.info("Hello World!!!");

        ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
        System.out.println(context);
//        Dao dao = new Dao();
//        dao.run();

    }
}
