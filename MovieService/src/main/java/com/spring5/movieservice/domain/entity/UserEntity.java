package com.spring5.movieservice.domain.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Table
public class UserEntity {

    @Id
    private Integer UserId;

    @NotNull(message = "User Name is Required")
    String Name;
    String Password;
    String email;
    String phone;


}
