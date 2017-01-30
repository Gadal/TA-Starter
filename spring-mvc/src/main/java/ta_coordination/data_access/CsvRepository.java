package ta_coordination.data_access;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import ta_coordination.model.Applicant;

@Component
public class CsvRepository implements ApplicantRepository {
	
	private final List<Applicant> applicants;
	
	public CsvRepository(@Value("${data.source}") String dataPath) {
		List<Applicant> _applicants = null;
		try {
			String absolutePath = getClass().getClassLoader().getResource(dataPath).getFile();
			_applicants = Files
					.readAllLines(new File(absolutePath).toPath())
					.stream()
					.map(this::parseCsvStringToApplicant)
					.filter(x -> null != x)
					.collect(Collectors.toList());
		} catch (IOException e) {
			_applicants = new ArrayList<Applicant>();
		}
		applicants = _applicants;
	}
	
	public List<Applicant> getApplicants() {
		return this.applicants;
	}
	
	private Applicant parseCsvStringToApplicant(String csvString) {
		List<String> fields = Arrays.asList(csvString.split(","));
		if (fields.size() == 9) {
			Applicant applicant = new Applicant();
			applicant.studentNumber = fields.get(0);
			applicant.names = Arrays.asList(fields.get(1).split(" "));
			applicant.phoneNumber = fields.get(2);
			applicant.department = fields.get(3);
			applicant.program = fields.get(4);
			applicant.year = fields.get(5);
			applicant.workStatus = fields.get(6);
			applicant.workStatusExplanation = fields.get(7);
			applicant.applicationDate = fields.get(8);
			return applicant;
		}
		else {
			return null;
		}
	}
}
