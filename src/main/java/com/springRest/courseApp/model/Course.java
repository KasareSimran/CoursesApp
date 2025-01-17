package com.springRest.courseApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
public class Course {

    @Id
    private long id;
    private String title;
    private String description;


}
