package kr.co.firstspring.cli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    private int id;
    @NonNull
    private String username;
    @NonNull private String password;

    public Member(ResultSet resultSet) {
        try {
            this.id = resultSet.getInt("id");
            this.username = resultSet.getString("username");
            this.password = resultSet.getString("password");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public String toString() {
        return "id = " + this.id + ", username = " + this.username + ", password = " + this.password;
    }
}
