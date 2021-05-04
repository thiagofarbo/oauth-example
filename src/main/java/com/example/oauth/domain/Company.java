package com.example.oauth.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "company")
public class Company {

    @Id
    private String id;

    private String name;

    private String address;

    private String phone;
}
