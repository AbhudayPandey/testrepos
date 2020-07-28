package com.cts.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;

import java.io.Serializable;
import java.util.*;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bookappointment")
public class BookAppointment implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;
    private String sname;
    private String pname;
    private String availableday;
    private String availabletime;
}
