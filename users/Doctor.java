package users;

public class Doctor extends Personel implements TransferObserver{

    private boolean isPacientReady = false;

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void update() {
        this.isPacientReady = true;
    }

    public boolean getIsPacientReady() {
        return this.isPacientReady;
    }

    public void setIsPacientReady(boolean isPacientReady) {
        this.isPacientReady = isPacientReady;
    }
    
}