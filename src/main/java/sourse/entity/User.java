package sourse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import sourse.core.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Table(name = "users")
public class User extends BaseEntity {
String firstName;
String lastName;
@Column(unique = true, nullable = false)
@Email
String email;
String password;
String phone;
Set<String>roles;
String project;
String team;

}
