public class fluids extends physicalHomeostasis {
    private boolean expired = false; 
    public fluids(String fluidsName){
        super(fluidsName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEED_VALUE);
    }
    public fluids(String fluidsName, int count, int npd){
        super(fluidsName, count, npd);
        System.out.println(this.getClass().getName()+" created. " +fluidsName+ " has recommended "+recommendedNeedValue()+ " need value per day.");
    }
    public int recommendedNeedValue() {
        return DEFAULT_RECOMMENDED_NEED_VALUE+2;
    }
    public boolean does_expire(){
        return expired;
    }
}