public abstract class behavioralHomeostasis extends motivation implements Recommended {
    protected int needValue_per_day;
    
    public behavioralHomeostasis(String name, int count, int npd){
        super(name, count);
        if(npd < 0) throw new IllegalArgumentException("needValue per day cannot be negative");
        else needValue_per_day = npd;
        }
    public String toString(){
        return this.getClass().getName();
    }
}

