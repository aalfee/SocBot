public abstract class motivation {
        String motiveType;
        int needValue;
    public motivation (String s, int v){
            if(s == null || s == "") throw new IllegalArgumentException("s must not be null");
            if(v < 0) throw new IllegalArgumentException("v must be positive");
            motiveType=s;
            needValue=v;
            System.out.println(v+" new "+motiveType+" added");
    }
}