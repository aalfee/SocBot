public class anger extends emotion {
    private boolean expired = false; 
    public anger(String antecedentConditionName){
        super(antecedentConditionName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEED_VALUE);
    }
    public anger(String antecedentConditionName, int count, int npd){
        super(antecedentConditionName, count, npd);
        System.out.println(this.getClass().getName()+" created. " +antecedentConditionName+ " has recommended "+recommendedNeedValue()+ " need value per day.");
    }
    public int recommendedNeedValue() {
        return DEFAULT_RECOMMENDED_NEED_VALUE+2;
    }
    public boolean does_expire(){
        return expired;
    }
}