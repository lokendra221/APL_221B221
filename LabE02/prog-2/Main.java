package voicesystem;

public class Main {
    public static void main(String[] args) {
        Voice2 voiceSystem = new Voice2();
        voiceSystem.templateMethod(); // Calls prepareVoice() and hear() in the correct order
    }
}
