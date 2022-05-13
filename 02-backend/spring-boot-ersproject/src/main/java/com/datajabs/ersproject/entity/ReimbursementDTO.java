package com.datajabs.ersproject.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.time.LocalDate;

@Projection(
        name = "dto",
        types = {Reimbursement.class}
)
public interface ReimbursementDTO {

    @Value("#{target.id}")
    long getId();
    String getDescription();
    BigDecimal getAmount();
    LocalDate getDateCreated();
    String getStatus();
    Employee getEmployee();
}
