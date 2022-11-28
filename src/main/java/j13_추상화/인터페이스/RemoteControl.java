package j13_추상화.인터페이스;

public class RemoteControl {

    private PowerButton powerButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public RemoteControl(PowerButton powerButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton(){
        powerButton.onPressd();

    }

    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressd();

    }

    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressd();

    }

    public void onDownVolumeUpButton(){
        volumeUpButton.onDown();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
}
