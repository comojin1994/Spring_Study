package kr.co.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.ResultSet;
import java.sql.SQLException;

@ToString
@Getter
@Setter
public class Member {
    private int id;
    private String username;
    private String password;

    public Member(ResultSet resultSet){
        try {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
