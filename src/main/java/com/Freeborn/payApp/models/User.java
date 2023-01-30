package com.Freeborn.payApp.models;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Generated;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String id;
    @NotNull(message = "this field is required")
    private String firstName;
    @NotNull(message = "this field is required")
    private String lastName;
    private String password;
    private String email;
}
