package services;


public class UsaInterestService implements InterestService {

    private Double interestRate;

    public UsaInterestService(Double InterestRate) {
        this.interestRate = InterestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
    
    
    
}
