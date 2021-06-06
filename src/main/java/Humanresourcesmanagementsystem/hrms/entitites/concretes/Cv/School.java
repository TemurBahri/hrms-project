package Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employee;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="schools")
public class School {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "finish_date")
    private LocalDate finishDate;
    
    @ManyToOne()
    @JoinColumn(name="id")
    private Employee employee;
    
    @ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="jobseeker_id")
	private JobSeeker jobseeker;

}
