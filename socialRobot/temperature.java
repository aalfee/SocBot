public class temperature extends homeostasis {
    private boolean expired = false; 
    public temperature(String temperatureName){
        super(temperatureName, Recommended.DEFAULT_COUNT, Recommended.DEFAULT_RECOMMENDED_NEEDVALUE);
    }
    public temperature(String temperatureName, int count, int npd){
        super(temperatureName, count, npd);
        System.out.println(this.getClass().getName()+" created. " +temperatureName+ " has recommended "+)
    }
}