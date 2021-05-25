package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.CandidateService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.CandidateDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Candidate;

public class CandidateManager implements CandidateService{

private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}
	
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("İş arayan kayıt edildi.");
	}
}
