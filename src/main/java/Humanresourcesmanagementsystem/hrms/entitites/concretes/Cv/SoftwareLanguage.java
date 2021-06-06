package Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Candidate;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="software_languages")
public class SoftwareLanguage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "used_languages")
    private String usedLanguages;
    
    @ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

    
}
