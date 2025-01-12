public class energy extends physicalHomeostasis {
    private boolean expired = false; 
    public energy(String energyName){
        super(energyName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEED_VALUE);
    }
    public energy(String energyName, int count, int npd){
        super(energyName, count, npd);
        System.out.println(this.getClass().getName()+" created. " +energyName+ " has recommended "+recommendedNeedValue()+ " need value per day.");
    }
    public int recommendedNeedValue() {
        return DEFAULT_RECOMMENDED_NEED_VALUE+2;
    }
    public boolean does_expire(){
        return expired;
    }
}