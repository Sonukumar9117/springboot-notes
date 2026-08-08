package com.practice.demo.dto;

import com.practice.demo.annotations.ValidAge;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private String id;
    @NotBlank(message = "Name is required field")
    @Size(min = 3,message = "Name must have more than two characters")
    private String name;
    @NotNull(message = "Email is required field.")
    @Email(message = "Invalid email.")
    private String email;
    @ValidAge(message = "Age is not valid please enter valid message")
    private Integer age;
    private boolean isActive;
    private LocalDate dateOfJoining;
}
