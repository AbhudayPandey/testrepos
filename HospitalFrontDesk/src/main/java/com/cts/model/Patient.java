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
import java.util.Date;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_details")
public class Patient {
	@Id
    private Long pid;
    private String pname;
    private Integer pnumber;
    private String pstatus;
//	@ManyToOne
//	@JoinColumn(name= "sid")
//	private Specialist specialistdetails;
}
