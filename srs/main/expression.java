public abstract class expression {
    private String voice = "";
    private String face = "";
    //String protected gesture;
    //String protected posture;
    
// public create abstract object expression
public expression(String v, String f){
    voice = v;
    face = f;

    }

    // get methods
public String getVoice() {
    return this.voice;
}
public String getFace() {
    return this.face;
}
/*public String getGesture() {
    return this.gesture;
}
public String getPosture() {
    return this.gesture;
}
    */

    // set methods
public void setVoice(String v) {
    this.voice = v;
}
public void setFace(String f) {
    this.face = f;
}
/* 
public void setGesture(String g) {
    this.gesture = g;
}
public void setPosture(String p) {
    this.posture = p;
}*/
}