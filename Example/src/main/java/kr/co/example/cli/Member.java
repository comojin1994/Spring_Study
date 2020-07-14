package kr.co.example.cli;

import lombok.*;

import java.sql.ResultSet;
import java.sql.SQLException;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Member {
    private int id;
    @NonNull private String username;
    @NonNull private String password;

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
