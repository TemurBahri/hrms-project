package Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employee;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="foreign_languages")
public class ForeignLanguage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne()
    @JoinColumn(name="id")
    private Employee employee;

    @Column(name = "language")
    private String language;
    
    @ManyToOne
    @JoinColumn( name = "job_seeker_id")
    private JobSeeker jobSeekers;

}
