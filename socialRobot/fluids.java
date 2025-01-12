public class fluids extends homeostasis {
    private boolean expired = false; 
    public fluids(String fluidsName){
        super(temperatureName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEEDVALUE);
    }
    public fluids(String fluidsName, int count, int npd){
        super(temperatureName, count, npd);
        System.out.println(this.getClass().getName()+" created. " +temperatureName+ " has recommended "+recommendedNeedValue()+ " need value per day.");
    }
    public int recommendedNeedValue() {
        return DEFAULT_RECOMMENDED_NEED_VALUE+2;
    }
    public boolean does_expire(){
        return expired;
    }
}