package users;

public class Doctor extends Personel implements TransferObserver{

    private boolean isPacientReady = false;

    @Override
    public void update() {
        this.isPacientReady = true;
    }

    public Doctor(String name) {
        super(name);
    }

    public boolean getIsPacientReady() {
        return this.isPacientReady;
    }

    public void setIsPacientReady(boolean isPacientReady) {
        this.isPacientReady = isPacientReady;
    }
    
}