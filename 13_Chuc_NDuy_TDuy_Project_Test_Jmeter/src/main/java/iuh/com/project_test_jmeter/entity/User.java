package iuh.com.project_test_jmeter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users") // Tên bảng trong database
@Data // Tự động tạo getter, setter, toString, equals, hashCode
@NoArgsConstructor // Tự động tạo constructor không tham số
@AllArgsConstructor // Tự động tạo constructor có tất cả tham số
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID tự tăng
    private Long id;

    @Column(nullable = false, unique = true) // Không được null, không được trùng
    private String username;

    @Column(nullable = false) // Không được null
    private String password;
}