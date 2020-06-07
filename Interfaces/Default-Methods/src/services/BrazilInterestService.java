package services;


public class BrazilInterestService implements InterestService {

    private Double interestRate;

    public BrazilInterestService(Double InterestRate) {
        this.interestRate = InterestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
    
    
    
}
