package com.javatechie.jpa.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CenterId;
    @NotBlank(message = "Center Name Must not be blank")
    @Size(max = 40, message = "Center Name must not exceed 40 character")
    private String CenterName;
    @Email
    @NotBlank(message = "Contact Email Must not be blank")
    private String ContactEmail;
    @NotBlank(message = "Contact phone Must not be blank")
    @Size(min = 10, max = 10, message = "Phone should be exact 10 in length")
    private String ContactPhone;
    @NotBlank(message = "Center Code Must not be blank")
    @Size(min=12, max = 12, message = "Center code must be exact 12 alphanumeric character")
    private String CenterCode;
    @NotNull(message = "Student Capacity cannot be Null")
    private int StudentCapacity;
    public Long CreatedOn=System.currentTimeMillis();
    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="t_Id",referencedColumnName = "CenterId")
    private List<Address> addresses;
    @OneToMany(targetEntity = Courses.class, cascade = CascadeType.ALL)
    @JoinColumn(name="t_id1", referencedColumnName = "CenterId")
    private List<Courses> courses;
}
