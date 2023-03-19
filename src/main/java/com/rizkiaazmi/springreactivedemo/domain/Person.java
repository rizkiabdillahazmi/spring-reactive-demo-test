package com.rizkiaazmi.springreactivedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
}
