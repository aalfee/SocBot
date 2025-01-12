public class face {
    private float eyebrowLocation = 0.5f; // default 0.5f
    private float eyelidLocation = 1.0f; //default eyelid fully open   
    private float lipCornerLocation = 0.5f; // default 0.5f
    private float lipCenterLocation = 0.5f; // default 0.5f

public face(float eyebrow, float eyelid, float corner, float center){
    this.eyebrowLocation = eyebrow;
    this.eyelidLocation = eyelid;
    this.lipCornerLocation = corner;
    this.lipCenterLocation = center;;
}

public face(float eyebrow, float eyelid, float corner){
    this.eyebrowLocation = eyebrow;
    this.eyelidLocation = eyelid;
    this.lipCornerLocation = corner;
    this.lipCenterLocation = 0.5f;
}
public face(float eyebrow, float eyelid){
    this.eyebrowLocation = eyebrow;
    this.eyelidLocation = eyelid;
    this.lipCornerLocation = 0.5f;
    this.lipCenterLocation = 0.5f;
}

public float getEyebrowLocation() {
    return this.eyebrowLocation;
}
public float getEyelidLocation() {
    return this.eyelidLocation;
}
public float getLipCornerLocation() {
    return this.lipCornerLocation;
}
public float getLipCenterLocation(){
    return this.lipCenterLocation;
}

    // set methods
public void setEyebrowLocation(float brow) {
    this.eyebrowLocation = brow;
}
public void setEyelidLocation(float lid) {
    this.eyelidLocation = lid;
}
public void setLipCornerLocation(float corner) {
    this.lipCornerLocation = corner;
}
public void setLipCenterLocation(float center){
    this.lipCenterLocation = center;
}

}