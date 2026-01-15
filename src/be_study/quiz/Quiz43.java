package be_study.quiz;

import java.sql.*;
import java.util.*;

class Professor {
    int profno;
    String name;
    String id;
    String position;
    int pay;
    int deptno;
}

public class Quiz43 {

    public static List<Professor> findProfessorListByDeptno(int deptno) {

        List<Professor> list = new ArrayList<>();

        String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
        String user = "scott";
        String password = "tiger";

        String sql =
            "SELECT profno, name, id, position, pay, deptno " +
            "FROM professor " +
            "WHERE deptno = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setInt(1, deptno);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Professor p = new Professor();
                p.profno = rs.getInt("profno");
                p.name = rs.getString("name");
                p.id = rs.getString("id");
                p.position = rs.getString("position");
                p.pay = rs.getInt("pay");
                p.deptno = rs.getInt("deptno");

                list.add(p);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    public static void main(String[] args) {

        int deptno = 102; 

        List<Professor> list = findProfessorListByDeptno(deptno);

        for (Professor p : list) {
            System.out.println(
                p.profno + " " +
                p.name + " " +
                p.id + " " +
                p.position + " " +
                p.pay + " " +
                p.deptno
            );
        }
    }
}
