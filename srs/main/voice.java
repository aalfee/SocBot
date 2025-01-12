public class voice {
    float voiceVolume = 0.0f; // default 0 when not talking
    float voicePitch = 0.5f; //default pitch in the middle when not talking   
    int voiceSpeed = 1; // default 1 when not talking

public voice(float volume, float pitch, int speed){
    this.voiceVolume = volume;
    this.voicePitch = pitch;
    this.voiceSpeed = speed;
}

public voice(float volume, float pitch){
    this.voiceVolume = volume;
    this.voicePitch = pitch;
    this.voiceSpeed = 1;
}
public voice(float volume){
    this.voiceVolume = volume;
    this.voicePitch = 0.5f;
    this.voiceSpeed = 1;
}

public float getVoiceVolume() {
    return this.voiceVolume;
}
public float getVoicePitch() {
    return this.voicePitch;
}
public int getVoiceSpeed() {
    return this.voiceSpeed;
}

    // set methods
public void setVoiceVolume(float v) {
    this.voiceVolume = v;
}
public void setFace(float p) {
    this.voicePitch = p;
}
public void setVoiceSpeed(int s) {
    this.voiceSpeed = s;
}

}