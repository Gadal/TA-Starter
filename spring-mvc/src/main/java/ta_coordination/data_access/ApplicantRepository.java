package ta_coordination.data_access;

import java.util.List;

import ta_coordination.model.Applicant;

public interface ApplicantRepository {

	public List<Applicant> getApplicants();
}
