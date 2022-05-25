package gr.aueb.sweng22.team04.memorydao;

import java.util.ArrayList;

import gr.aueb.sweng22.team04.dao.CandidateDAO;
import gr.aueb.sweng22.team04.model.Candidate;

public class CandidateDAOMemory implements CandidateDAO {
    protected static ArrayList<Candidate> candidateEntities = new ArrayList<Candidate>();

    @Override
    public void addCandidate(Candidate entity) {
        candidateEntities.add(entity);
    }

    @Override
    public Candidate findCandidate(String email, String password) {
        System.out.println(candidateEntities.size());
        for (Candidate candidate : candidateEntities){
            if (candidate.getEmail().equals(email) && candidate.getPassword().equals(password)) {
                return candidate;
            }
        }
        return null;
    }
}