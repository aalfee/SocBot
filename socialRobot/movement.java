public class movement extends behavioralHomeostasis {
    private boolean expired = false; 
    public movement(String behaviorFunctionName){
        super(behaviorFunctionName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEEDVALUE);
    }
    public movement(String behaviorFunctionName, int count, int npd){
        super(behaviorFunctionName, count, npd);
        System.out.println(this.getClass().getName()+" created. " +temperatureName+ " has recommended "+recommendedNeedValue()+ " need value per day.");
    }
    public int recommendedNeedValue() {
        return DEFAULT_RECOMMENDED_NEED_VALUE+2;
    }
    public boolean does_expire(){
        return expired;
    }
}