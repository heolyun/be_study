package be_study.quiz.Test01;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VilageFcstDAO {

    public void insert(VilageFcstDTO dto) {

        String sql = """
            INSERT INTO vilage_fcst
            (base_date, base_time, category,
             fcst_date, fcst_time, fcst_value, nx, ny)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
        """;

        try (Connection conn = DBConnectionManager.connectDB();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dto.getBaseDate());
            ps.setString(2, dto.getBaseTime());
            ps.setString(3, dto.getCategory());
            ps.setString(4, dto.getFcstDate());
            ps.setString(5, dto.getFcstTime());
            ps.setString(6, dto.getFcstValue());
            ps.setInt(7, dto.getNx());
            ps.setInt(8, dto.getNy());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
