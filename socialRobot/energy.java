public class energy extends homeostasis {
    private boolean expired = false; 
    public energy(String temperatureName){
        super(temperatureName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEEDVALUE);
    }
    public energy(String temperatureName, int count, int npd){
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