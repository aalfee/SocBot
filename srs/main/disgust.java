public class disgust extends emotion {
    private boolean expired = false; 
    public disgust(String antecedentConditionName){
        super(antecedentConditionName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEED_VALUE);
    }
    public disgust(String antecedentConditionName, int count, int npd){
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