public interface Recommended{
    public static final int DEFAULT_COUNT = 1;                  \\tentative
    public static final int DEFAULT_RECOMMENDED_NEED_VALUE = 2;
    public int recommendedNeedValue ();
    //public int date();
    public boolean does_expire(); 
}