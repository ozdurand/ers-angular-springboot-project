package com.datajabs.ersproject.entity;



import lombok.Data;
import org.springframework.beans.factory.annotation.Value;


import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "reimbursement")
@Data
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    
    private Long id;


    @Size(min = 4, max = 100)
    @Column(name = "description")
    private String description;


    @Positive
    @Column(name = "amount")
    private BigDecimal amount;


    @PastOrPresent
    @Column(name = "date_created")
    private LocalDate dateCreated;


    @Column(name = "status")
    private String status;

    @ManyToOne
    private Employee employee;

}
