package ta_coordination.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ta_coordination.data_access.ApplicantRepository;
import ta_coordination.model.Applicant;

@Controller
public class ApplicantController {
	
	@Autowired
	private ApplicantRepository applicantRepository;

	@RequestMapping("/applicant")
	@ResponseBody
    public List<Applicant> getApplicants(
    		@RequestParam(value="name",          required=false) String name,
    		@RequestParam(value="studentNumber", required=false) String studentNumber) {
        
        return applicantRepository
        		.getApplicants()
        		.stream()
        		.filter(applicant -> null == name          || applicant.names.contains(name))
        		.filter(applicant -> null == studentNumber || applicant.studentNumber.equals(studentNumber))
        		.collect(Collectors.toList());
    }
}
